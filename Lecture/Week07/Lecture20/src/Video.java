import java.util.List;

public class Video {
   private List<Customer> _customers;
   private boolean success;
   public Video() {      
   }
   boolean getOnRent(Customer customer) {
      success = false;
      _customers.add(customer);
      success = true;
      return success;
   }
   public List<Customer> getCustomers(){
      return _customers;
   }
}

public class Customer extends Video{
   private List<video> _videos;
   public Customer() {    
   }
   public boolean rent(Video video) {
      _videos.add(video);
      video.getOnRent(this);
      return true;
   }
   public List<video> getVideos(){
      return _videos;
   }
}