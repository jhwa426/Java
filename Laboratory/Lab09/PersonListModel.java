//Q05
import java.util.ArrayList;
import javax.swing.AbstractListModel;

class PersonListModel<Person> extends AbstractListModel<Person>{
	private ArrayList<Person> people = new ArrayList<Person>();

	public PersonListModel(){
		this.people = new ArrayList<Person>();
	}
	
	@Override
	public int getSize() {
		return this.people.size();
	}

	@Override
	public Person getElementAt(int index) {
		return this.people.get(index);
	}
	
	public void addElement(Person element) {
		this.people.add(element);
		int index = this.people.size();
		this.fireIntervalAdded(element, index, index);
	}
	
	public void removeElementAt(int index) {
		this.people.remove(index);
		this.fireIntervalRemoved(this, index, index);
	}
}
