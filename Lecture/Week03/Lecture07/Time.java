public class Time {
	
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // Overloaded Constructors
   public Time() {
      this( 0, 0, 0 );
   }
   
   public Time( int h ){
      this( h, 0, 0 );
   }
   
   public Time( int h, int m ){
      this( h, m, 0 );
   }
   
   public Time( int h, int m, int s ){
      setTime( h, m, s );
   }
   
   public Time( Time time ){
      this( time.getHour(), time.getMinute(), time.getSecond() );
   }

   
   public void setTime( int h, int m, int s ) {
      setHour( h );   // set the hour
	  setMinute( m ); // set the minute
      setSecond( s );
   }
   
   public void setHour( int h ){
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
   }
   
   public void setMinute( int m ){
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
   }
   
   public void setSecond( int s ){
      second = ( ( s >= 0 && s < 60 ) ? s : 0 );
   }
   
   public int getHour(){
      return hour;
   }
   
   public int getMinute(){
      return minute;
   }
   
   public int getSecond(){
      return second;
   }

   public String toString(){
      return String.format( "%d:%02d:%02d %s",
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   }
}