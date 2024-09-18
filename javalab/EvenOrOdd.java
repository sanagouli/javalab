import java.util.Scanner;
class EvenOrOdd
{
    void check()
    {
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter the number=\n");
    n=s.nextInt();
    if(n%2==0)
    {
       System.out.println("the number is even");
    }
    else
    {
       System.out.println("The number is odd");
    }
  }
}
	
  