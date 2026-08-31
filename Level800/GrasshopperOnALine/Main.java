import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();
            int k = sc.nextInt();

            solve(x, k);
        }
    }

    public static void solve(int x, int k) {

        if(x%k != 0 ) {
        	System.out.println(1);
        	System.out.println(x);
        }else {
        	if((x-1) % k != 0) {
        		System.out.println(2);
        		System.out.print(1 + " ");
        		System.out.println(x-1);
        	}
        }
    }
}