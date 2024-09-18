// natural numbers
import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number=");
		int n=s.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		System.out.println("sum of natural numbers are="+sum);
		s.close();
	}
}