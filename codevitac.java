import java.util.*;

public class codevitac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;
        while (n > 1) {

            n = n - sieve(n);
            steps++;
        }
        steps++;
        System.out.println(steps);
    }

    static int sieve(int n) {
        boolean primenos[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            primenos[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (primenos[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    primenos[i] = false;
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primenos[i] == true)
                count++;
        }
        return count;
    }

}
//Success
