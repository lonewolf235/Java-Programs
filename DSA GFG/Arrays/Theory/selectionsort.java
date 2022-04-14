import java.util.*;

public class selectionsort {
    void selection(int[] arr) {
        int min, pos;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        selectionsort sl = new selectionsort();
        sl.selection(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
