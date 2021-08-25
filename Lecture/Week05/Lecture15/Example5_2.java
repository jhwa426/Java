public class Example5_2 {
    public static void main(String[] args) {
        try {
            String c = "abcde";          // NumberFormatException
            int r1 = Integer.parseInt(c);

        } catch (NumberFormatException e) {
            System.out.println("Incorrect Format!");

        } catch (Exception e) {
            System.out.println("General Exception Error!");
        }
        System.out.println("Finished!");
    }
}  
