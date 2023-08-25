package Com;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users_table")
public class usershpos {

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
	public usershpos(int id, String name, String email, String role, String shift_id, String branch_id) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.shift_id = shift_id;
		this.branch_id = branch_id;
	}

	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="role")
	String role;
	
	@Column(name="shift_id")
	String shift_id;
	
	@Column(name="branch_id")
	String branch_id;
	
	public usershpos() {
		
	}
}
