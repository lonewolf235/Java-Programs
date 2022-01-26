import java.util.*;

public class counta {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                int sum = (n * (n + 1)) / 2;
                int x = sum - s;
                if (x > 0 && x <= n)
                    System.out.println(x);
                else
                    System.out.println(-1);
            }

        } catch (Exception e) {
            return;
        }

    }

}

