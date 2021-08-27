public class Example8_4 {
    public static void main(String[] args) {
        try {
            String a = "0";
            int r2 = Integer.parseInt(a) / Integer.parseInt(a);

        } catch (ArithmeticException e) {
            System.out.println("Calculation Error");
            return;

        } catch (Exception e) {
            System.out.println("General Exception");
            return;

        } finally {
            System.out.println("Finally");
        }
        System.out.println("Finished"); 
    }
}  
