import java.util.*;

public class Q3 {
/*	
	public static int[] getUnique(int[] values) {
		if ((values.length == 0) ||values.length == 1) {
			return values;
		}

		Arrays.sort(values);
		
	    int[] result = new int[values.length];
		int len = values.length;
	    int j = 0;
	    
	    for (int i = 0; i < len - 1; i++) {
	        if (values[i] != values[i + 1]) {
	        	result[j++] = values[i];
	            }
	        }
	    result[j++] = values[len - 1];

	    
	    
	    //check = 0
	    int count = 0;
	    
	    for(int i = 0; i<result.length; i++) {
	    	if(result[i] == 0) {
	    		count += 1;
	    	}
	    }
	    
	    // final
	    int[] list = new int[result.length-count];
	    
	    for(int i = 0; i<list.length; i++) {
	    	list[i] = result[i];

	    }
	    return list;
 	
	}
*/
	
	public static Integer[] getUnique(int[] values) {
		Arrays.sort(values);
		ArrayList<Integer> arrlist= new ArrayList<Integer>();
		
		for(int i = 0; i<values.length; i++) {
			if(!arrlist.contains(values[i])) {
				arrlist.add(values[i]);
			}
		}
		
		Integer[] array = arrlist.toArray(new Integer[0]);
	    
	    return array;
	}
	
	/*
	Notice that we passed an empty array new Integer[0]. 
	This was intentional because if we pass a non-empty array and it has enough room to fit all elements, 
	ArrayList will use this array instead of creating a new one. 
	So by passing an empty array (size 0), we’re forcing ArrayList to create a new array and return it.
	 */
	
	
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
		System.out.println(Arrays.toString(getUnique(array1)));

	}

}













