import java.util.*;
class pattern6
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int i,n,k,j;
      System.out.println("enter the value of n");
      n=sc.nextInt();
     
        for(i=69;i>=65;i--)
	{
		for(j=65;j<i;j++)
		{
			System.out.print(" ");
		}
		for(k=69;k>=i;k--)
                {
			System.out.print((char)i);
		}
		System.out.println();
	}		
   }
}
