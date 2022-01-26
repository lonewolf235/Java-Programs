
/*import java.io.*;
public class transpose2d {

	public static void main(String[] args)throws IOException
	{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int n,m;
	n=Integer.parseInt(br.readLine());
	m=Integer.parseInt(br.readLine());	
	
		int ar[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				ar[i][j]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ar[j][i]+" ");
			}
		System.out.println();
		
			}
	}

}*/
import java.util.*;

class transpose2d {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.print("\n");
		}

	}
}