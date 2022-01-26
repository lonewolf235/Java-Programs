
import java.util.*;

public class maxminArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n;

		n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		int minv = ar[0];
		int maxv = ar[0];
		for (int i = 1; i < n; i++) {
			if (minv > ar[i])
				minv = ar[i];
			if (maxv < ar[i])
				maxv = ar[i];
		}

		System.out.println("min and max value are " + minv + "  " + maxv);

	}
}
