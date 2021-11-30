import java.util.Scanner;

class Q04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day (1-7): ");
		int inputDay = input.nextInt();
		
		System.out.println("Enter the time (0000-2359):");
		int inputTime = input.nextInt();
		
		System.out.println("Enter the number of tickets:");
		int inputTicket = input.nextInt();
		
		int price = 0;
		
		
		if (inputDay == 1) {
			if((inputTime > 1700) && (inputTime < 2400)){
				price = 15;
			}else {
				price = 11;
			}
			
		} else if (inputDay == 2) {
			if((inputTime > 1700) && (inputTime < 2400)){
				price = 9;
			}else {
				price = 8;
			}
		} else if ((inputDay >= 3) && (inputDay <= 5)) {
			if((inputTime > 1700) && (inputTime < 2400)){
				price = 13;
			}else {
				price = 12;
			}
			
		} else if ((inputDay == 6) || (inputDay == 7)) {
			if((inputTime > 1700) && (inputTime < 2400)){
				price = 17;
			}else {
				price = 15;
			}
			
		}
		price = price * inputTicket;
		
		System.out.printf("Total cost is: $%d.0", price);

	}

}
