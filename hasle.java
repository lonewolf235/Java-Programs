
import java.util.HashSet;

public class hasle {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 2, 5, 4, 5, 1 };
		int i;
		HashSet<Integer> hs = new HashSet<>();
		for (i = 0; i < ar.length; i++) {
			hs.add(ar[i]);
		}
		for (int no : hs)
			System.out.print(no + " ");

	}

}
