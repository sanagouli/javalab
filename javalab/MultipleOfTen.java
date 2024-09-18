//program to print all multiplies of 10
import java.util.Scanner;
public class MultipleOfTen{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start of the interval:");
		int start=s.nextInt();
		System.out.println("enter the end of interval:");
		int end=s.nextInt();
		System.out.println("multiplies of 10 netween start "+start+"to end"+end+":");
		for(int i=start; i<=end; i++){
			if(i%10==0){
				System.out.println(i);
			}
		}
	}
}