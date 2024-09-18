import java.util.*;
class Swap
{
  public static void main(String args[])
  {
    int a,b;
    Scanner s=new Scanner(System.in);
   
    System.out.println("enter the a value=");
    a=s.nextInt();
    System.out.println("enter the b value=");
    b=s.nextInt();
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping a value="+a);
    System.out.println("After swapping b value="+b);
  }
}
  