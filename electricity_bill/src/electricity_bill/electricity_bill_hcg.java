package electricity_bill;
import java.util.Scanner;
public class electricity_bill_hcg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = 0;

        System.out.println("======= Electricity Bill Generation System ==========");
        System.out.println("Enter 1 for House Bill:");
        System.out.println("Enter 2 for Commercial Bill:");
        System.out.println("Enter 3 for Government Bill:");

        int option = sc.nextInt();

        switch (option) {

        case 1:
            System.out.println("Enter House Units:");
            int unithouse = sc.nextInt();

            if (unithouse <= 100) {
                bill = 0;
                System.out.println("the bill is free");            } 
            else if (unithouse <= 250) {
                bill = (unithouse - 100) * 5;
            } 
            else {
                bill = (150 * 5) + (unithouse - 250) * 8;
            }

            System.out.println("Your House Bill Ready");
            System.out.println("Bill Value: " + bill);
            break;

        case 2:
            System.out.println("Enter Commercial Units:");
            int unitcomm = sc.nextInt();

            if (unitcomm <= 100) {
                bill = 0;
                System.out.println("the bill is free");
            } 
            else if (unitcomm <= 250) {
                bill = (unitcomm - 100) * 7;
            } 
            else {
                bill = (150 * 7) + (unitcomm - 250) * 10;
            }

            System.out.println("Your Commercial Bill Ready");
            System.out.println("Bill Value: " + bill);
            break;

        case 3:
            System.out.println("Enter Government Units:");
            int unitgov = sc.nextInt();

            if (unitgov <= 100) {
                bill = 0;
                System.out.println("the bill is free");
            } 
            else if (unitgov <= 250) {
                bill = (unitgov - 100) * 11;
            } 
            else {
                bill = (150 * 11) + (unitgov - 250) * 15;
            }

            System.out.println("Your Government Bill Ready");
            System.out.println("Bill Value: " + bill);
            break;

        default:
            System.out.println("Invalid Option!");
        }
    }
}

	