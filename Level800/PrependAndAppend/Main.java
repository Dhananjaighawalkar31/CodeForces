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

        int i = 0;
        int j = n-1;
        while(i<=j) {
        	char x = s.charAt(i);
        	char y = s.charAt(j);
        	if((x == '1' && y == '0') || (x == '0' && y == '1')) {
        		i++;
        		j--;
        		n -= 2;
        	}
        	else {
        		break;
        	}
        }

        return n;
    }
}