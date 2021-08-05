public class Puppy{
	
   private int puppyAge=1;
   private String puppyName;
   
   public Puppy(String name){
      this.puppyName=name;
   }
   public void setAge( int age ){
       this.puppyAge = age;
   }
   public int getAge( ){
       return this.puppyAge;
   }
   
   
   public static void main(String []args){
      Puppy myPuppy = new Puppy("tommy");
      myPuppy.setAge( 2 );
      int value = myPuppy.getAge( );
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}