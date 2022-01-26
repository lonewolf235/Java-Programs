import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class candies {
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
            for (int j = 0; j < t; j++) {
                int n = sc.nextInt();
                int d = sc.nextInt();
                int cand[] = new int[n];
                for (int i = 0; i < n; i++) {
                    cand[i] = sc.nextInt();
                }
                int sweet[]=new int[n];
                for (int i = 0; i < n; i++) {
                    sweet[i] = sc.nextInt();
                }
                

            }

        } catch (Exception e) {
            return;
        }
    }
}