import java.util.*;
class pattern5
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int i,n,k,j;
      System.out.println("enter the value of n");
      n=sc.nextInt();
     
        for(i=65;i<=69;i++)
	{
		for(j=69;j>i;j--)
		{
			System.out.print(" ");
		}
		for(k=65;k<=i;k++)
                {
			System.out.print((char)j);
		}
		System.out.println();
	}		
   }
}