package ch08;

public class CarMainTest {

	public static void main(String[] args) {

		Car aiCar = new AiCar();
		aiCar.run();
		
		System.out.println("===================");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
	}//end of main
}
