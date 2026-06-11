package oops;

public class Vechile_imp extends Vechile {
	
	@Override
	void vechilenumber() {
		System.out.println(" TN15CM2026 ");
		
	}

	@Override
	void brand() {
		System.out.println(" BMW ");
		
	}

	@Override
	void fueltype() {
		System.out.println(" Desiel ");
		
	}
	@Override
    void start() {
        System.out.println(" Car Started ");
    }

    @Override
    void stop() {
        System.out.println(" Car Stopped ");
    }
    
    public static void main(String[] args) {
		Vechile_imp obj = new Vechile_imp();
		
		obj.vechilenumber();
		obj.brand();
		obj.fueltype();
		obj.start();
		obj.stop();
		obj.display();
	
	}

	
}
	
	


