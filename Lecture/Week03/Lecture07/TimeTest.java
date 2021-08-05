
public class TimeTest {

	   // test for time class
	public static void main( String args[] )
	   {
	      Time t1 = new Time();             // 00:00:00
	      Time t2 = new Time( 2 );          // 02:00:00
	      Time t3 = new Time( 21, 34 );     // 21:34:00
	      Time t4 = new Time( 12, 25, 42 ); // 12:25:42
	      Time t5 = new Time( 27, 74, 99 ); // 00:00:00
	      Time t6 = new Time( t4 );         // 12:25:42

	      System.out.println( "Constructed with:" );
	      System.out.println( "t1: all arguments defaulted" );
	      System.out.printf( "   %s\n", t1.toString() );

	      System.out.println(
	         "t2: hour specified; minute and second defaulted" );
	      System.out.printf( "   %s\n", t2.toString() );

	      System.out.println(
	         "t3: hour and minute specified; second defaulted" );
	      System.out.printf( "   %s\n", t3.toString() );

	      System.out.println( "t4: hour, minute and second specified" );
	      System.out.printf( "   %s\n", t4.toString() );

	      System.out.println( "t5: all invalid values specified" );
	      System.out.printf( "   %s\n", t5.toString() );

	      System.out.println( "t6: Time object t4 specified" );
	      System.out.printf( "   %s\n", t6.toString() );
	   } // end main

}
