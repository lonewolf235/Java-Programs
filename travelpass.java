import java.util.*;
public class travelpass {// 2nd question of september long challenge 21.
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
               int n,a,b;
               n=sc.nextInt();
               a=sc.nextInt();
               b=sc.nextInt();
               int k=0;
               String s=sc.next();
               for(int i=0;i<n;i++) {
                   if(s.charAt(i)=='0')
                   k+=a;
                   else
                   k+=b;
               }
               System.out.println(k);

            }
        } catch (Exception e) {
            return;
        }
    }
}

