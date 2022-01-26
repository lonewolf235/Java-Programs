import java.util.Scanner;

public class binarynumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        s = dectobin(n);
        int max = 0;
        String ar[] = s.split("0");
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i].length())
                max = ar[i].length();
        }

        System.out.println(max);
    }

    public static String dectobin(int n) {
        String s = "";
        while (n > 0) {
            s += (n % 2);
            n = n / 2;
        }
        return s;
    }
}
