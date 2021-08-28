public class Example10{
    public static void main(String[] args) {
        try {
            System.out.println("main+");
            method1();
            System.out.println("main-");
        } catch (Exception e) {
            System.out.println("caught from main");
        } 
    }
    public static void method1() throws Exception {
        try {
            System.out.println("method1+");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("rethrow an exception");
            throw e;
        } finally {
            System.out.println("finally block");
        } 
    } 
}    