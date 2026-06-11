
package do_while_loop;

public class consecutive_dowhile_odd_numbers {
	public static void main(String[] args) {

        int i = 1;    
        int end = 5;  

        System.out.println("Odd Numbers from:");

        do {
            if (i % 2 != 0) {  
                System.out.print(i + "\n ");
            }
            i++; 
        } while (i <= end);
    }
}


