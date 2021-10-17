import java.util.*; 
  
class MessageSender 
{ 
    public synchronized void send(String msg) 
    { 
        System.out.println("Fast \t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread was interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
  
class MessageThreader extends Thread 
{ 
    private String msg; 
    private Thread thd; 
    MessageSender  sender; 
  
    MessageThreader(String m,  MessageSender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    { 
    	sender.send(msg);       
    } 
} 
  
public class DemoThreadSync
{ 
    public static void main(String args[]) 
    { 
        MessageSender snd = new MessageSender(); 
        MessageThreader S1 = 
            new MessageThreader( " life ... " , snd ); 
        MessageThreader S2 = 
            new MessageThreader( " death ... " , snd ); 
  
        S1.start(); 
        S2.start(); 
  
    } 
}

