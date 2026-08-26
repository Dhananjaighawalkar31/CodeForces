import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(solve(n, s));
        }
    }
/**
    public static int solve(int n, String s) {

        int k = s.length();
        String str = "...";
        
        for(int i = 0;i+3<=k;i++) {
        	String substr = s.substring(i,i+3);
        	if(str.equals(substr)) {
        		return 2;
        	}
        }
        int c = 0;
        for(char ch : s.toCharArray()) {
        	if(ch == '.') {
        		c++;
        	}
        }
        

        return c;
    }
    **/
    public static int solve(String s) {
        if (s.contains("...")) return 2;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '.') c++;
        }
        return c;
    }
}