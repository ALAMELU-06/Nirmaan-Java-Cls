package oops;

public class Interface {

	
	
		public static void main(String[] args) {
			
			Employer obj = new Employer("Swetha",122, "Medical");
			
			Employer obj1 = new Employer("Alamelu", 123, "IT");
			
			Employer obj2 = new Employer("Gayathri",124,"Teacher");
			
			obj.setName("Mamitha");
			obj.setid(4023);
			obj.setdept("Gov");
			
			System.out.println("Name: " + obj1.getName() + ", ID: " + obj1.getid() + ", Dept: " + obj1.getdept());
			obj1.getName();
			obj1.getid();
			obj1.getdept();
			
			
		}

	}