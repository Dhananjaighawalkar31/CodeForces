import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(solve(n, s));
        }

        sc.close();
    }

    public static int solve(int n, String s) {

        int c = 1;
        int max = 1;
        for(int i = 1;i<n;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                c++;
            }
            else{
                c = 1;
            }
            max = Math.max(max,c);
        }
        return max+1;
    }
}