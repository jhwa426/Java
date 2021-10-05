import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance travelled (miles): ");
		double distanceTravelled = input.nextDouble();
		input.nextLine();
		System.out.println("Enter gas (gallons): ");
		double gasUsed = input.nextDouble();
		
		double mileage = distanceTravelled / gasUsed;

		System.out.printf("The mileage is %.2f.", mileage);

	}

}
