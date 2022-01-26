import java.util.*;

public class cc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
               int a=sc.nextInt();
               int b=sc.nextInt();
               int c=sc.nextInt();
               if((a-b==1&&b-c==1)||(c-b==1&&b-a==1)) 
               System.out.println("YES");
               else if((a==1&&b!=1&&c!=1)||(a!=1&&b==1&&c!=1)||(a!=1&&b!=1&&c==1))
               System.out.println("YES");
               else if((Math.abs(a-b)==1||Math.abs(b-c)==1||Math.abs(a-c)==1))
               System.out.println("NO");
               else
               System.out.println("YES");
            }

        } catch (Exception e) {
            return;
        }

    }

}
