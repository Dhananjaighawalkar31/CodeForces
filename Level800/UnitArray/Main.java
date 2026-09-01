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

        int neg = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg++;
            } else {
                pos++;
            }
        }

        int cost = 0;


        if (neg % 2 == 1) {
            cost += 1;
            neg -= 1;
            pos += 1;
        }


        int sum = pos - neg;
        if (sum < 0) {
            int x = (int) Math.ceil((-sum) / 4.0);
            cost += 2 * x;
        }

        return cost;
    }
}