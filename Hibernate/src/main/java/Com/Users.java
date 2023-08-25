package Com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getShift_id() {
		return shift_id;
	}

	public void setShift_id(String shift_id) {
		this.shift_id = shift_id;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public Users(int id, String name, String email, String role, String shift_id, String branch_id) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.shift_id = shift_id;
		this.branch_id = branch_id;
	}
    @Id
	int id;
	String name;
	String email;
	String role;
	String shift_id;
	String branch_id;
	
	public Users() {
		
	}
	
	

}
