package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table_setup_status_table")
public class tablesetupstatusess {

	@Override
	public String toString() {
		return "tablesetupstatusess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", tableid=" + tableid
				+ ", status=" + status + ", notes=" + notes + ", status_icon=" + status_icon + ", transaction_ref_id="
				+ transaction_ref_id + ", user_id=" + user_id + ", previous_status=" + previous_status
				+ ", guest_count=" + guest_count + "]";
	}
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
	public String getTableid() {
		return tableid;
	}
	public void setTableid(String tableid) {
		this.tableid = tableid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getStatus_icon() {
		return status_icon;
	}
	public void setStatus_icon(String status_icon) {
		this.status_icon = status_icon;
	}
	public String getTransaction_ref_id() {
		return transaction_ref_id;
	}
	public void setTransaction_ref_id(String transaction_ref_id) {
		this.transaction_ref_id = transaction_ref_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPrevious_status() {
		return previous_status;
	}
	public void setPrevious_status(String previous_status) {
		this.previous_status = previous_status;
	}
	public String getGuest_count() {
		return guest_count;
	}
	public void setGuest_count(String guest_count) {
		this.guest_count = guest_count;
	}
	
	public tablesetupstatusess(int id, String created_at, String updated_at, String tableid, String status, String notes,
			String status_icon, String transaction_ref_id, String user_id, String previous_status, String guest_count) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.tableid = tableid;
		this.status = status;
		this.notes = notes;
		this.status_icon = status_icon;
		this.transaction_ref_id = transaction_ref_id;
		this.user_id = user_id;
		this.previous_status = previous_status;
		this.guest_count = guest_count;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="tableid")
	String tableid;
	
	@Column(name="status")
	String status;
	@Column(name="notes")
	String notes;
	@Column(name="statusIcon")
	String status_icon;
	@Column(name="transactionRefid")
	String transaction_ref_id;
	@Column(name="userId")
	String user_id;
	@Column(name="previous_status")
	String previous_status;
	@Column(name="guestCount")
	String guest_count;
	
public tablesetupstatusess() {}
}
