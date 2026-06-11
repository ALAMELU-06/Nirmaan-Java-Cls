import java.util.Scanner;

class SimpleBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;  // starting balance
        int choice;

        System.out.println("Welcome to Simple Bank!");

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Money Deposited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Money Withdrawn Successfully!");
                    } else {
                        System.out.println("Not enough balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Visit Again 😊");
                    System.exit(0); // end program

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}