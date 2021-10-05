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
		City a = new City("Auckland", "AKL", false );
		City w = new City("Wellington", "WLG", true);
		City c = new City("Christchurch", "CHC", false);
		City d = new City("Dunedin", "DUD", false);
		
		System.out.println(a);
		
	}
}
//
////Q1
//class Country {
//  private String countryName = "Unknown", abbreviation = "N/A";
//  private int population, numberOfConfirmedCases;
//  private double landArea;
//  private City capital;
//  private int[] cities = new int [5];
//  public static int numberOfCities = 0;
//  
//  
//  
//  public Country() {
//  	
//  }
//  
//  public Country(String name, String abb, int pop, double area, int num, City capital) {
//      countryName = name;
//      abbreviation = abb;
//      population = pop;
//      landArea = area;
//      numberOfConfirmedCases = num;
//      this.capital = capital;
//  }
//  
//  public String getCountryName() { 
//  	return countryName; 
//  }
//  
//  public String getAbbreviation() { 
//  	return abbreviation; 
//  }
//  
//  public City getCapitalCity() {
//  	return capital; 
//  }
//  
//  public double getPopulationDensity() { 
//  	return population/landArea; 
//  }
//  
//  public void addCity(City c) {
//  	for(int i = 0; i<c.length; i++) {
//  		cities[i] = c[i];
//  		numberOfCities += 1;
//  	}
//  }
//  
//  public static void printCities() {
//  	if (numberOfCities > 1) {
//  		for(int i = 0; i<cities.length; i++) {
//  			System.out.printf("%s, ",cities[i]);
//  		}
//  	}
//  }
//  
//  
//  public String toString() { 
//      return  String.format("%s(%s), population density=%.2f, Covid19 confirmed cases=%d\n", countryName, capital.getCityName(),getPopulationDensity() ,numberOfConfirmedCases);
//  }
//}