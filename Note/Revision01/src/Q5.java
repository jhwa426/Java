
public class Q5 {
	public static boolean isPrime(int n) {
		boolean check = true;
		
		if (n <= 1) {
			check = false;
			return check;
		}
		else {
			
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				check = false;
				break;
			    }
			}
		}
		return check;
	}
		
	
	
	public static void main(String[] args) {
		System.out.println(isPrime(11));
		System.out.println(isPrime(121));
	}
}