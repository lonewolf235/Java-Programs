public class functioncp {

    public static void main(String[] args) {

        // System.out.println(ispal(101));
        // System.out.println(countdigits(101));
        // System.out.println(factorial(5));
        // System.out.println(trailingzeroinfactorial(100));
        // System.out.println((int)Math.log10(121)+1); //Used for calculating the digits
        // of a number in a line.(good method)
        System.out.println(gcd(12, 18));
        // System.out.println(lcm(6, 9));
        System.out.println(isprime(5));
        // System.out.println("Prime factors are:");
        // primefactorprint(450);
        alldivisors(194);
        System.out.println(power(3, 10));

    }

    public static boolean ispal(int n) {// 1
        int rev = 0;
        int n1 = n;
        while (n1 > 0) {
            rev = rev * 10 + (n1 % 10);
            n1 = n1 / 10;
        }

        return (rev == n);
    }

    public static int countdigits(int n) {// 2
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int factorial(int n) {// 3
        int fact = 1;
        if (n == 0)
            return fact;
        else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static int trailingzeroinfactorial(int n) {// 4
        int res = 0;
        for (int i = 5; i <= n; i *= 5)
            res += n / i;
        return res;
    }

    public static int gcd(int a, int b) {// 5
        int c = Math.min(a, b);
        while (b > 0) {
            c = b;
            b = a % b;
            a = c;
        }
        return c;
    }

    public static int lcm(int a, int b) {// 6
        return (a * b) / gcd(a, b);
    }

    public static boolean isprime(int n) {// 7
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primefactorprint(int n) {// 8
        if (n == 1)
            return;
        while (n % 2 == 0) {
            System.out.print("2 ");
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.print("3 ");
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            System.out.print(n);
        }
    }

    public static void alldivisors(int n) {// 9
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");

        }
        if (i - (n / i) == 1)
            i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print(n / i + " ");
            }
        }
    }

    public static int power(int x, int n) {// 10

        int t = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                t = x * t;
            }
            x = x * x;
            n = n / 2;

        }
        return t;
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
