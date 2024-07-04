import java.util.*;
class pattern3
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int i,n,k,j;
      System.out.println("enter the value of n");
      n=sc.nextInt();
     
        for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
                {
			System.out.print("*");
		}
		System.out.println(" ");
	}		
   }
}