public class Example3 {
    public static void main(String[] args) {
        int value = 0;
        try {
            int answer = 100 / value;
            System.out.println("This will not be printed");  // not displayed
        } catch (Exception e) {
            System.out.println("Error");   //1
            value = -1;
        }
        System.out.println("Program can continue to run...");     //2
    }
}