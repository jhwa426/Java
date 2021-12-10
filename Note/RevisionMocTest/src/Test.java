
public class Test {

	public static void main(String[] args) {
		WindSpeedSub jan = new WindSpeedSub("Jan");
		jan.addWindSpeed(45);
		jan.addWindSpeed(new int[]{12,90,123,25,12,10,17});
		System.out.println(jan.getDescription());
		System.out.println(jan.getAverageWindSpeed());
		System.out.println(jan);
		System.out.println(jan.size());
		

	}

}
