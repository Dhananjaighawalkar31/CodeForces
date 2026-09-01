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

            solve(n, a);
        }

        sc.close();
    }

    public static void solve(int n, int[] a) {
    	int b[] = new int[n];
    	for(int i = 0; i<n;i++) {
    		b[i] = n+1-a[i];
    	}
        for(int num : b) {
        	System.out.print(num + " ");
        }
        System.out.println();
    }
}