import java.util.*;

public class dicegame {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = 6 - (x + y);
                if (z == 0) {
                    System.out.println("0");
                } else {
                    double result = z / 6.0;
                    System.out.println(String.format("%.6f", result));
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
