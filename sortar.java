import java.util.*;

public class sortar {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 2, 3, 4, 5, 5, 6 };
		int i;
		for (i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1])
				ar[i] = Integer.MIN_VALUE;
		}
		for (i = 0; i < ar.length; i++) {
			if (ar[i] != Integer.MIN_VALUE)
				System.out.print(ar[i] + "\t");
		}

	}

}
