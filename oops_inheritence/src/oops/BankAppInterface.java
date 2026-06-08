package oops;
import java.util.Scanner;

public class BankAppInterface {
    
    private static final boolean Active = false;
	static int a = 742689301;
    

    public static void main(String[] args) {
        
        BankApplication obj = new BankApplication();
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        obj.setName(name);
        
       
        System.out.println("Enter a AcctNo: ");
        int AcctNo = sc.nextInt();
        obj.setAcctNo(AcctNo);
        
        
        if (obj.getAcctNo() >= a) {
            System.out.println("Yes acctno validated!");
        } else {
            System.out.println("Please entered valid acctno");
        }

         
        
       
        System.out.println("Enter a Branchname: ");
        String BranchName = sc.nextLine();
        obj.setBranchName(BranchName);
        
        
        if(obj.getBranchName()=="chennai") {
        	System.out.println("Branch is chennai");
        }else {
        	System.out.println("Branch is not chennai");
        }
        
        
        
        System.out.println("Enter a phno: ");
        String Phno = sc.nextLine();
        obj.setPhNo(Phno);
        
        
        if (obj.getPhNo().length() ==10) {
            System.out.println("Yes validated!");
        } else {
            System.out.println("Please Entered Valid phno");
        }
        
        System.out.println("Enter a IFSC: ");
        String Ifsc = sc.nextLine();
        obj.setIfsc(Ifsc);

        if (obj.getIfsc().length() == 11) {
            System.out.println("IFSC Validated!");
        } else {
            System.out.println("Invalid IFSC!");
        }
       
        
        
        
        System.out.println("Enter a IsActive (true/false): ");
        boolean Isactive = sc.nextBoolean();
        obj.setActive(Active);
         
        
        
        System.out.println("Enter a AcctType: ");
        String AcctType = sc.nextLine();
        obj.setAcctType(AcctType);
        
       
        
       
        System.out.println("Enter a Balance: ");
        int Balance = sc.nextInt();
        obj.setBalance(Balance);
        
        if(obj.getBalance() >= 1000) {
            System.out.println("Minimum Balance Maintained");
        } else {
            System.out.println("Low Balance");
        }
        
        
        
        
        
       
        
    }
}