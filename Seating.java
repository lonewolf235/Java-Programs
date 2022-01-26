import java.io.*;

public class Seating {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int n = s.length();
			int g = 0;
			for (int j = 1; j < n - 1; j++) {
				if (s.charAt(j) == '1') {
					if (s.charAt(j + 1) == '0')
						g++;
					else if (j == n - 2)
						g++;
					else
						continue;

				} else {
					if (j == 1 && s.charAt(j - 1) == '1')
						g++;
					if (j == n - 2 && s.charAt(j + 1) == '1')
						g++;
					else
						continue;
				}
			}
			System.out.println(g);
			System.out.println();
		}

	}
}