import java.util.*;

public class problemset {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int ar[] = new int[4];
                for (int i = 0; i < 4; i++)
                    ar[i] = sc.nextInt();
                    int a=ar[0];
                    int b=ar[1];
                    int c=ar[2];
                    int d=ar[3];
                HashMap<Integer, Integer> mp = new HashMap<>();
                for (int i = 0; i < 4; i++) {

                    if (mp.containsKey(ar[i]))
                        continue;
                    else
                        mp.put(ar[i], 1);
                }
                int size=mp.size();
                if(size==3)
                System.out.println("2");
                else if(size==2){
                    if(a==b&&c==d)
                    System.out.println("2");
                    else if(a==c&&b==d)
                    System.out.println("2");
                    else if(a==d&&b==c)
                    System.out.println("2");
                    else
                System.out.println(size/2);
                }
                else
                System.out.println(size/2);

            }
        } catch (Exception e) {
            return;
        }
    }
}