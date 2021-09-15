//Q6

interface Cycle {
	public void fastCycle();
	public void slowCycle();
}
class Demo {
	public class MyCycleInner implements Cycle{
		public void fastCycle() {
			System.out.println("fastCycle");
		}
		
		public void slowCycle() {
			System.out.println("slowCycle");
		}
		
	}
	
//	public Demo(boolean isFast){
//    MyCycleInner obj = new MyCycleInner();
//    if (isFast)
//      obj.fastCycle();
//    else
//      obj.slowCycle(); 
//  }
	
	
	//Q7
	public Demo(boolean isFast){
	    Cycle obj = new Cycle() {
	    	public void fastCycle () {
	    		System.out.println("fastCycle");
	    	}
	    	public void slowCycle() {
	    		System.out.println("slowCycle");
	    	}
	    };
	    
	  if (isFast)
	      obj.fastCycle();
	    else
	      obj.slowCycle(); 
	}    
	
	
}