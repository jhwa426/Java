
import java.util.Observer;

class Observable {
  public void addObserver(Observer o) {}
  public void deleteObserver(Observer o) {}
  public boolean hasChanged() {
	}
  public void notifyObservers() {}
  public void notifyObservers(Object arg) {}
  protected void setChanged() {}
}