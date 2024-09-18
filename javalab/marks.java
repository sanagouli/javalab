import  java.util.*;
class marks
{
  public static void main(String args[])
  {
    int a,b,c,d;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value of a=");
    a=s.nextInt();
    System.out.println("enter the value of b=");
    b=s.nextInt();
    System.out.println("enter the value of c=");
    c=s.nextInt();
    System.out.println("enter the value of d=");
    d=s.nextInt();
    int total=a+b+c+d;
    int avg=total/4;
    if(avg>=90)
    {
      System.out.println("The grade is A");
    }
    else if(avg>=80 && avg<=90)
    {
      System.out.println("The grade is B");
    }
    else if(avg>=70 && avg<=80)
    {
      System.out.println("The grade is c");
    }
     else if(avg>=60 && avg<=70)
    {
      System.out.println("The grade is D");
    }
  else if(avg>=40 && avg<=60)
    {
      System.out.println("The grade is E");
    }
    else
    {
      System.out.println("The grade is F");
    }
 }
}