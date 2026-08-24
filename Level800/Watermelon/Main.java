import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		System.out.print(watermelon(w));
	}
	public static String watermelon(int n){
	    for(int i = 1;i<=n;i++){
	        if((i%2 == 0) &&(n-i)>0 && (n-i)%2 == 0){
	            return "YES";
	        }
	        if(i > n-i){
	            break;
	        }
	    }
	    return "NO";
	}
	
}