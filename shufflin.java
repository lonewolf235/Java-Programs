import java.util.*;

public class shufflin {// 3rd problem of sept long challenge 21
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++)
                    ar[i] = sc.nextInt();
                int c = 0;
                int odd = 0, even = 0;
                ArrayList<Integer> a = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int x = ar[i] + i + 1;
                    if (x % 2 != 0)
                        c++;
                    else {
                        a.add(ar[i]);
                        if (ar[i] % 2 == 0)
                            even++;
                        else
                            odd++;
                    }
                }
                int min=Math.min(even,odd);
                System.out.println(c+min+min);
            }
        } catch (Exception e) {
            return;
        }
    }

}
