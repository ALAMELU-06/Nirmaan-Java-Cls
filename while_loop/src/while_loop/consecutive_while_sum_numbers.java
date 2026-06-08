package while_loop;

public class consecutive_while_sum_numbers {
	public static void main(String[] args) {

        int start = 1;   
        int end = 5;    
        int sum = 0;

        System.out.println("Consecutive Numbers:");

        while (start <= end) {
            System.out.print(start + " \n");
            sum = sum + start;  
            start++;          
        }

        System.out.println("\n\nSum of consecutive numbers = " + sum);
    }
}


