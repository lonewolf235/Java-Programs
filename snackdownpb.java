import java.util.*;

public class snackdownpb {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = sc.nextInt();
                    ar[i] = ar[i] * (-1);
                }
                Arrays.sort(ar);
                for (int i = 0; i < n; i++) {
                    ar[i] = ar[i] * (-1);
                }
                int x = ar[k - 1];
                int c = 0;
                for (int i = k; i < n; i++) {
                    if (ar[i] == x)
                        c++;
                    else
                        break;
                }
                System.out.println(c + k);
            }
        } catch (Exception e) {
            return;
        }
    }

}