package oops;

 class Bus implements GPS {

	@Override
	public void showlocation() {
		System.out.println(" Bus Location: Salem ");
		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Bus bs = new Bus();
		
		c.showlocation();
		b.showlocation();
		c.showlocation();
	}

}
