import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                a.add(sc.nextInt());
            }
            al.add(a);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            try {
                System.out.println(al.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
