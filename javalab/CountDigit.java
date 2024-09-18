//count the number of digit of an integer
import java.util.Scanner;
public class CountDigit{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println("total digits int the given number are:"+count);
	}
}