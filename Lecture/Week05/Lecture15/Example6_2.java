public class Example6_2 {
    public static void main(String[] args) {
        int number[] = {4, 8, 16, 32};
        int denom[] = {2};
        try {
            for (int i =0; i< number.length; i++) {
                try {
                    System.out.println( number[i]+"/"+ denom[i]+" is "+number[i]/denom[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Can't divide by ZERO!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No matching element found.");
        }  
    }
}
