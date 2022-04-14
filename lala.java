import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class lala {
    public static int mod = 747474747;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String S[];
        for(int t=0;t<testCase;t++){
            S = br.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int D = Integer.parseInt(S[1]);
            int arr[][] = new int[N+1][D+1];
            for(int n=1;n<=N;n++){
                S = br.readLine().split(" ");
                for(int d=1;d<=D;d++){
                    arr[n][d] = Integer.parseInt(S[d-1]);
                }
            }
            long dis[][] = new long[N+1][N+1];
            long x = 0;
            for(int n=1;n<=N;n++){
                for(int m=n+1;m<=N;m++){
                    x = 0;
                    for(int d=1;d<=D;d++){
                        x +=(long) (arr[n][d]-arr[m][d])*(arr[n][d]-arr[m][d]);  
                    }
                    dis[n][m] = x;
                    dis[m][n] = x;
                }
            }
            
            pw.println(calculate(N, dis));
        }
        pw.close();
    }
    public static long calculate(int N,long[][] dis){
        long ans = 1;
        long d[] = new long[N+1];
        
        boolean flag[] = new boolean[N+1];
        for(int n=1;n<=N;n++){
            int j = 0;
            for(int i=1;i<=N;i++){
                if(flag[i]==false&&(j==0||d[i]>d[j])){
                    j = i;
                }
            }
            flag[j] = true;
            if(n>1){
                if(d[j]<=1){
                    break;
                }
                else{
                    ans = d[j]%mod*ans % mod;
                }
            }
            long dist;
            for(int i=1;i<=N;i++){
                if(flag[i]==false){
                    dist = dis[i][j];
                    if(d[i]<dist){
                        d[i] = dist;
                    }
                }
                
            }
        }
        return ans%mod;
    }
 
}