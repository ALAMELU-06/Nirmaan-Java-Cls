package conditional_statement;

import java.util.Scanner;
public class If_elseif_else_statement {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a1 = sc.nextInt();
		System.out.println("enter the number:");
		int a2 = sc.nextInt();
		if(a1 < a2) {
		 System.out.println("maximum number is:" +a1);
		}else if(a2 > a1) {
			System.out.println("maximum number is:" +a2);
		}else {
			System.out.println("Both are equal");
		}
			
				
			}
		}
		
	
	

