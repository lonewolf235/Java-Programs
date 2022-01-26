import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beautifulpair {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();

            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int ar[] = new int[n];
                for (int i = 0; i < n; i++)
                    ar[i] = sc.nextInt();
                int bp = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j)
                            continue;
                        float lh = (float) (ar[i] - ar[j]) / ar[i];
                        float rh = (float) (ar[i] - ar[j]) / ar[j];
                        if (lh < rh)
                            bp++;
                    }
                }
                System.out.println(bp);
                // HashMap<Integer, Integer> mp = new HashMap<>();
                // for (int i = 0; i <n;i++){
                // if(mp.containsKey(ar[i]))
                // mp. put(ar[i], mp. get(ar[i]) + 1);
                // else
                // mp.put(ar[i],1);
                // }
                // Set set = mp.entrySet();
                // int fullsize=0;
                // // Get an iterator
                // Iterator i = set.iterator();
                // // Display elements
                // while(i.hasNext()) {
                // Map.Entry me = (Map.Entry)i.next();
                // fullsize=fullsize+ (int)me.getValue();
                // }
                // int repeatsize=fullsize-mp.size();
                // int
                // ans=(factorial(fullsize)/(factorial(fullsize-2)))-factorial(repeatsize+1)/factorial(repeatsize-1);
                // System.out.println(ans);
                // System.out.println(fullsize);
                // System.out.println(repeatsize);
            }
        } catch (Exception e) {
            return;
        }
    }
    // public static int factorial(int n) {// 3
    // int fact = 1;
    // if (n == 0)
    // return fact;
    // else {
    // for (int i = 1; i <= n; i++) {
    // fact *= i;
    // }
    // return fact;
    // }
    // }
}