package Com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertablelinks_table")
public class usertablelinks {
	
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTable_id() {
		return table_id;
	}
	public void setTable_id(String table_id) {
		this.table_id = table_id;
	}
	public String getActive_status() {
		return active_status;
	}
	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}
	public usertablelinks(int id, String created_at, String updated_at, String userid, String table_id,
			String active_status) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.userid = userid;
		this.table_id = table_id;
		this.active_status = active_status;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="userid")
	String userid;
	
	@Column(name="table_id")
	String table_id;
	
	@Column(name="active_status")
	String active_status;
	
public usertablelinks() {}	

}
