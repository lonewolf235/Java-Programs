import java.util.*;

public class codevita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        String[] lines = s.split(" ");
        // System.out.println(Arrays.toString(lines));
        int l = lines.length;
        int[] affinity = new int[l];
        for (int i = 0; i < l; i++) {
            if (lines[i].length() == 1)
                affinity[i] = (int) lines[i].charAt(0) - 55;
            else {
                int val = ((int) lines[i].charAt(0) - 55) * ((int) lines[i].charAt(1) - 60)
                        + ((int) lines[i].charAt(1) - 61);
                affinity[i] = val;
            }
        }
        int max = 1;
        for (int i = 0; i < affinity.length; i++) {
            for (int j = 1; j < affinity.length; j++) {
                if (i == j||lines[i]==lines[j]) 
                    continue;
                else
                    max = Math.max(max, gcd(affinity[i], affinity[j]));
            }
        }
        System.out.println(max);
    }

    public static int gcd(int a, int b) {
        int c = Math.min(a, b);
        while (b > 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return c;
    }
}
