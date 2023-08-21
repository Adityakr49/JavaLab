package CodeWithHarry.Lab;
import java.util.Scanner;
class Pyramid
{
    public static void main(String X[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
//            pyr1(n);
//            pyr2(n);
//            pyr3(n);
//            pyr4(n);
        pyr5(n);
//            pyr6(n);
//            pyr7(n);
    }
    static void pyr1(int n)
    {
        System.out.println("Pyramid Pattern 1");
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
    static void pyr2(int n)
    {
        System.out.println("Pyramid Pattern 2");
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
    static void pyr3(int n)
    {
        System.out.println("Pyramid Pattern 3");
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--)
            {
                System.out.print('*');
            }
            System.out.println("");
        }

    }

    static void pyr4(int n)
    {
        System.out.println("Pyramid Pattern 4");
        for(int i=0;i<n;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--)
            {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    static void pyr5(int n)
    {
        int l=1;
        System.out.println("Pyramid Pattern 5");
        for(int i=n;i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=l;k>0;k--)
            {
                System.out.print('*');
            }
            l+=2;
            System.out.println("");
        }
    }
    static void pyr6(int n)
    {
        int l=2*n-1;
        System.out.println("Pyramid Pattern 6");
        for(int i=n;i>0;i--)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=l;k>0;k--)
            {
                System.out.print('*');
            }
            l-=2;
            System.out.println("");
        }
    }
    static void pyr7(int n)
    {
        int l=1;
        System.out.println("Pyramid Pattern 7");
        for(int i=n;i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=l;k>0;k--)
            {
                System.out.print('*');
            }
            l+=2;
            System.out.println("");
        }
        l-=2;
        for(int i=n;i>0;i--)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=l;k>0;k--)
            {
                System.out.print('*');
            }
            l-=2;
            System.out.println("");
        }
    }
}
