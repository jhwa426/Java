import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter number of columns:");
        int columns = input.nextInt();
        int count = 1;
        int temp, match;
        
        if (rows < columns) {
        	match = rows;
        	temp = columns;
        	columns = rows;
        	rows = temp;
        	
            for (int i = 1; i <= rows; i++) {
           
                for (int j = i; j <= rows; j++) {
                     System.out.print(j);
                } 
                for(columns = i-1; columns >= 1; columns--) {
                    System.out.print(columns);
                }
                System.out.println();
//                System.out.printf("i : %d ,count :%d\n", match,count);
                count += 1;
                if (match == count-1) {
                	break;
//                	System.out.println("HEAR");
                }
            }
            
            
        }
        else {
            for (int i = 1; i <= rows; i++) {
            
                for (int j = i; j <= rows; j++) {
                     System.out.print(j); 
                	} 
                for(columns = i-1; columns >= 1; columns--) {
                	System.out.print(columns);
                }
                System.out.println();
            }
        	
        }

	}

}

