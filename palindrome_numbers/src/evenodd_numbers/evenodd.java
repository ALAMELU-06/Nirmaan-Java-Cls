package evenodd_numbers;
import java.util.Scanner;
public class evenodd {
	static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}