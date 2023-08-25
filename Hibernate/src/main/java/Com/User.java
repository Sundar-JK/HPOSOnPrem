package Com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
     @Id
	 int id;
	 String name;
	 int marks;
	 public User() {
	        // Default constructor
	    }
	 public User(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	 
}
