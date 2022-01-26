import java.util.HashMap;
import java.util.Scanner;

public class phonebook {// This program is for hackkerrank 30 day code challenge day 8 problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int a = sc.nextInt();
            mp.put(s, a);

        }
        while (sc.hasNext()) {
            String s1 = sc.next();
            if(mp.get(s1)==null)
            System.out.println("Not found");
            else
            System.out.println(s1+"="+mp.get(s1));
        }
    }

}
