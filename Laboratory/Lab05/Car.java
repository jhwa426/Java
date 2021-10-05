//Q4
interface Comparable<Car> {
	public int compareTo(Car other);
}

class Car implements Comparable<Car> {
  private int year;
  private String make;
  private String color;
  
  public Car(String make, String color, int year) {
	  this.make = make;
	  this.color = color;
	  this.year = year;
  }
  
  public String toString() { 
	  return String.format("%s(%s),%d", make, color, year); 
  }


  public int compareTo(Car other) {
      if (this.year != other.year){
          return this.year - other.year;
      }
      
      else {
         return this.make.compareTo(other.make);
      }
  }
}