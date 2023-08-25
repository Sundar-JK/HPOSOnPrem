package Com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertablestatus_table")
public class usertablestatuses1 {

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}
	public String getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		UpdatedAt = updatedAt;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getNextStatus() {
		return NextStatus;
	}
	public void setNextStatus(String nextStatus) {
		NextStatus = nextStatus;
	}
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		IsActive = isActive;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	
	public usertablestatuses1(int id, String createdAt, String updatedAt, String userId, String status,
			String nextStatus, String isActive, String createdBy) {
		super();
		Id = id;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
		UserId = userId;
		Status = status;
		NextStatus = nextStatus;
		IsActive = isActive;
		CreatedBy = createdBy;
	}
    
	@Id
    @Column(name="Id")
	int Id;
	
	@Column(name="CreatedAt")
	String CreatedAt;
	
	@Column(name="UpdatedAt")
	String UpdatedAt;
	
	@Column(name="UserId")
	String UserId;
	
	@Column(name="Status")
	String Status;
	
	@Column(name="NextStatus")
	String NextStatus;
	
	@Column(name="IsActive")
	String IsActive;
	
	@Column(name="CreatedBy")
	String CreatedBy;
	
public usertablestatuses1() {}

}
