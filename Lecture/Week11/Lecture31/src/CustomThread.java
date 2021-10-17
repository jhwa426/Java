
class CustomThread extends Thread 
{ 
    final StringBuffer sb1 = new StringBuffer(); 
    final StringBuffer sb2 = new StringBuffer(); 

    public static void main(String args[]) 
    { 
        final CustomThread h = new CustomThread(); 

        new Thread() 
        { 
            public void run() 
            { 
                synchronized(this) 
                { 
                    h.sb1.append("A");
                    h.sb2.append("B"); 
                    
                    int i = 0;
                    while(i<100000)
                    { 
                    	i++;
                    }
                    
                    System.out.println(h.sb1); 
                    System.out.println(h.sb2); 
                } 
            } 
        }.start(); 

        new Thread() 
        { 
            public void run() 
            { 
                synchronized(this) 
                { 
                    h.sb1.append("D"); 
                    h.sb2.append("C"); 
                    System.out.println(h.sb2); 
                    System.out.println(h.sb1); 
                } 
            } 
        }.start(); 
    } 
}