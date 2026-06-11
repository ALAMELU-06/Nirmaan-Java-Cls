package do_while_loop;

public class consecutive_dowhile_even_numbers {
	public static void main(String[] args) {

        int i = 1;    
        int end = 10;  

        System.out.println("Even Numbers:");

        do {
            if (i % 2 == 0) {  
                System.out.print(i + " \n");
            }
            i++; 
        } while (i <= end);
    }
}


