
public class SimpleRunnable implements Runnable{    
	public void run(){  
       for(int i=1;i<=10;i++){  
    	   System.out.println(i+" "+getName());  
       }  
       System.out.println("DONE! "+getName());  
   }  
  

   public static void main(String args[]){  
	 Thread thread1 = new Thread(new SimpleRunnable(),"first");	
     thread1.start();       
   }
}