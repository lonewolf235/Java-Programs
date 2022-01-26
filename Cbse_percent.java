
import java.util.*;

public class Cbse_percent {

	public static void main(String[] args) {
		int a, b, c, d, e;
		System.out.println("enter 5 subject numbers out of 100");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		System.out.println("the percentage is:-  " + ((a + b + c + d + e) / 5.0f));
		sc.close();
	}

}
