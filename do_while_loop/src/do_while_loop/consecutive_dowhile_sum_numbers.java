package do_while_loop;

public class consecutive_dowhile_sum_numbers {
	public static void main(String[] args) {

        int start = 1;   
        int end = 10;    
        int sum = 0;

        System.out.println("Consecutive Numbers:");

        do {
            System.out.print(start + " \n");
            sum = sum + start;  
            start++;            
        } while (start <= end);

        System.out.println("\n\nSum of consecutive numbers = " + sum);
    }
}


