import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tax, end;
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if (n > 1000000) {
				tax = n / 4;
				end = n % 4;
				if (end >= 2)
					System.out.println(tax + 1);
				else
					System.out.println(tax);
			} else if (n > 100000) {
				tax = n / 5;
				end = n % 5;
				if (end > 2)
					System.out.println(tax + 1);
				else
					System.out.println(tax);

			} else if (n > 1000) {
				tax = n / 10;
				end = n % 10;
				if (end >= 5)
					System.out.println(tax + 1);
				else
					System.out.println(tax);

			} else
				System.out.println("0");
		}
	}
}
