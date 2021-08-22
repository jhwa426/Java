public class Lecture13 {

	public static void main(String[] args) {
//	    display arr = new display();
//	    arr.x = 0;      
//	    arr.cal(2);
//	    System.out.print(arr.x);

	    display[] arr=new display[3];
	    for(int i=0;i<3;i++)
	    arr[i]=new display();
	    arr[0].cal(0);    
	    arr[1].cal(1);
	    arr[2].cal(2);
	    System.out.print(arr[0].x+" " + arr[1].x + " " + arr[2].x);
	  }

}
