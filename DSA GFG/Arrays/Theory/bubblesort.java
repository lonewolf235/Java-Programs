import java.util.*;

public class bubblesort {
    static void bubbles(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        bubbles(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
