import java.util.*;
class maximum
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value of a=");
    a=s.nextInt();
    System.out.println("enter the value of b=");
    b=s.nextInt();
    System.out.println("enter the value of c=");
    c=s.nextInt();
    if((a>b)&&(a>c))
    {
       System.out.println(a+"a is maximun");
    }
    else if((b>a)&&(b>c))
    {
       System.out.println(b+"b is maximun"); 
    }
    else
    {
       System.out.println(c+"c is maximum");
    }
  }
}

