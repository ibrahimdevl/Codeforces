import java.util.Scanner;

// link: https://codeforces.com/contest/1881/problem/A
public class DontTryToCount {
    public static void main(String args[]) {
        int t, n, m;
        Scanner myInput = new Scanner( System.in );
        t = myInput.nextInt();

        while (t-- > 0) {
            n = myInput.nextInt();
            m = myInput.nextInt();
            int result = 0;
            StringBuilder s = new StringBuilder(myInput.next());
            StringBuilder ss = new StringBuilder(myInput.next());
            int minOperations = minOperations(s.toString(), ss.toString());
            System.out.println(minOperations);

        }
        myInput.close();
    }
    public static int minOperations(String x, String s) {
        int counter = 0;
        while (!x.contains(s)) {
            x += x;
            counter++;
            if (x.length() > 100) {
                return -1;
            }
        }
        return counter;
    }

}
