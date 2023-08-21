package CodeWithHarry.Lab;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        students o1=new students();
        o1.read();
        o1.TotalPrint();
        for (int i=0;i<3;i++) {
            o1.Hm(i+1);
        }
        o1.Tm();
    }
}
class students{
    Scanner sc=new Scanner(System.in);
    int[] Rollno=new int[3];
    int[][] Marks=new int[5][3];
    void read()
    {
        System.out.println("Enter Student Details");
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter Details of Rollno: "+(i+1));
            System.out.println("Marks of Sub 1:");
            Marks[i][0]=sc.nextInt();
            System.out.println("Marks of Sub 2:");
            Marks[i][1]=sc.nextInt();
            System.out.println("Marks of Sub 3:");
            Marks[i][2]=sc.nextInt();
        }
    }
    void TotalPrint()
    {
        int Tm=0;
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 3; j++) {
                Tm += Marks[i][j];
            }
            System.out.println("Total Marks of RollNo: " + (i + 1) + "  is: " + Tm);
        }
    }
    void Hm(int n)
    {
        int x=Marks[0][n-1],j=0;
        for (int i=0;i<5;i++)
        {
            if(Marks[i][n-1]>x)
            {
                x=Marks[i][n-1];
                j=i;
            }
        }
        System.out.println("Highest Marks in subject: "+n+" is: "+x+" Roll No "+j);
    }
    void Tm()
    {
        int Tm=0,x=0,z=0;
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<3;j++)
            {
                Tm=Marks[i][j];
            }
            if(Tm>x) {
                x = Tm;
                z = i;
            }
        }
        System.out.println("Highest Total Marks is: "+Tm+" by Roll No: "+z);
    }
}
