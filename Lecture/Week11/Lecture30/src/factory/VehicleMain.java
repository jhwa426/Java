package factory;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		System.out.println("Enter the vehicle type: ");
		input = new Scanner(System.in).nextInt();
	
		Vehicle vehicle = VehicleFactory.createVehicle(input);
		
		vehicle.clean();
		vehicle.drive();		
	}
}
