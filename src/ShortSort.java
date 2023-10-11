import java.util.Scanner;

public class ShortSort {
    public static void main(String args[]){
        int t;
        Scanner myInput = new Scanner( System.in );
        t = myInput.nextInt();
        char s[];
        while (t-- > 0) {
            s = myInput.next().toCharArray();
            if(s[0]=='a' || s[1]=='b' || s[2]=='c'){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }


}
