
public class SimpleThread extends Thread{
    public SimpleThread(String name) {
    	super(name);
    }
	
	public void run(){  
       for(int i=1;i<=10;i++){  
    	   System.out.println(i+" "+getName());  
       }  
       System.out.println("DONE! "+getName());  
   }  
  

   public static void main(String args[]){  
	 SimpleThread thread1 = new SimpleThread("first");
	 SimpleThread thread2 = new SimpleThread("second"); 
     thread1.start();  
     thread2.start(); 
   }
}