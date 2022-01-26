import java.util.Scanner;
import java.util.*;
//Hackerrank problem solving Dynamic Array Problem.
public class dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
        int lastanswer = 0;
        int q = sc.nextInt();
        int[][] arr = new int[q][3];
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++)
                arr[i][j] = sc.nextInt();
            if (arr[i][0] == 1) {
                int idx = (arr[i][1] ^ lastanswer) % n;
                list.get(idx).add(arr[i][2]);
            } else {
                int idx = (arr[i][1] ^ lastanswer) % n;
                lastanswer = list.get(idx).get(arr[i][2] % (list.get(idx).size()));
                System.out.println(lastanswer);
            }
        }

    }
}