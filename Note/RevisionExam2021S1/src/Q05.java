
public class Q05 {

	public static void main(String[] args) {
		Temperature t1 = Temperature.getTemperature(0);
		System.out.println(t1);
		
		Temperature t2 = Temperature.getTemperature(1);
		System.out.println(t2);

	}

}


enum Temperature { HUCKLE, BOILING, HOT, WARM, COOL, COLD, FREEZING;
	  private static final int SIZE = values().length;
	  public static final Temperature getTemperature(int index) {
		  if (index == 0) {
			  return Temperature.HUCKLE;
		  }
		  else if (index == 1) {
			  return Temperature.BOILING;
		  }
		  else if (index == 2) {
			  return Temperature.HOT;
		  }
		  else if (index == 3) {
			  return Temperature.WARM;
		  }
		  else if (index == 4) {
			  return Temperature.COOL;
		  }
		  else if (index == 5) {
			  return Temperature.COLD;
		  } else {
			  return Temperature.FREEZING;
		  }
	  }
	}