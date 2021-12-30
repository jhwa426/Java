import java.util.ArrayList;

class SimpleMatrix {
	private ArrayList<Integer[]> values = new ArrayList<Integer[]>();
	

	public SimpleMatrix() {
		Integer[] rowA = {0,0};
		Integer[] rowB = {0,0};
		values.add(rowA);
		values.add(rowB);

	}
	
	public SimpleMatrix(int a, int b, int c, int d) {
		Integer[] rowA = {a,b};
		Integer[] rowB = {c,d};
		values.add(rowA);
		values.add(rowB);		
	}
	
	public int getSize() {
		return values.size();
	}
	
	public Integer[] getRow(int index) {
		return values.get(index);
	}
	
	public String toString() {
		String str = "";
		for (int i=0; i<values.size(); i++) {
			for(int j=0; j<i; j++) {

				str += String.format("[%d, %d]\n", values.get(i),i);
			}
		}
		
		return str;
	}
	
}
