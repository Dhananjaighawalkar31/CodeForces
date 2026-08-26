import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(n, x, arr));
        }
    }

    public static int solve(int n, int x, int[] arr) {

    	int max = arr[0];
    	for(int i = 0;i<n-1;i++) {
    		max = Math.max(max, arr[i+1]-arr[i]);
    	}
        return Math.max(max, 2*(x-arr[n-1]));
    }
}