import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int salary = input.nextInt();
		System.out.printf("Salary %d\n",salary);
		
		int taxRate1 = 14000, taxRate2 = 34000, taxRate3 = 22000, taxRate4 = 110000, taxRate5 = 180000;
		double totalTax, netPay;
		double result1, result2, result3, result4, result5;
		double tax1 = 0, tax2 = 0, tax3 = 0, tax4 = 0, tax5 = 0;
		
		
		if (salary <= 14000) {
			tax1 = salary * 0.105;
			System.out.printf("Amount to be taxed at 0.105 is $%d and tax is $%.0f.\n",salary, tax1);
			System.out.println("====================");
			totalTax = tax1;
			netPay = salary - totalTax;
			System.out.printf("Total tax: $%.0f\n", totalTax);
			System.out.printf("Net pay: $%.0f\n", netPay);
			System.out.println("====================");
			
		} else if (salary > 14000 && salary <= 48000) {
			result2 = (salary - taxRate1);
			tax2 = result2 * 0.175;
			System.out.printf("Amount to be taxed at 0.175 is $%.0f and tax is $%.0f.\n",result2, tax2);
			result1 = (salary - taxRate2);
			tax1 = taxRate1 * 0.105;
			System.out.printf("Amount to be taxed at 0.105 is $%d and tax is $%.0f.\n",taxRate1, tax1);
			
			System.out.println("====================");
			totalTax = tax1 + tax2;
			netPay = salary - totalTax;
			System.out.printf("Total tax: $%.0f\n", totalTax);
			System.out.printf("Net pay: $%.0f\n", netPay);
			System.out.println("====================");

		} else if (salary > 48000 && salary <= 70000) {
			result3 = (salary - (taxRate1 + taxRate2));
			tax3 = result3 * 0.300;
			System.out.printf("Amount to be taxed at 0.300 is $%.0f and tax is $%.0f.\n",result3, tax3);
			result2 = (salary - taxRate2);
			tax2 = taxRate2 * 0.175;
			System.out.printf("Amount to be taxed at 0.175 is $%d and tax is $%.0f.\n",taxRate2, tax2);
			result1 = (salary - taxRate1);
			tax1 = taxRate1 * 0.105;
			System.out.printf("Amount to be taxed at 0.105 is $%d and tax is $%.0f.\n",taxRate1, tax1);

			System.out.println("====================");
			totalTax = tax1 + tax2 + tax3;
			netPay = salary - totalTax;
			System.out.printf("Total tax: $%.0f\n", totalTax);
			System.out.printf("Net pay: $%.0f\n", netPay);
			System.out.println("====================");
			
		} else if (salary > 70000 && salary <= 180000) {
			result4 = (salary - (taxRate1 + taxRate2 + taxRate3));
			tax4 = result4 * 0.33;
			System.out.printf("Amount to be taxed at 0.330 is $%.0f and tax is $%.0f.\n",result4, tax4);
			result3 = (salary - taxRate2 - taxRate1 - result4);
			tax3 = result3 * 0.300;
			System.out.printf("Amount to be taxed at 0.300 is $%d and tax is $%.0f.\n",taxRate3, tax3);
			result2 = (salary - taxRate2);
			tax2 = taxRate2 * 0.175;
			System.out.printf("Amount to be taxed at 0.175 is $%d and tax is $%.0f.\n",taxRate2, tax2);
			result1 = (salary - taxRate1);
			tax1 = taxRate1 * 0.105;
			System.out.printf("Amount to be taxed at 0.105 is $%d and tax is $%.0f.\n",taxRate1, tax1);
			
			System.out.println("====================");
			totalTax = tax1 + tax2 + tax3 + tax4;
			netPay = salary - totalTax;
			System.out.printf("Total tax: $%.0f\n", totalTax);
			System.out.printf("Net pay: $%.0f\n", netPay);
			System.out.println("====================");
		} else {
			result5 = (salary - (taxRate1 + taxRate2 + taxRate3 + taxRate4));
			tax5 = result5 * 0.39;
			System.out.printf("Amount to be taxed at 0.390 is $%.0f and tax is $%.0f.\n",result5, tax5);
			result4 = (salary - (taxRate1 + taxRate2 + taxRate3) - result5);
			tax4 = result4 * 0.33;
			System.out.printf("Amount to be taxed at 0.330 is $%d and tax is $%.0f.\n",taxRate4, tax4);
			result3 = (salary - result5 - result4 - taxRate2 - taxRate1);
			tax3 = result3 * 0.300;
			System.out.printf("Amount to be taxed at 0.300 is $%d and tax is $%.0f.\n",taxRate3, tax3);
			result2 = (salary - taxRate2);
			tax2 = taxRate2 * 0.175;
			System.out.printf("Amount to be taxed at 0.175 is $%d and tax is $%.0f.\n",taxRate2, tax2);
			result1 = (salary - taxRate1);
			tax1 = taxRate1 * 0.105;
			System.out.printf("Amount to be taxed at 0.105 is $%d and tax is $%.0f.\n",taxRate1, tax1);
			
			System.out.println("====================");
			totalTax = tax1 + tax2 + tax3 + tax4 + tax5;
			netPay = salary - totalTax;
			System.out.printf("Total tax: $%.0f\n", totalTax);
			System.out.printf("Net pay: $%.0f\n", netPay);
			System.out.println("====================");
		}
		input.close();
	}
}
