import java.util.*;
public class satwik {
    public static void main(String[] args) 
    {
        int marks[] = new int[10];
        for (int i = 0; i < args.length; i++) 
        {
            System.out.println("The entered marks is: " + args[i]);
            marks[i] = Integer.parseInt(args[i]);
        }
       
        for (int j = 0; j < 10; j++) 
        {
            if (marks[j] >= 40 && marks[j] <= 50) {
                System.out.println("" + marks[j] + " PASS");
            } else if (marks[j] >= 51 && marks[j] <= 75) {
                System.out.println("" + marks[j] + " MERIT");
            } else if (marks[j] > 75) {
                System.out.println("" + marks[j] + " DISTINCTION");
            } else {
                System.out.println("" + marks[j] + " FAIL");
            }
        }
    }
}