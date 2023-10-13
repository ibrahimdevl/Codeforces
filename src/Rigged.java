import java.util.Scanner;

// link: https://codeforces.com/problemset/problem/1879/A
public class Rigged {
    public static void main(String args[]) {
        long t, n, s, e, w = 0, max_e_o = 0, max_s_o = 0;
        Scanner myInput = new Scanner(System.in);
        t = myInput.nextInt();




        while (t-- > 0) {
            n = myInput.nextInt();
            int testCase = 1;

                s = myInput.nextLong();
                e = myInput.nextLong();
                max_s_o = s;
                max_e_o = e;
                w = s;
                for(int i = 1; i < n; i++) {
                    s = myInput.nextLong();
                    e = myInput.nextLong();
                    if(s >= max_s_o && e >= max_e_o) {
                        w = -1;
                    }
                }
            System.out.println(w);

        }
        myInput.close();
    }
}