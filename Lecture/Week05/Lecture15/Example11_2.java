public class Example11_2{
    public static void main(String[] args) {
        try {
            throw new Exception("Throw an error");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}