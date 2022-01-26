import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class bigdecimal {//Java Big decimal question on hackerrank
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       BigDecimal bd[]=new BigDecimal[n];
        for (int i=0; i<n; i++){
            bd[i]=sc.nextBigDecimal();
        }
        Arrays.sort(bd);
        for(int i=0; i<n; i++)
        System.out.println(bd[i]);
    }
}
