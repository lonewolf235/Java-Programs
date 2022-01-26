import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ceilsum
{
static class FastReader
{
BufferedReader br;
StringTokenizer st;
public FastReader()
{
br = new BufferedReader(new
InputStreamReader(System.in));
}
String next()
{
while (st == null || !st.hasMoreElements())
{
try
{
st = new StringTokenizer(br.readLine());
}
catch (IOException e)
{
e.printStackTrace();
}
}
return st.nextToken();
}
int nextInt()
{
return Integer.parseInt(next());
}
long nextLong()
{
return Long.parseLong(next());
}
double nextDouble()
{
return Double.parseDouble(next());
}
String nextLine()
{
String str = "";
try
{
str = br.readLine();
}
catch (IOException e)
{
e.printStackTrace();
}
return str;
}
}
public static void main(String[] args)
{try{
FastReader sc=new FastReader();
        
          
          int t = sc.nextInt();
          for (int j = 0; j < t; j++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int lowerlim= Math.min(a, b);
            int upperlim=Math.max(a,b);
            int maxvalue=Integer.MIN_VALUE;
            if(a==b)
            System.out.println("0");
            else{
            for(int i=(lowerlim+upperlim/2)-1; i<=(lowerlim+upperlim/2)+1; i++) {
                int res= (int)Math.ceil((b-i)/2.0) + (int)Math.ceil((i-a)/2.0);
                maxvalue=Math.max(maxvalue,res);
            } 
            System.out.println(maxvalue);}}
        } catch (Exception e){
            return;
        }
    }
}
