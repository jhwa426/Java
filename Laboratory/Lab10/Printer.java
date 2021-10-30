//Q01
class Printer {
	private static Printer printer;
	private static int numberOfPages;
	
	
	private Printer (){
	}
	
	public static Printer getInstance() {
		if (printer == null) {
			printer = new Printer();
			return printer;
		}
		return printer;
	}
	
	public void print(String text) {
		numberOfPages += 1;
		String str = "Print " + "'" + text + "'";
		System.out.println(str);
		System.out.printf("%d page(s) printed\n", numberOfPages);
	}
	
	
	public static void main(String[] args) {
		Printer printer1 = Printer.getInstance();
		printer1.print("Job: Sarah's assignment");
		Printer printer2 = Printer.getInstance();
		printer2.print("Job: Henry's assignment");
		Printer printer3 = Printer.getInstance();
		printer3.print("Job: Alex's assignment");
		
		
		
//		Printer printer1 = Printer.getInstance();
//		printer1.print("Job: Sarah's assignment");
//		Printer printer = Printer.getInstance();
//		printer.print("Job: Michael's report");
//		Printer printer2 = Printer.getInstance();
//		printer2.print("Job: Alex's report");
		
//		Printer[] array = new Printer[] {Printer.getInstance(),  Printer.getInstance()};
//		for (Printer b: array) {
//		  b.print("Job: printing more information");
//		}
	}
}
