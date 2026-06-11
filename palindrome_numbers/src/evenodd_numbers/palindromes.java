package evenodd_numbers;

import java.util.Scanner;
public class palindromes {
	public boolean isPalindrome(int num) {
		int original = num;
		 int rev = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num = num / 10;
	        }

	        return original == rev;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        palindromes obj = new palindromes();

	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	        if (obj.isPalindrome(n)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
	}
