package variables;

public class Methods {
	
	static void Final() {//static belongs to class
		System.out.println("Hello Welcome to static method");
	}	
	public static void Final1() {//user defined
		System.out.println("Hello Welcome to user defined method");
			
		}
	
	
	public static void main(String[] args) {
		
		Methods sc = new Methods();
		
		sc.Final();
		Final1();
		
		
		
		
	}

}
