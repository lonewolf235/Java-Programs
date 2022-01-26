import java.util.*;

public class chess {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int ind = 0, eng = 0;
                if (a == 1)
                    ind++;
                else if (a == 2)
                    eng++;
                    if (b == 1)
                    ind++;
                else if (b == 2)
                    eng++;
                    if (c == 1)
                    ind++;
                else if (c == 2)
                    eng++;
                    if (d == 1)
                    ind++;
                else if (d == 2)
                    eng++;
                    if (e == 1)
                    ind++;
                else if (e == 2)
                    eng++;
                    if(ind>eng)
                    System.out.println("INDIA");
                    else if(eng>ind)
                    System.out.println("ENGLAND");
                    else 
                    System.out.println("DRAW");

            }
        } catch (Exception e) {
            return;
        }
    }
}