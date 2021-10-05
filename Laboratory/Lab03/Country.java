//Q11 - Q12
class Country {
	private String countryName = "Unknown";
	private String abbreviation = "N/A";
	private int population;
	private double landArea;
	private int numberOfConfirmedCases;
	private City capital;
	
	//A default constructor
	public Country() {
		
	}
	// constructor
	public Country(String countryName, String abbreviation, int population, double landArea, int numberOfConfirmedCases) {
		this.countryName = countryName;
		this.abbreviation = abbreviation;
		this.population = population;
		this.landArea = landArea;
		this.numberOfConfirmedCases = numberOfConfirmedCases;
	}
	
	// An overloaded constructor that creates a country with the specified name, abbreviation, population, 
	//land area, number of Covid19 confirmed cases and the capital city.
	
	public Country(String countryName, String abbreviation, int population, double landArea, int numberOfConfirmedCases, City capital) {
		this.countryName = countryName;
		this.abbreviation = abbreviation;
		this.population = population;
		this.landArea = landArea;
		this.numberOfConfirmedCases = numberOfConfirmedCases;
		this.capital = capital;
	}
	
	public City getCapitalCity() {
		return this.capital;
	}
	
	public void setCapialCity(City city) {
		this.capital = city;
	}
	
	public double getPopulationDensity() {
		return ((double)this.population) / this.landArea;
	}
	
	
	public String getCountryName() {
		return this.countryName;
	}
	
	public String getAbbreviation() {
		return this.abbreviation;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public double getLandArea() {
		return this.landArea;
	}
	
	public String toString() {
		String str = String.format("%s(%s), population density=%.2f, Covid19 confirmed cases=%d", this.countryName,capital.getCityName(),getPopulationDensity(), this.numberOfConfirmedCases);
		return str;
	}
	
	
	public static void main(String[] args) {
		City w = new City("Wellington", "WLG", true);
		Country nz = new Country("New Zealand", "NZ", 4822233, 268021, 2870, w);
		City aklCity = new City("Auckland", "AKL", false );
		System.out.println(nz.getCountryName());
		System.out.println(nz);

	}

}
