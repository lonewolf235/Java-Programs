import java.util.*;

public class PALINT { //this is 4th problem of cc long challenge sept21. 
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++)
                    ar[i] = sc.nextInt();
                HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
                for (int i = 0; i < n; i++) {
                    if (h.containsKey(ar[i]))
                        h.put(ar[i], h.get(ar[i]) + 1);
                    else
                        h.put(ar[i], 1);
                }
                int maxequal = 0, minop = Integer.MAX_VALUE;
                for (int i : h.keySet()) {
                    int xor = i ^ x;
                    int sumnos, op;
                    
                    if (h.containsKey(xor)&&x!=0) {
                        sumnos = h.get(xor) + h.get(i);
                        op = Math.min(h.get(xor), h.get(i));
                    } else {
                        sumnos = h.get(i);
                        op = 0;
                    }
                    if (maxequal < sumnos) {
                        maxequal = sumnos;
                        minop = op;
                    }
                    else if(maxequal==sumnos){
                        minop=Math.min(minop,op);
                    }
                    else continue;

                }
                System.out.println(maxequal+" "+minop);
            }
        } catch (Exception e) {
            return;
        }
    }
}
