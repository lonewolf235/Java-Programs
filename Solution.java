import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ar[] = new int[m];
			for (int j = 0; j < m; j++)
				ar[j] = sc.nextInt();
			int j = 0;
			while (ar[j] % n != n) {
				n = n - 1;
			}
			System.out.println(n);
		}
	}
	// String s=sc.nextLine();
	// String s1=sc.nextLine();
	// String s2=sc.nextLine();
	//
}
