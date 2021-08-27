public class Example8_3 {
    public static void main(String[] args) {
        try {
            String c = "abcde";
            int r1 = Integer.parseInt(c);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error!");

        } catch (ArithmeticException e) {
            System.out.println("Calculation Error!");

        } finally {
            System.out.println("Finally block!");
        }
        System.out.println("Finished!");
    }
}    
