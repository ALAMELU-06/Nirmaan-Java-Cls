package for_loop;

public class consecutive_for_sum_numbers {
	public static void main(String[] args) {

        int start = 1;   
        int end = 10;   
        int sum = 0;

        System.out.println("Consecutive Numbers:");

        for (int i = start; i <= end; i++) {
            System.out.print(i + "\n ");
            sum = sum + i;  
        }

        System.out.println("\n\nSum of consecutive numbers from " + start + " to " + end + " = " + sum);
    }
}

