package compositefiles;

public class FileClient {
	public static StringBuffer indentRight = new StringBuffer();

    public static void main(String[] args) {
    	Directory nz = new Directory("New Zealand");
        Directory ni = new Directory("North Island");        
        File city1 = new File("Auckland");
        File city2 = new File("Hamilton");
        File city3 = new File("Napier");
        File city4 = new File("Wellington");
        File city5 = new File("Waiheke Island");
        File city6 = new File("Great Barrier Island");
        nz.add(city5);
        nz.add(ni);
        nz.add(city6);
        ni.add(city1);
        ni.add(city2);
        ni.add(city3);
        ni.add(city4);
        nz.printFileHierarchy();
    }
}
