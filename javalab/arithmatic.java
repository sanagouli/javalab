import java.util.Scanner;
public class arithmatic
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int a; int b;
    System.out.print("enter the value of a=");
    a=s.nextInt();
    System.out.print("enter the value of b=");
    b=s.nextInt();
    System.out.print("Addition="+(a+b));
    System.out.print("Substraction="+(a-b));
    System.out.print("Multiplication="+(a*b));
    System.out.print("Division="+(a/b));
  }
}
    