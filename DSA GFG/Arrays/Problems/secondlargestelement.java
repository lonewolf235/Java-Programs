import java.util.*;

public class secondlargestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            al.add(sc.nextInt());
int res=-1;
int largest=al.get(0);
for(int i:al)
{
    if(i>largest){
        res=largest;
        largest=i; 
    }
    if(i<largest&&i>res)
    res=i;
}
System.out.println(res);
    }
}
