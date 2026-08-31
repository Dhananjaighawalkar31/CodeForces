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

        int sum = 0;
        for(int num : arr) {
        	sum += num;
        }

        return sum % 2 == 0 ? "YES":"NO";
    }
}