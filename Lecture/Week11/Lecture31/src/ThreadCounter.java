
public class ThreadCounter extends Thread{
   public void run(){  
     for(int counter=1;counter<=50;counter++){  
	 try{
            Thread.sleep(100);
	 }
     catch(InterruptedException ie){
	       ie.printStackTrace();
     }  
     System.out.print(counter+" ");  
   }  
}  
public static void main(String args[]){  
	 ThreadCounter threadA = new ThreadCounter();
	 ThreadCounter threadB = new ThreadCounter(); 
     threadA.start();  
     threadB.start(); 
   }
}