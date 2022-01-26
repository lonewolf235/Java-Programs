
//This sample is for fastreader code used for cp.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class chefinvention {
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
                int p = sc.nextInt();
                int k = sc.nextInt();
                int c = 0;
                int temp1 = (n - 1) % k;
                int temp2 = p % k;
                if ((n - 1) % k >= p % k) {
                    c += temp2 * ((n - 1) / k + 1);
                    c += p / k + 1;
                    System.out.println(c);
                } else {
                    c += (temp1+1) * ((n - 1) / k + 1);
                    c += (temp2 - temp1 - 1) * ((n - 1) / k);
                    c += p / k + 1;
                    System.out.println(c);
                }
            }

        } catch (Exception e) {
            return;
        }
    }
}
/*
 * (n-1)%k=t; 4 p%k=t1; 4 for(int i=0;i<n;i++){ if(i%k==t1){ c=c+n/k+1; break;
 * }else if(i<=t) c=c+n/k+1 else break;
 * 
 * 
 * }
 * 
 */