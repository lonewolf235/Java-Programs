import java.util.*;

public class cf {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int ar[][]=new int[5][5];
            int x=0,y=0;
            for(int i=0; i<5; i++) {
                for(int j=0; j<5; j++) {
                    ar[i][j]=sc.nextInt();
                    if(ar[i][j]==1)
                    {
                        x=i;
                        y=j;
                    }
                }
               
            }
            System.out.println((int)(Math.abs(x-2)+Math.abs(y-2)));
           
        } catch (Exception e) {
            return;
        }

    }

}