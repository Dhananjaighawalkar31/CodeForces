import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(n, a));
        }

        sc.close();
    }

    public static int solve(int n, int[] a) {

    	int f = 0;
    	for(int i = 0;i<n;i++) {
    		if(a[i] == 2) {
    			f++;
    		}
    	}
    	if(f%2 == 0) {
    		int c = 0;
    		for(int i = 0;i<n;i++) {
    			if(a[i] == 2) {
        			c++;
        			f--;    				
    			}

    			if(c == f) {
    				return i+1;
    			}
    		}
    	}else {
    		return -1;
    	}
        return -1;
    }
}