package CodeWithHarry.Lab;
import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter No of Cubes");
        n=sc.nextInt();
        C CUBE=new C();
        CUBE.read(n);
        CUBE.calculate(n);
    }
}
class C{
    Scanner in = new Scanner(System.in);
    int vol, SA, j=1, k=1;
    int[] a = new int[20];
    void read(int n){
        for(int i=0; i<n; i++){
            System.out.print("Enter the length of side of cube-"+j+" : ");
            a[i] = in.nextInt();
            j++;
        }
    }
    void calculate(int n){
        for(int i=0; i<n;i++){
            vol = a[i]*a[i]*a[i];
            SA = 6*a[i]*a[i];
            System.out.println("Volume of cube-"+k+" = "+vol);
            System.out.println("Surface(outer) area of cube-"+k+" = "+SA);
            k++;
        }
    }
}
