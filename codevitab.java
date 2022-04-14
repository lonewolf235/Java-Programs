import java.util.*;

public class codevitab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextFloat();
        float sumX = 0, sumY = 0;
        int X = Math.min(x, y);
        int Y = Math.max(x, y);

        for (int i = 0; i < Y; i++) {
            if (X - i <= 1)
                sumX += a[i];
            sumY += a[i];
        }

        float Xavg, Yavg;
        int count=0;
        for (int i = Y,j=0; i < n; i++,j++) {
            Xavg = sumX / X;
            Yavg=sumY/Y;
            sumX -= a[j+X-1] + a[i];
            sumY-= a[j] + a[i];
            if(Xavg==Yavg)
             count++;
            //  System.out.println(Xavg);System.out.println(Yavg);
            }
            System.out.println(count);
        }

    }

