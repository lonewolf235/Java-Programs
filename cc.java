import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class cc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int a = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                String r = sc.nextLine();
                int count = 0;
                for (int i = 0; i < a; i++) {
                    char c1 = s.charAt(i);
                    char c2 = r.charAt(i);
                    if (c1 != c2)
                        count++;
                }
                if (count % 2 == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }

        catch (Exception e) {
            return;
        }

    }
}