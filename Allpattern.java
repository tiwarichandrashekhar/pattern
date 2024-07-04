public class Allpattern {
    public static void main(String[] args) {
        // for(char i='E';i>='A';i--)
        // {
        // for(char j=i;j<='E';j++)
        // {
        // System.out.print( j+" ");
        // }
        // System.out.println();
        // }

        // for (char i = 'E'; i >= 'A'; i--) {
        // for (char j = i; j >= 'A'; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();

        // }

        // for (int i =65 ; i <= 69; i++) {
        // for (int j = i; j >=65; j--) {
        // System.out.print((char)j + " ");
        // }
        // System.out.println();

        // }

        // for (int i =65 ; i <= 69; i++) {
        // for (int j =i; j <=69; j++) {
        // System.out.print((char)j + " ");
        // }
        // System.out.println();

        // }

        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        // for(int j=1;j<=n-i;j++)
        // {
        // System.out.print(" ");

        // }
        // for(int k=i;k>=1;k--)
        // {
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // int n=69;
        // for(int i=65;i<=n;i++)
        // {
        // for(int j=68;j>=i;j--)
        // {
        // System.out.print(" ");

        // }
        // for(int k=65;k<=i;k++)
        // {
        // System.out.print((char)k);
        // }
        // System.out.println();
        // }

        // for(int i=5;i>=1;i--)
        // {
        // for(int j=i;j>=1;j--)
        // {
        // if(i%2==0)
        // {
        // System.out.print(" 2 ");
        // }
        // else{
        // System.out.print(" 1 ");
        // }

        // }
        // System.out.println();
        // }

        // for(int i=1;i<=5;i++)
        // {
        // for(int j=1;j<=5-i;j++)
        // {
        // System.out.print(" ");
        // }
        // for(int k=1;k<=i;k++)
        // {
        // System.out.print("* ");

        // }
        // System.out.println();

        // }
        // for(int p=5-1;p>=1;p--)
        // {
        // for(int j=1;j<=5-p;j++)
        // {
        // System.out.print(" ");
        // }
        // for(int s=p;s>=1;s--)
        // {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        /*
         * int n=4;
         * for (int i = n; i >= 1; i--) {
         * for (int j = i; j >= 1 ; j--) {
         * System.out.print(" ");
         * }
         * for (int k = n; k >=i; k--) {
         * System.out.print(i+" ");
         * 
         * }
         * System.out.println();
         * 
         * }
         * for (int p = 2 ; p <= n; p++) {
         * for (int j = 1; j <= p; j++) {
         * System.out.print(" ");
         * }
         * for (int s = 1; s <= n-p+1; s++) {
         * System.out.print(p+" ");
         * }
         * System.out.println();
         * }
         */

        /*
         * int n=7;
         * for(int i=1 ;i<=n;i++)
         * {
         * for(int j=i;j<n;j++)
         * {
         * System.out.print(" ");
         * }
         * for(int k=1;k<=2*i-1;k++)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * for(int i=n-1;i>=1;i--)
         * {
         * for(int j=i;j<n;j++)
         * {
         * System.out.print(" ");
         * }
         * for(int k=1;k<=2*i-1;k++)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */
        /*
         * int n=7;
         * for (int i = n; i >= 1; i--) {
         * 
         * for (int k = n; k >=i; k--) {
         * System.out.print("* ");
         * 
         * }
         * System.out.println();
         * 
         * }
         * for (int p = 2 ; p <= n; p++) {
         * 
         * for (int s = 1; s <= n-p+1; s++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        /*
         * int n=69;
         * for(int i=65 ;i<=n;i++)
         * {
         * for(int j=i;j<n;j++)
         * {
         * System.out.print(" ");
         * }
         * for(int k=65;k<=i;k++)
         * {
         * System.out.print((char)i+" ");
         * }
         * System.out.println();
         * }
         * for(int i=n-1;i>=65;i--)
         * {
         * for(int j=i;j<n;j++)
         * {
         * System.out.print(" ");
         * }
         * for(int k=65;k<=i;k++)
         * {
         * System.out.print((char)i+" ");
         * }
         * System.out.println();
         * }
         */
        /*
         * int n=4;
         * for(int i=1;i<=n;i++)
         * {
         * for(int j=n;j>=i;j--)
         * {
         * System.out.print(" ");
         * }
         * for(int k=i;k>0;k--)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * for(int i=n-1;i>=1;i--)
         * {
         * for(int j=i;j>=n;j--)
         * {
         * System.out.print(" ");
         * }
         * for(int k=i;k<=n;k++)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */


        /* int n = 7;
        for (int p = 2; p <= n; p++) {

            for (int s = 1; s <= n-p+ 1; s++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int k = n; k >= i; k--) {
                System.out.print("*  ");s

            }
            System.out.println();

        } */
        /* int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n||j==i||j==n-i+1)
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        } */


       /*  int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n||i==4||j==4)
                {
                    System.out.print(" * ");
                }
                else{
                    System.out.print(j+"  ");
                }
            }
            System.out.println();
        } */

        
       /*  int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                    System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1||k==1||k==n||i==n)
                     System.out.print(" * ");
                    else
                    {
                        System.out.print("   ");
                    }
            }
            System.out.println();
        } */

       /*  int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(i==1||i==n||k==1||k==2*i-1)
                     System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */

        /* int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(i==1||i==n||k==1||k==2*i-1)
                     System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  */



        // int x=10;
        // int y=20;
        // int z=(x>y)?(x++):(y--);
        // System.out.println(z);

        /* int n=5,count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+++" ");
            }
            System.out.println();
        } */

        /* int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print(" 0");
                else
                    System.out.print(" 1");
            }
            for(int k=n-i;k>=1;k--)
            {
                System.out.print("    ");
            }
            for(int s=i;s>=1;s--)
            {
                
                if(s%2==0)
                    System.out.print(" 0");
                else
                    System.out.print(" 1");
            }
            System.out.println();
        } */


       /*  int a=24,b=36,c=45,lcm=0,large;

         large=(a>b)?a:((b>c)?b:c);

        for(int i=0;i<large;i++)
        {
            if(large%a==0 && large%b==0 && large%c==0)
            {
                lcm=large;
                break;
            }
            large++;
        }
        System.out.println(lcm); */
        int n=5,s=1,g=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(s+++" ");
            }
            
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(g+++" ");
            }
            
            System.out.println();
        }
        
        
    }

}
