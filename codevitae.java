import java.util.*;
public class codevitae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[n];
        Arrays.fill(count, 0);
        for(int i = 0; i < m; i++){
            int node1= sc.nextInt();
            int node2= sc.nextInt();
            count[node1-1] =count[node1-1]+1; 
            count[node2-1] =count[node2-1]+1; 
        }
        Arrays.sort(count);
        int[] weights = new int[n];
        for(int i = 0; i < count.length; i++){
            weights[i] = sc.nextInt();
        }
        Arrays.sort(weights);
        int sum = 0;
        for(int i=weights.length-1; i>=0; i--){
            sum+=count[i]*weights[i];
        }
        System.out.println(sum);
    }
}
//Success