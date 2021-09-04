// Q1-Q2
import java.util.ArrayList;

//Q1
class Country {
    private String countryName = "Unknown", abbreviation = "N/A";
    private int population, numberOfConfirmedCases;
    private double landArea;
    private City capital;
    private City[] cities = new City [5];
    public static int numberOfCities = 0;
    private ArrayList <City> cityList = new ArrayList <City>();
    
    public Country() {
    	
    }
    
    public Country(String name, String abb, int pop, double area, int num, City capital) {
        countryName = name;
        abbreviation = abb;
        population = pop;
        landArea = area;
        numberOfConfirmedCases = num;
        this.capital = capital;
    }
    
    public String getCountryName() { 
    	return countryName; 
    }
    
    public String getAbbreviation() { 
    	return abbreviation; 
    }
    
    public City getCapitalCity() {
    	return capital; 
    }
    
    public double getPopulationDensity() { 
    	return population/landArea; 
    }
    
    // Q1
//    public void addCity(City c) {
//    	this.cities[numberOfCities] = c;
//    	this.numberOfCities += 1;
//    }
//    
//    public void printCities() {
//    	if (numberOfCities > 1) {
//    		for(int i = 0; i<numberOfCities; i++) {
//    			if(i+1 == numberOfCities) {
//    				System.out.printf("%s",cities[i]);
//    			}
//    			else {
//    				System.out.printf("%s,",cities[i]);
//    			}
//    		}
//    	}
//    	else {
//    		System.out.printf("%s",cities[0]);
//    	}
//    	System.out.println();
//    }
     
    
    
    // Q2
    public void addCity(City city) {
    	this.cityList.add(city);
    }
    
    public void printCities() {
    	System.out.println(cityList);
    	
    }
    
    public int getNumberOfCities() {
    	return this.cityList.size();
    }
    

    public String toString() { 
        return  String.format("%s(%s), population density=%.2f, Covid19 confirmed cases=%d", countryName, capital.getCityName(),getPopulationDensity() ,numberOfConfirmedCases);
    }
}