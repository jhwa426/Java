//Q8 - Q9
interface Comparable<Rugby> {
  int compareTo(Rugby obj);
}

class Rugby implements Comparable<Rugby> {
	private String countryName = "N/A";
	private int points = 0;
	
	//A no-arg constructor that creates a rugby team with default values.
	public Rugby() {
		this.countryName = "N/A";
		this.points = 0;
	}
	
	//A overloaded constructor that creates a rugby team with the specified total number of points and the country name.
	public Rugby(String countryName, int points) {
		this.countryName = countryName;
		this.points = points;
	}
	
	//An overloaded constructor that creates a rugby team with the specified country name.
	public Rugby(String countryName) {
		this.countryName = countryName;
	}
	
	//The accessor and mutator methods for the country name and the total number of points of a rugby team. 
	//The mutator methods should only modify the corresponding value if the parameter is valid.
	public void setPoints(int points) {
		if (points >= 0) {
			this.points = points;
		}
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void setCountryName (String countryName) {
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return this.countryName;
	}

	public String toString() {
		return String.format("Country: %s(%d)", this.countryName, this.points);
	}
	
	public int compareTo(Rugby obj) {
		if (this.points != obj.points) {
			return this.points - obj.points;
		}
		return this.countryName.toLowerCase().compareTo(obj.countryName.toLowerCase());
	}
}
