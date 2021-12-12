import java.util.Scanner;

class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		int radius = input.nextInt();
		System.out.println("Enter a height: ");
		int height = input.nextInt();
		
		int volume = (int) Math.ceil(Math.PI * radius * radius * height/3);
		String str = String.format("Volume of cone is %d cubic cm.", volume);
		
		System.out.println(str);
		

	}

}
