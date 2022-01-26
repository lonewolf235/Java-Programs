import java.util.Scanner;

public class leftrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
            int ar1[]=new int[d];
            for(int i = 0; i < d; i++)
            ar1[i]=ar[i];
            for(int i = d; i < n; i++)
            System.out.print(ar[i]+" ");
            for(int i = 0; i < d; i++)
            System.out.print(ar1[i]+" ");
    }

}
