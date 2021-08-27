public class Example7_3 {
    public static void main(String[] args) {
        try {
            System.out.println("main+");
            method1();
            System.out.println("main-");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Index Error!");
        } 
        System.out.println("Finished!");
    }

    public static void method1() {
        try {
            System.out.println("Method1+");
            String c = "abcde";        // NumberFormatException ERROR
            int r1 = Integer.parseInt(c); 
        } catch (ArithmeticException e) {
            System.out.println("Calculation Error!");
        }
        System.out.println("Method1-");
    }
}    
