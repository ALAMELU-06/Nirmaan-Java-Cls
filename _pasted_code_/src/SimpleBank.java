import java.util.Scanner;

class SimpleBank {
    public static void main(String[] args) {  
int choice;

        System.out.println("Welcome to Simple Bank!");
            System.out.println("\nMENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            switch (choice) {
                case 1:
                    System.out.println("Your Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    System.out.println("Money Deposited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    System.out.println("Money Withdrawn Successfully!");
                    }
                    break;
}
}