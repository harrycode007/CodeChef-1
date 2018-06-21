package Android;
import java.util.Scanner;

public class cupcakes {
	 
	public static void main(String[]args){
	 
	int t;//Number of test cases
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	while(t!=0){
	int n;//Number of cupcakes
	n=sc.nextInt();
	n/=2;
	System.out.println(n+1);
	t--;
	}
	sc.close();
	}
}
