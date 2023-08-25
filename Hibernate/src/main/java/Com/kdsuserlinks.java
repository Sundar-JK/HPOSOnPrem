package Com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "kdsuserlinks_table")
public class kdsuserlinks {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getKds_id() {
		return kds_id;
	}
	public void setKds_id(String kds_id) {
		this.kds_id = kds_id;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public kdsuserlinks(int id, String created_at, String updated_at, String user_id, String kds_id, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.user_id = user_id;
		this.kds_id = kds_id;
		this.is_active = is_active;
	}
	
	@Id
    @Column(name="Id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="user_id")
	String user_id;
	
	@Column(name="kds_id")
	String kds_id;
	
	@Column(name="is_active")
	String is_active;
	
	
public kdsuserlinks() {}
	
}
