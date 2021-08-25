public class Example5_3 {
    public static void main(String[] args) {
        try {
            String c = "abcde";          // NumberFormatException
            int r1 = Integer.parseInt(c);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error!");

        } catch (ArithmeticException e) {
            System.out.println("Calculation Error!");
        }
        System.out.println("Finished!");
    }
}  
