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

//    public static int solve(int n, int[] a) {
//
//    	int max = 0;
//    	for(int i = 0;i<n;i++) {
//    		if(a[i] == 0) {
//    			int c =0;
//    			int j = i;
//    			while(j<n) {
//    				
//    				if(a[j] == 0) {
//    					c++;
//    				}else {
//    					break;
//    				}
//    				j++;
//    			}
//    			max = Math.max(max, c);
//    		}
//    	}
//
//        return max;
//    }
    public static int solve(int n,int[] a) {
    	int c = 0;
    	int max = 0;
    	for(int i = 0;i<n;i++) {
    		if(a[i] == 0) {
    			c++;
    			max = Math.max(max, c);
    		}else {
    			c = 0;
    		}
    	}
    	return max;
    }
}