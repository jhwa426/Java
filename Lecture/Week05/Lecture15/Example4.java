public class Example4 {
    public static void main(String[] args) {
        try {
            int[] array = new int[1];
            array[0] = 1;
            array[1] = 2;
            System.out.println("This will not be printed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        }
        System.out.println("Finish! ");
    }
}
