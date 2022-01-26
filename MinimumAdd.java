import java.util.*;

public class MinimumAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long c = 0;
            long sum = 0, avg = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            long ar[] = new long[n];
            for (int j = 0; j < n; j++) {
                ar[j] = sc.nextLong();
                sum += ar[j];
            }
            avg = sum / n;
            if (avg <= k)
                System.out.println("0");
            else {
                c = sum / (k + 1);
                c = c + 1 - n;
                System.out.println(c);
            }

        }
        sc.close();
    }

}
