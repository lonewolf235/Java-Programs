import java.util.*;
public class ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int ar1[]=new int[3];
            int ar2[]=new int[3];
int acount=0,bcount=0;
            for (int i = 0; i < 3; i++) {
                ar1[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                ar2[i] = sc.nextInt();
            }
            if(ar1[0]<ar2[0]){
                bcount++;
            }
            else
            acount++;
            if(ar1[1]<ar2[1]){
                bcount++;
            }
            else
            acount++; 
            if(ar1[2]<ar2[2]){
                bcount++;
            }
            else
            acount++;
            if(acount>bcount)
            System.out.println("A");
            else
            System.out.println("B");
}
}}
