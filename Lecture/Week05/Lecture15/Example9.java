public class Example9{
    public static void main(String[] args) {
        try {
            System.out.println("main+");
            int i = 0;
            if (i <= 0) 
                throw new Exception("Throw an error");
            System.out.println("main-");
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("Finally block!");
        }
        System.out.println("Finished!");
    }
}    