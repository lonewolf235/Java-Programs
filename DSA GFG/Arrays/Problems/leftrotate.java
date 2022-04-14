import java.util.*;

public class leftrotate {
    public static void reverse(int low, int high, ArrayList<Integer> list) {
        while (low < high) {
            Collections.swap(list, low, high);
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: \n");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter array elements\n");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Enter value of d for rotations\n");
        int d = sc.nextInt();
        d = d % n;
        reverse(0, d - 1, al);
        reverse(d, n - 1, al);
        reverse(0, n - 1, al);
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
