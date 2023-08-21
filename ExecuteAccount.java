package CodeWithHarry.Lab;
import java.util.Scanner;
import java.util.Random;

class Account {
    Scanner sc = new Scanner(System.in);
    static int x=1001;
    private String Name;
    private int AccNo;
    private String AccTyp;
    private double BalAmt;
    void AssgnVals() {
        System.out.print("Enter your name: ");
        this.Name = sc.nextLine();
        System.out.println("Enter your account type: ");
        System.out.println("Current account....\n" +
                "Savings account. ...\n" +
                "Salary account. ...\n" +
                "Fixed deposit account. ...\n" +
                "Recurring deposit account. ...\n" +
                "NRI accounts");
        this.AccTyp = sc.nextLine();
        System.out.print("Enter your opening balance: ");
        this.BalAmt = sc.nextDouble();

        Random random = new Random();
        this.AccNo = random.nextInt(1000000);
        System.out.println("Your new account number is: " + AccNo);
    }

    void DepositAmt() {
        if (AccNo == 0)
            System.out.println("!You don't have bank account to deposit\nNote:please assign values to create an account");
        else {
            System.out.println("Enter amount to deposit: ");
            int amount = sc.nextInt();
            BalAmt += amount;
            System.out.println("Amount deposited successfully...");
        }
    }

    void WidrwAmt() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (AccNo == 0) {
            System.out.println("!You don't have bank account to credit\nNote:please assign values to create an account");
        } else if (BalAmt > amount) {
            BalAmt -= amount;
            System.out.println("Amount credited successfully...");
        } else
            System.out.println("! Insufficient balance");
    }

    void DispDtls() {
        if (AccNo == 0)
            System.out.println("!You don't have bank account\nNote:please assign values to create an account");
        else {
            System.out.println("Name of the Depositor:" + Name);
            System.out.println("Balance amount       :" + BalAmt);
            System.out.println("Account no           :" + AccNo);
            System.out.println("Account Type:        :" + AccTyp);
        }
    }
}

public class ExecuteAccount {
    public static void main(String[] args) {
        int ch=0;
        System.out.println("::::::::::WELCOME TO ASD BANK::::::::::");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of customers: ");
        int n = scan.nextInt();
        Account newAccount[]= new Account[n];
        for (int i=0;i<n;i++)
        {
            newAccount[i]=new Account();
            newAccount[i].AssgnVals();
        }
        do{
            System.out.print("Enter the customer No:");
            int y=scan.nextInt();
            y--;
            System.out.println("How can i help you?"+"\n1. Deposit amount"+"\n2. Withdraw amount"+"\n3. Account details"+"\n4. Exit");
            System.out.print("Enter your choice: ");
            //newAccount[y].getInput();
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    newAccount[y].DepositAmt();
                    break;
                case 2:
                    newAccount[y].WidrwAmt();
                    break;
                case 3:
                    newAccount[y].DispDtls();
                    break;
                case 4:
                    System.out.println("THANK YOU");
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }while(ch!=4);
    }

}
