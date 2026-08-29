import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            solve(n, b);
        }
    }

    public static void solve(int n, int[] b) {

    	List<Integer> li = new ArrayList<>();
    	li.add(b[0]);
    	for(int i = 1;i<n;i++) {
    		if(b[i-1]>b[i]) {
    			li.add(1);
    			li.add(b[i]);
    		}else {
    			li.add(b[i]);
    		}
    	}
    	System.out.println(li.size());
    	for(int num : li) {
    		System.out.print(num + " ");
    	}
    	System.out.println();
    }
}