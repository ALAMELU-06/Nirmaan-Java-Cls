package conditional_statement;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the option: ");
		int option = sc.nextInt();
	
		switch(option) {
		case 1:
			System.out.println("Sunday is a holiday");
			break;
		case 2:
			System.out.println("Monday is a working day");
			break;
		case 3:
			System.out.println("Tuesday is joyful day");
			break;
		case 4:
			System.out.println("Wednesday is a wonderful day");
			break;
		case 5:
			System.out.println("thursday is a stressful day");
			break;
		case 6:
			System.out.println("Friday is a devotional day");
			break;
		case 7:
			System.out.println("Saturday is a weekend vibe day");
			break;
			default:
				System.out.println("Enter the proper case");
			
		
		
	
	}
}
}


