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

			solve(n, arr);
		}
	}

	public static void solve(int n, int[] arr) {
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		Arrays.sort(arr);
		int max = arr[n-1];
		for(int i = 0;i<n;i++) {

			if(arr[i]==max) {

				c.add(arr[i]);
			}else {

				b.add(arr[i]);
			}


		}
		if(b.size() == 0 || c.size() == 0) {
			System.out.println(-1);
		}else {
			
			System.out.println(b.size() + " " + c.size());
			for(int num : b) {
				System.out.print(num + " ");
			}
			System.out.println();
			for(int num : c) {
				System.out.print(num + " ");
			}
			System.out.println();

		}
	}
}