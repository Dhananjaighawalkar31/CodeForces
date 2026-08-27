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

    public static String solve(int n, int[] arr) {
    	if(arr[0] == n || arr[n-1] == n) {
    		return "NO";
    	}

            	
    	
        return "YES";
    }
}