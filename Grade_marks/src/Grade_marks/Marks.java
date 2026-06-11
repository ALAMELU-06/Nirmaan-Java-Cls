package Grade_marks;

import java.util.Scanner;

public class Marks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
	int marks = sc.nextInt();
	
	if(marks >=100){
		System.out.println("Grade is A" );
	}else if(marks>80) {
		System.out.println("Grade is B" );
	}else if(marks >60){
		System.out.println("Grade is C" );
	}else if(marks >40){
		System.out.println("Grade is D" );
	}else {
		System.out.println("Below 35 grade is E" );
	}
	
		
	}

}
