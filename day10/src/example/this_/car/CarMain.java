package example.this_.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car("머스탱");
		Car yourCar = new Car("포르쉐");	
		
		for(int i = 0; i < 20; i++) {
		myCar.accel();
		}
		myCar.showStatus();
	
	yourCar.accel();
	yourCar.showStatus();
	
	}
}
