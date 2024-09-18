import java.util.Scanner;
public class Eligibility
{
  public static void main(String args[])
  {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of student=");
	int n=s.nextInt();
	int mathmarks[]=new int[n];
        int physicsmarks[]=new int[n];
 	int chemistrymarks[]=new int[n];
	for(int i=0; i<n; i++)
	{
 	   System.out.println("enter the marks of the student="+(i+1));
	   System.out.println("MATHEMATICS=");
	   mathmarks[i]=s.nextInt();
	   System.out.println("PHYSICS=");
	   physicsmarks[i]=s.nextInt();
	   System.out.println("CHEMISTRY=");
	   chemistrymarks[i]=s.nextInt();
	}
	System.out.println("Eligible Students=");
	for(int i=0; i<n; i++)
	{
	   int math=mathmarks[i];
 	   int physics=physicsmarks[i];
	   int chemistry=chemistrymarks[i];
	   int total=math+physics+chemistry;
	   int mathphysicstotal=math+physics;
	   if((math>=60 && physics>=50 && chemistry>=40) && (total>=200 || mathphysicstotal>=150))
	   {
		System.out.println("..........");
		System.out.println("student" +(i+1));
	 	
                System.out.println("Mathematis=" +math); 
	        System.out.println("Chemistry=" +chemistry);
                System.out.println("Physics" +physics);
	   }
	}
	s.close();
   }
}