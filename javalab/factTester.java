class fact
{
   int f=1,n=5;
   void fact()
   {
     for(int i=1; i<=n; i++)
     {
       f=f*i;
     }
     System.out.println("factorial of "+n+" is= "+f);
  }
}
class factTester
{
  public static void main(String args[])
  {
    fact f=new fact();
    f.fact();
}
}
