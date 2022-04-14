import java.util.*;

public class cf {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int x = sc.nextInt();
                int count = 0;
                if (x - k > 2)
                    System.out.println(-1);
                else {
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr(count++) +" ");
                        if (count == x)
                            count = 0;
                    }
                }
            }
        } catch (Exception e) {
            return;
        }

    }

}