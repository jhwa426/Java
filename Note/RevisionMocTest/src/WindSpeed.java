import java.util.ArrayList;

// Q13
class WindSpeed {
	private String name;
	private ArrayList<Integer> windspeeds = new ArrayList<Integer>();
	
	public WindSpeed(String name) {
		this.name = name;
	}
	
	public void addWindSpeed(int value) {
		this.windspeeds.add(value);
	}
	
	public void addWindSpeed(int[] values) {
		for (int i=0; i<values.length; i++) {
			this.windspeeds.add(values[i]);
		}	
	}
	
	public int getAverageWindSpeed() {
		double reuslt = 0;
		for (int i=0; i<windspeeds.size(); i++) {
			reuslt += this.windspeeds.get(i);
		}
		reuslt = Math.ceil(reuslt / this.windspeeds.size());
		return (int) reuslt;
	}
	
	public String getDescription() {
		String desc = "";
		if (this.getAverageWindSpeed() <=2) {
			desc = "Light Air";
		}
		else if ((this.getAverageWindSpeed() >= 3) && (this.getAverageWindSpeed() <= 5)) {
			desc = "Light breeze";
		}
		else if ((this.getAverageWindSpeed() >= 6) && (this.getAverageWindSpeed() <= 9)) {
			desc = "Gentle breeze";
		}
		else if ((this.getAverageWindSpeed() >= 10) && (this.getAverageWindSpeed() <= 14)) {
			desc = "Moderate breeze";
		}
		else if ((this.getAverageWindSpeed() >= 15) && (this.getAverageWindSpeed() <= 19)) {
			desc = "Fresh breeze";
		}
		else if ((this.getAverageWindSpeed() >= 20)) {
			desc = "Strong breeze";
		}		
		return desc;
	}
	
	public int size() {
		return this.windspeeds.size();
	}
	
	public String toString() {
		return String.format("The average wind speed of %s is %dkm/h (%s)", this.name, this.getAverageWindSpeed(), this.getDescription());
	}
}


class WindSpeedSub extends ArrayList<Integer> {
	private String name;

	public WindSpeedSub(String name) {
		super();
		this.name = name;
	}
	
	public void addWindSpeed(int value) {
		super.add(value);
	}
	
	public void addWindSpeed(int[] values) {
		for (int i=0; i<values.length; i++) {
			super.add(values[i]);
		}
	}
	
	public int getAverageWindSpeed() {
		double reuslt = 0;
		for (int i=0; i<super.size(); i++) {
			reuslt += super.get(i);
		}
		reuslt = Math.ceil(reuslt / super.size());
		return (int) reuslt;
	}
	
	public String getDescription() {
		String desc = "";
		if (this.getAverageWindSpeed() <=2) {
			desc = "Light Air";
		}
		else if ((this.getAverageWindSpeed() >= 3) && (this.getAverageWindSpeed() <= 5)) {
			desc = "Light breeze";
		}
		else if ((this.getAverageWindSpeed() >= 6) && (this.getAverageWindSpeed() <= 9)) {
			desc = "Gentle breeze";
		}
		else if ((this.getAverageWindSpeed() >= 10) && (this.getAverageWindSpeed() <= 14)) {
			desc = "Moderate breeze";
		}
		else if ((this.getAverageWindSpeed() >= 15) && (this.getAverageWindSpeed() <= 19)) {
			desc = "Fresh breeze";
		}
		else if ((this.getAverageWindSpeed() >= 20)) {
			desc = "Strong breeze";
		}		
		return desc;
	}
	
	public String toString() {
		return String.format("The average wind speed of %s is %dkm/h (%s)", this.name, this.getAverageWindSpeed(), this.getDescription());
	}
	
}












