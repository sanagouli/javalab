import java.util.Scanner;
class cube
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n;
    System.out.print("enter the value of n=");
    n=s.nextInt();
    int res=n*n*n;
    System.out.println("cube of "+n+"="+res);
  }
}