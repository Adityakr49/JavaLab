package CodeWithHarry.Lab;
import java.util.Scanner;
public class Election {
    public static void main(String X[])
    {
        Scanner sc=new Scanner(System.in);
        int [] cand={0,0,0,0,0};
        int ballot=0;
        int ch=0;
        do
        {
            System.out.println("1.Candidate 1\n2.Candidate 2\n3.Candidate 3\n4.Candidate 4\n5.Candidate 5\n0.Results");
            ch=sc.nextInt();
            switch(ch){
                case 1:cand[0]++;
                    break;
                case 2:cand[1]++;
                    break;
                case 3:cand[2]++;
                    break;
                case 4:cand[3]++;
                    break;
                case 5:cand[4]++;
                    break;
                default:
                    ballot++;
                    break;
            }
        }while (ch!=0);
        System.out.println("-----Results-----");
        System.out.println("Candidate 1: "+cand[0]+"\nCandidate 2: "+cand[1]+"\nCandidate 3: "+cand[2]+"\nCandidate 4: "+cand[3]+"\nCandidate 5: "+cand[4]+"\nBallot: "+(ballot-1));
    }
}
