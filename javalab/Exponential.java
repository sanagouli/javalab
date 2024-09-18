//Exponential of number
import java.util.Scanner;
public class Exponential{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base number:");
		double base=s.nextDouble();
		System.out.println("enter the exponent number:");
		int exponent=s.nextInt();
		double res=1;
		for(int i=0; i<=exponent; i++){
			res*=base;
		}
		System.out.println("Exponential of number:"+res);
	}
}