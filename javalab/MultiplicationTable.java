//multiplication table
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to get multiplication table:");
		int n=s.nextInt();
		for(int i=1; i<=10; i++){
			System.out.println(n+ "*" +i+ ":" +n*i);
		}
	}
}