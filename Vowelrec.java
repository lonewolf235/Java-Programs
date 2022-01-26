import java.io.*;
import java.util.*;

public class Vowelrec {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int k = 0; k < t; k++) {

			String name = br.readLine();
			long l = name.length();
			long count = 0;
			for (int i = 0; i < l; i++) {
				if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
						|| name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E'
						|| name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U') {
					count += (long) ((l - i) * (i + 1));
				}
			}
			System.out.println(count);

		}

	}

}
