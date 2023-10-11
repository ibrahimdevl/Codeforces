import java.io.IOException;
import java.util.Scanner;

// link: https://codeforces.com/problemset/problem/1873/D
public class D1Eraser {
    public static void main(String args[]) throws IOException {
        int n, t, k;
        Scanner myInput = new Scanner( System.in );
        t = myInput.nextInt();

        char s [];
        while (t-- >= 1) {
            n = myInput.nextInt();
            k = myInput.nextInt();
            s = myInput.next().toCharArray();
            int minTimes = 0;
            for(int i=0; i<n;) {
                if(s[i] == 'B') {
                    minTimes++;
                    i += k;
                } else i++;
            }

            System.out.print(minTimes + "\n");

        }
    }
}
