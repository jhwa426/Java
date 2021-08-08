class Date{
   private int month; // 1-12
   private int day;   // 1-31 based on month
   private int year;  // any year

   // constructor: call checkMonth to confirm proper value for month;
   public Date( int theMonth, int theDay, int theYear ){
      month = checkMonth( theMonth ); // validate month
      year = theYear; // could validate year
      day = checkDay( theDay ); // validate day

      System.out.printf(
         "Date object constructor for date %s\n", this );
   } // end Date constructor

   private int checkMonth( int testMonth ){
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid
      {
         System.out.printf(
            "Invalid month (%d) set to 1.", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   private int checkDay( int testDay ){
      int daysPerMonth[] =
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;

      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;

      System.out.printf( "Invalid day (%d) set to 1.", testDay );
      return 1;  // maintain object in consistent state
   } // end method checkDay

   // return a String of the form month/day/year
   public String toString(){
      return String.format( "%d/%d/%d", month, day, year );
   } // end method toString
}
// Static variable used to maintain a count of the number of
// Employee objects in memory.

class Employee {
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate;

   public Employee( String first, String last, Date birth, Date hire ){
      firstName = first;
      lastName = last;
      this.birthDate = birth;
      hireDate = hire;
	}

	public String toString() {
		return String.format("%s, %s; Hired: %s, Birthday: %s%n", lastName, firstName, hireDate, birthDate);
	}
}

public class EmployeeTest {
   public static void main( String args[] ){
      Date birth = new Date(7, 24, 1949);
      Date hire = new Date(3,12,1988);
      Employee bob = new Employee("Bob", "Blue", birth, hire);
      System.out.println(bob);

   } // end main
} // end class EmployeeTest