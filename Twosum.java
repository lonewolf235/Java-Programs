import java.util.*;

public class Twosum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int t = sc.nextInt();
		System.out.println("The answer is:\n");

		int a[] = twoSum(nums, t);
		for (int i = 0; i < 2; i++) {
			System.out.print(a[i] + ", ");
		}
		sc.close();
	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> mp = new HashMap<>();
		int res[] = { 0, 0 };

		for (int i = 0; i < nums.length; i++) {
			if (mp.containsKey(target - nums[i])) {
				res[1] = i;
				res[0] = mp.get(target - nums[i]);
			}
			mp.put(nums[i], i);
		}
		return res;
	}
}
