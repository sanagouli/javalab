//palindrome program
import java.util.Scanner;
public class palindrome{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=s.nextInt();
		int rev=0;
		int temp=n;
		while(temp!=0){
			int digit=temp%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("reverse number=");
		if(n==rev){
			System.out.println(n+ " is a palindrome number\n");
		}
		else{
			System.out.println(n+ " is not a palindrome number\n");
		
		}
	}
}