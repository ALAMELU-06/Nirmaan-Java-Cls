package variables;

public class prime_numbers {
	public static void main(String[] args) {
		
		        int n = 111;
		        int i = 2;

		        while (i < n) {
		            if (n % i == 0) {
		                System.out.println(n + " is  not a prime number");
		                return;
		            }
		            i++;
		        }

		        System.out.println(n + " is a prime number");
		    }
    }

