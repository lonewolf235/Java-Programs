import java.util.*;

public class medals {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int x = sc.nextInt();
                int ar[] = new int[n];
                int ar1[] = new int[n];
                for (int k = 0; k< n; k++) {
                    ar[k] = sc.nextInt();
                }
                ar1 = ar;
                Arrays.sort(ar);
                int i=n-1;
                ArrayList<Integer> al = new ArrayList<Integer>();
                for (; i >= 0; i--) {
                    if (ar[i] >= m)
                        al.add(ar[i]);
                    if (ar[i] < m)
                        break;
                }
                System.out.println(al.size());
                int p=x-al.size();
                if (p>0 && i <= 0) {
                   while(p-->0) {
                        al.add(ar[i]);
                        i--;
                    }
                }
                int arf[] = new int[al.size()];
                for (int k = 0; k < al.size(); k++) {
                    int a = al.get(k);
                    for (int ki = 0; ki < n; ki++) {
                        if (ar1[ki] == a) {
                            arf[k] = ki;
                            break;
                        }
                    }
                }
                System.out.print(al.size()+" ");
                for(int k=al.size()-1; k>= 0; k--){
                    System.out.print(arf[k]+1+" ");
                }
                System.out.println();
            }

        } catch (

        Exception e) {
            return;
        }
    }

}
