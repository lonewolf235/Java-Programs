import java.util.*;

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        while (sc.hasNext()) {
            a.add(sc.next());
        }
        for (String s : a) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
                    c++;
                else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                    c--;
                else
                    continue;
            }
            if (c == 0)
                System.out.println("true");
            else
                System.out.println("false");

        }
    }

}
