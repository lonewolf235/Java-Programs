import java.util.*;

public class ecosystem {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int e = sc.nextInt();
                int k = sc.nextInt();
                int count = 1;
                while (e > 0) {
                    if ((e / k) > 0) {
                        count++;
                    }
                    e = e / k;
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            return;
        }
    }
}