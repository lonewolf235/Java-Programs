import java.util.*;

public class pairsumhash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter sum to be evaluated.");
		int sum = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int rem = sum - arr[i];
			if (mp.containsKey(rem)) {
				int count = mp.get(rem);

				for (int j = 0; j < count; j++)
					System.out.print("(" + rem + ", " + arr[i] + ")" + "\n");
			}
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		sc.close();
	}
}
