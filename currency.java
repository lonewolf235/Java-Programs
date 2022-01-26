
import java.util.*;
public class currency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++){
            int n= sc.nextInt();
            if(n%3==0)
                System.out.println((n/3)+" "+(n/3));
                else if(n%3==1)
                System.out.println(((n/3)+1)+" "+(n/3));
                else
                System.out.println((n/3)+" "+((n/3)+1));


            }
        }
    }
