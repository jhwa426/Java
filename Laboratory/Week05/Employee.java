//Q3 - Q5
class Employee {
    protected String name;
    
    public Employee(String name) { 
    	this.name = name; 
    }
    public int getHours() {  
    	return 40;  
    }
    
    public double getSalary() { 
    	return 40000.0; 
    }  
    public int getVacationDays() { 
    	return 10; 
    }
    public String getVacationForm() { 
    	return "yellow"; 
    }    // use the yellow form
    public String toString() { 
    	return String.format("%s works for %d hours and gets %.2f.", name, getHours(), getSalary()); 
    }
    
	public static void main(String[] args) {
		LegalSecretary p = new LegalSecretary("Peter");
		System.out.println(p.getHours());
		System.out.println(p.getSalary());
		System.out.println(p.getVacationForm());
		System.out.println(p.getVacationDays());
		p.fileLegalBriefs();
		System.out.println(p);

	}
}

class Markerter extends Employee {

	// constructor
	public Markerter(String name) {
		super(name);
	}
	
	public double getSalary() {
		return super.getSalary() + 10000.0;
	}
	
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}
}

class Janitor extends Employee {
	//constructor
	public Janitor(String name) {
		super(name);
	}
	
	public int getHours() {
		return super.getHours() * 2;
	}
	
	public double getSalary() {
		return super.getSalary() - 10000.0;
	}
	
	public int getVacationDays() {
		return super.getVacationDays() - 5;
	}
	
	public void clean() {
		System.out.println("Cleaning, cleaning!");
	}
	
}

class Secretary extends Employee {
	  public Secretary(String name) { 
		  super(name); 
	  }
	  public void takeDictation(String text) { 
		  System.out.println("Taking dictation of text: " + text); 
	  }
}

class LegalSecretary extends Secretary {

	public LegalSecretary(String name) {
		super(name);
	}
	
	public double getSalary() {
		return super.getSalary() + 5000.0;
	}
	
	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}
	
}


