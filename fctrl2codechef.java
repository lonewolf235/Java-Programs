import java.math.BigInteger;
import java.util.*;

public class fctrl2codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            fact(n);
        }
        sc.close();
    }

    public static void fact(int n) {

        BigInteger f = new BigInteger("1"); 
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}
