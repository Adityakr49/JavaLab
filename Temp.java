package CodeWithHarry.Lab;
import  java.lang.System;
import java.util.Scanner;

class Record {
    Scanner sc = new Scanner(System.in);
    double[] Temperature = new double[6];
    String cityname;

    void read() {
        System.out.println("Enter the name of the city");
        this.cityname = sc.nextLine();
        System.out.println("Enter the temp of city On");
        for (int i = 0; i < 6; i++) {
            System.out.println("Jan " + (i + 1) + ": ");
            this.Temperature[i] = sc.nextDouble();
        }
    }

    void disp() {
        System.out.println("City Name: " + cityname);
        System.out.println("Temp Recorded:");
        for (int i = 0; i < 6; i++) {
            System.out.println(Temperature[i] + "\t");
        }
        System.out.println("");
    }

    void HLTemp() {
        double max = Temperature[0], min = Temperature[0];
        int d1 = 0, d2 = 0;
        for (int i = 0; i < 6; i++) {
            d1++;
            if (Temperature[i] > max) {
                max = Temperature[i];
            }
            if (Temperature[i] < min) {
                d2++;
                min = Temperature[i];
            }
        }
        System.out.println("Highest temp\n Jan: " + d1 + " \t" + max + "Degree Celcius");
        System.out.println("Lowest temp\n Jan: " + d2 + " \t" + min + "Degree Celcius");
    }
}

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Record[] city = new Record[5];
        for (int i = 0; i < 5; i++) {
            city[i] = new Record();
        }
        while (1 < 2) {
            System.out.println("Enter the city No");
            int no = sc.nextInt();
            if (no>5)
            {
                System.exit(0);
            }
            no--;
            System.out.println("Choices Available\n1.Read\n2.Display\n3.High and Low est Temp");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    city[no].read();
                    break;
                case 2:
                    city[no].disp();
                    break;
                case 3:
                    city[no].HLTemp();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
