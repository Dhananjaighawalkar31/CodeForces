import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(n, arr));
        }
    }

    public static int solve(int n, int[] arr) {

        for(int i = 0;i<n-1;i++) {
        	if(arr[i]>arr[i+1]) {
        		return 0;
        	}
        }
        int min = arr[1]-arr[0];
        for(int i = 1;i<n;i++) {
        	min = Math.min(min, arr[i]-arr[i-1]);
        }
        
        return min/2 + 1;
    }
}