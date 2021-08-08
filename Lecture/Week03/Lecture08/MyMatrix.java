import java.util.Arrays;

class MyMatrix {
	private int[][] data;
	public final static int SIZE = 3;
	
	public MyMatrix() {
		this.data = new int [SIZE][SIZE];
	}
	
	public MyMatrix(int x11, int x12, int x13, int x21, int x22, int x23, int x31, int x32, int x33) {
		this.data = new int[][] {{x11, x12, x13}, {x21, x22, x23}, {x31, x32, x33}};
	}
	
    public MyMatrix(int[] row1, int[] row2, int[] row3) {
    	this.data = new int[][] {row1, row2, row3}; 
    }
	
    public MyMatrix add(MyMatrix element) {
    	MyMatrix result = new MyMatrix();
    	
    	for (int row = 0; row<SIZE; row++) {
    		for (int column = 0; column<SIZE; column++) {
    			result.data [row][column] = data[row][column] + element.data[row][column];
    		}
    	}
    	return result;
    }
    
    public MyMatrix subtract(MyMatrix element) {
    	MyMatrix result = new MyMatrix();
    	
    	for (int row = 0; row<SIZE; row++) {
    		for (int column = 0; column<SIZE; column++) {
    			result.data [row][column] = data[row][column] - element.data[row][column];
    		}
    	}
    	return result;
    }
    
    // Q09
	public MyMatrix multiply(MyMatrix other) {
		MyMatrix result = new MyMatrix();
        for (int row = 0; row < data.length; row++) 
            for (int col = 0; col < data[row].length; col++)
                for (int k = 0; k < SIZE; k++) {
                    result.data[row][col] += data[row][k] * other.data[k][col];
                }   
        return result;
	}
    
    public void scalar_multiply(int value) {
    	for (int row = 0; row<SIZE; row++) {
    		for (int column = 0; column<SIZE; column++) {
    			data [row][column] *= value;
    		}
    	}
    }
    
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		for(int i = 0; i<this.data.length; i++) {
			str.append(Arrays.toString(data[i]) + "\n");
		}
		
//		for (int [] row: data) {
//			str.append(Arrays.toString(row) + "\n");
//		}
		
		return str.toString();
	}

	
	public static void main(String[] args) {
//		MyMatrix myMatrix1  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		System.out.println(myMatrix1 );
//		MyMatrix myMatrix2  = new MyMatrix();
//		System.out.println(myMatrix2 );
//		System.out.println(MyMatrix.SIZE);
		
//		MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//		MyMatrix result = myMatrix1.add(myMatrix2);
//		System.out.println(result);
		
//		MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//		MyMatrix result = myMatrix1.subtract(myMatrix2);
//		System.out.println(result);
		
		MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
		MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
		MyMatrix result = myMatrix1.multiply(myMatrix2);
		System.out.println(result);
		
//		MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
//		myMatrix1.scalar_multiply(10);
//		myMatrix2.scalar_multiply(2);
//		System.out.println(myMatrix1);
//		System.out.println(myMatrix2);

	}

}

