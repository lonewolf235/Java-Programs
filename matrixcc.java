import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class matrixcc {
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
                long n = sc.nextLong();
                if (n % 2 == 0) {
                    for (long i = 0; i < n; i++) {
                        for (long j = 0; j < n; j++) {
                            System.out.print(-1 + " ");
                        }
                        System.out.println();
                    }
                } else {
                    for (long i = 0; i < n; i++) {
                        for (long j = 0; j < n; j++) {
                            if (i == j) {
                                System.out.print(-1 + " ");
                            } else
                                System.out.print(1 + " ");

                        }
                        System.out.println();
                    }
                }

            }
        } catch (Exception e) {
            return;
        }
    }

}
//
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    StringBuilder str=new StringBuilder("");
		    if(n%2==0){
		        for(int i=0;i<n;i++)
		            str.append("-1 ");
		      
		        for(int i=0;i<n;i++)
		            System.out.println(str);
		    }
		    
		    else{
		        str.append("-1 ");
		        for(int i=1;i<n;i++)
		            str.append("1 ");
		        System.out.println(str); 
		        int l=str.length();
		        for(int i=1;i<n;i++){
		            str.insert(0,"1 ");
		            System.out.println(str.substring(0,l));
		        }
		    }
		}
	}
}
