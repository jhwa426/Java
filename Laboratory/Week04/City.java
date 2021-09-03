//Q11
class City {
	private String cityName = "Unknown";
	private String abbreviation = "N/A";
	private boolean isCapitalCity;
	
	//A default no-arg constructor
	public City() {
		
	}
	
	//An overloaded constructor
	public City(String cityName, String abbreviation, boolean isCapitalCity) {
		this.cityName = cityName;
		this.abbreviation = abbreviation;
		this.isCapitalCity = isCapitalCity;
	}
	
	public String getCityName() {
		return this.cityName;
	}

	
	public String toString() {
		String str = "";
		if (this.isCapitalCity == true) {
			 str = String.format("Capital city:%s(%s)", cityName, abbreviation);
		}
		else {
			 str = String.format("City:%s(%s)", cityName, abbreviation);
		}
		return str;
	}
	
	public static void main(String[] args) {
		City aklCity = new City("Auckland", "AKL", false );
		City wCity = new City("Wellington", "WLG", true);
		City a = new City();
		System.out.println(aklCity );
		System.out.println(wCity );
		System.out.println(a);
		System.out.println(aklCity.getCityName());
	}
}
