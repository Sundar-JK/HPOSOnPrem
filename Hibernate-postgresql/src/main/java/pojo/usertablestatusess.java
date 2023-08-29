package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertablestatusess_table")
public class usertablestatusess {

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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNextstatus() {
		return nextstatus;
	}
	public void setNextstatus(String nextstatus) {
		this.nextstatus = nextstatus;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	public usertablestatusess(int id, String created_at, String updated_at, String userid, String status,
			String nextstatus, String isactive, String createdby) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.userid = userid;
		this.status = status;
		this.nextstatus = nextstatus;
		this.isactive = isactive;
		this.createdby = createdby;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="userId")
	String userid;
	
	@Column(name="ststus")
	String status;
	
	@Column(name="nextstatus")
	String nextstatus;
	
	@Column(name="isActive")
	String isactive;
	
	@Column(name="createdBy")
	String createdby;
	
public usertablestatusess() {}
}
