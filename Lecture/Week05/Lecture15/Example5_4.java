public class Example5_4 {
    public static void main(String[] args) {
        try {
            String c = "abcde";          // NumberFormatException
            System.out.println(1 + "a");
            int r1 = Integer.parseInt(c);

        } catch (ArithmeticException e) {
            System.out.println("Calculation Error!");

        } catch (Exception e) {
            System.out.println("General Exception Error!");
        }
        System.out.println("Finished!");
    }
}
