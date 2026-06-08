package control_statement;

import java.util.Scanner;

public class while_tables {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i = 0;
		while(i <=12) {
			System.out.println(num + "x" + i + "=" +(num*i));
			i++;
		}
	}
}


