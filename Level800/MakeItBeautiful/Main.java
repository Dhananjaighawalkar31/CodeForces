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

        int same = a[0];
        int j = 1;
        while(j<n) {
        	if(a[j] != same) {
        		break;
        	}
        	j++;
        }
        if(j == n) {
        	System.out.println("NO");
        	return;
        }
        int maxi = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++) {
        	if(a[i]>max) {
        		max = a[i];
        		maxi = i;
        	}
        }
        if(maxi == 0) {
        	System.out.println("YES");
        	for (int num : a) {
        	    System.out.print(num + " ");
        	}
        	System.out.println();
        	return;

        }
        int temp = a[maxi];
        a[maxi] = a[0];
        a[0] = temp;
        System.out.println("YES");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}