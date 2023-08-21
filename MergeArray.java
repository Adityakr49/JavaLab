package CodeWithHarry.Lab;
import java.util.Scanner;
public class MergeArray {
    public static int[] mergearray(int[] a,int[] b,int[] c,int n1,int n2)
    {
        int i=0,j=0,k=0;
        while(i<n1&&j<n2)
        {
            if(a[i]<b[j]) {
                c[k++] = a[i++];
            }
            else
                c[k++]=b[j++];
        }
        while (i < n1) {
            c[k++] = a[i++];
        }
        while (j < n2) {
            c[k++] = b[j++];
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter no of elements in Array A and Array B respectively");
        n1= sc.nextInt();
        n2= sc.nextInt();
        int[] A=new int[n1];
        int[] B=new int[n2];
        int[] C=new int[n1+n2];
        System.out.println("Enter elements of Array A");
        for (int i=0;i<n1;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter elements of Array B");
        for (int i=0;i<n2;i++)
        {
            B[i]=sc.nextInt();
        }
        C=mergearray(A,B,C,n1,n2);
        System.out.println("Elements of Array A");
        for (int i=0;i<n1;i++)
        {
            System.out.printf(A[i]+"\t");
        }
        System.out.printf("\n");
        System.out.println("Elements of Array B");
        for (int i=0;i<n2;i++)
        {
            System.out.printf(B[i]+"\t");
        }
        System.out.printf("\n");
        System.out.println("Elements of Merged Array C");
        for (int i=0;i<n1+n2;i++)
        {
            System.out.printf(C[i]+"\t");
        }
    }
}
