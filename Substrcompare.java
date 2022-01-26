import java.util.Scanner;

public class Substrcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int l = s.length();
        String lowstr = s.substring(0, k);
        String highstr = s.substring(0, k);
        for (int i = 1; i <= l - k; i++) {
            String scheck = s.substring(i, k + i);
            if (scheck.compareTo(lowstr) < 0)
                lowstr = scheck;
            if (scheck.compareTo(highstr) > 0)
                highstr = scheck;

        }
        System.out.println(lowstr);
        System.out.println(highstr);
    }
}
