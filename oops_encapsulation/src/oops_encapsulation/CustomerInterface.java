package oops_encapsulation;
import java.util.Scanner;

public class CustomerInterface {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========WALMART SHOP========");
		
		System.out.println("Enter a customerId: ");
        int CId = sc.nextInt();
        
        System.out.println("Enter a customerName: ");
        String CName = sc.nextLine();
        
        sc.next();
        
        System.out.println("Enter a customermobileNumber: ");
        long CmobileNum = sc.nextLong();
        
        System.out.println("Enter a customercity: ");
        String CCity = sc.nextLine();
        
        sc.next();
        
        System.out.println("----------Product Details-----------");
        
        System.out.println("Enter a productId: ");
        int PId = sc.nextInt();
        
        System.out.println("Enter a productName: ");
        String PName = sc.nextLine();
        
        sc.next();
        
        System.out.println("Enter a productPrice: ");
        long PPrice = sc.nextLong();
        
        System.out.println("Enter a productQuantity: ");
        int quantity = sc.nextInt();
        
        
        Customer customer = new Customer(CId, CName, CmobileNum, CCity);
        Product product = new Product(PId, PName, PPrice, quantity);

        
        double totalAmount = PPrice * quantity;
        
        System.out.println("totalAmount" + totalAmount);
        
	}

}
