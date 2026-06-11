package do_while_loop;

public class consecutive_dowhile_numbers {
	public static void main(String[] args) {

        int start = 1;   
        int end = 10;    

        System.out.println("Consecutive Numbers:");

        do {
            System.out.print(start + " \n");
            start++;   
        } while (start <= end);
    }
}

