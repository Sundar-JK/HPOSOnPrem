package pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertablestatuses")
public class Usertablestatusess {

	@Override
	public String toString() {
		return "Usertablestatusess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", userid=" + userid + ", status=" + status + ", nextstatus=" + nextstatus + ", isactive=" + isactive
				+ ", createdby=" + createdby + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
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
	
	public Usertablestatusess(int id, LocalDateTime created_at, LocalDateTime updated_at, String userid, String status,
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@CreationTimestamp
	@Column(name="createdAt")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updatedAt")
	private LocalDateTime updated_at;
	
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
	
public Usertablestatusess() {}
}
