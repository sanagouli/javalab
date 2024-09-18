import java.util.*;
class leapyear
{
  public static void main(String args[])
  {
     int year,leap=0;
     Scanner s=new Scanner(System.in);
     System.out.println("enter teh year=");
     year=s.nextInt();
     if(year%4==0)
     {
       if(year%100!=0 || year%400==0)
       {
         leap=1;
       }
     }
       if(leap==1)
       {
         System.out.println(year+"is a leap year");
       }
       else
       {
         System.out.println(year+"is not a leap year"); 
       }
  }
}