import java.io.*;

public class revarr {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, temp;
		n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		for (int i = 0, j = n - 1; i <= j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
