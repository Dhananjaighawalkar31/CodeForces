import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            

            System.out.println(solve(n,k,arr));
        }
    }
    public static String solve(int n,int k,int[] arr) {
    	if(k<2) {
    		boolean unsorted = false;
        	for(int i = 0;i<arr.length-1;i++) {
        		if(arr[i] > arr[i+1]) {
        			unsorted = true;
        		}
        	}
        	if(!unsorted ) {
        		return "YES";
        	}
    		return "NO";
    	}
    	
    	return "YES";
    }
}