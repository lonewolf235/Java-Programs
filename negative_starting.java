import java.util.*;

public class negative_starting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c = 0, temp;
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp = arr[i];
				arr[i] = arr[c];
				arr[c] = temp;
				c++;
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
