import java.util.*;
class pattern4
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
		}0/
		for(k=65;k<=i;k++)
                {
			System.out.print((char)i);
		}
		System.out.println();
	}		
   }
}