public class Basketball implements Bounceable {
  public void hitWall(String wallName) {
    System.out.println("I hit " + wallName);
    System.out.println("G is " + GRAVITY);
  }

  public static void main(String[] args) {
    Basketball b = new Basketball();
    if ( b instanceof Bounceable)
      b.hitWall("Wall A");     
  }
}
