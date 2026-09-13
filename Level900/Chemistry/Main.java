import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			String s = sc.next();

			System.out.println(solve(n, k, s));
		}

		sc.close();
	}

	public static String solve(int n, int k, String s) {

		int[] freq = new int[26];

		for(int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}

		int c = 0;

		for(int i = 0; i < 26; i++) {
			if(freq[i] % 2 == 1) {
				c++;
			}
		}

		if(k >= c - 1) {
			return "YES";
		}

		return "NO";
	}
}