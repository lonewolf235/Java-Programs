import java.util.*;

public class cc {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] cat  = new int[n];
                int[] dog = new int[n];
                for (int i = 0; i < cat.length; i++){
                    cat[i]=sc.nextInt();
                }
                for (int i = 0; i < dog.length; i++){
                    dog[i]=sc.nextInt();
                }
                Arrays.sort(cat);
                Arrays.sort(dog);
                for(int i = 0,j=n-1; i < n/2; i++,j--){
                    int temp= dog[i];
                    dog[i]=dog[j];
                    dog[j]=temp;
                }
                int max=0;
                for(int i = 0; i < cat.length; i++){
                    max=Math.max(max, cat[i]+dog[i]);
                }
                System.out.println(max);

            }

        } catch (Exception e) {
            return;
        }

    }

}