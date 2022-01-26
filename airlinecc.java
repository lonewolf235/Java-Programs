import java.util.*;
public class airlinecc {// 1st question of september long challenge 21.
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a,b,c,d,e;
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                d=sc.nextInt();
                e=sc.nextInt();
                if((a+b<=d&&c<=e)||(a+c<=d&&b<=e)||(c+b<=d&&a<=e))
                System.out.println("YES");
                else
                System.out.println("NO");

            }
        } catch (Exception e) {
            return;
        }
    }
}
