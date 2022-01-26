import java.util.*;

public class jokerbatman {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int n, m, l, stripcol = 0;
                n = sc.nextInt();
                m = sc.nextInt();
                l = sc.nextInt();
                HashMap<Integer, Integer> mp = new HashMap<>();
                int count = 1, extra = 0;
                int sizeoflist[] = new int[m];
                for (int i = 0; i < m; i++) {
                    int k = sc.nextInt();
                    int ar[] = new int[k];
                    for (int x = 0; x < k; x++) {
                        ar[x] = sc.nextInt();
                        mp.put(ar[x], count++);
                    }
                    sizeoflist[i] = k + extra;
                    extra = sizeoflist[i];
                }
                int larr[] = new int[l];
                for (int i = 0; i < l; i++) {
                    larr[i] = sc.nextInt();
                }
                for (int i = 0; i < l; i++) {
                    if (i == 0)
                        stripcol++;
                    else {
                        int key = mp.get(larr[i]);
                        int keyprev = mp.get(larr[i - 1]);
                        for (int x = 0; x < sizeoflist.length; x++) {
                            if (key <= sizeoflist[x] && (keyprev <= sizeoflist[x]))
                                continue;
                            else if (key > sizeoflist[x] && (keyprev > sizeoflist[x]))
                                continue;
                            else {
                                stripcol++;
                                break;
                            }
                        }

                    }
                }

                System.out.println(stripcol);

            }
        } catch (Exception e) {
            return;
        }
    }
}