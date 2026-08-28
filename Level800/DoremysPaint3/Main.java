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

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++) {
        	map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size() == 1) {[]
        	return "YES";
        }
        if(map.size() >2) {
        	return "NO";
        }
        int first = 0;
        int second = 0;
        for(Map.Entry<Integer, Integer> key : map.entrySet()) {
        	if(first == 0) {
        		first = key.getValue();
        	}else {
        		second = key.getValue();
        	}
        }
        if(Math.abs(first-second)<=1) {
        	return "YES";
        }
        return "NO";
    }
}