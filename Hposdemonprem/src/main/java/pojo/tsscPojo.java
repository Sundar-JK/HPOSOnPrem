package pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table_setup_statuses")
public class tsscPojo {

	@Override
	public String toString() {
		return "tsscPojo [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", tableid=" + tableid
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
	
	public tsscPojo(int id, LocalDateTime created_at, LocalDateTime updated_at, String tableid, String status, String notes,
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;;
	
	@CreationTimestamp
	@Column(name="created_at")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updated_at;
	
	@Column(name="tableid")
	String tableid;
	
	@Column(name="status")
	String status;
	
	@Column(name="notes")
	String notes;
	
	@Column(name="status_icon")
	String status_icon;
	
	@Column(name="transaction_ref_id")
	String transaction_ref_id;
	
	@Column(name="user_id")
	String user_id;
	
	@Column(name="previous_status")
	String previous_status;
	
	@Column(name="guest_count")
	String guest_count;
	
public tsscPojo() {}

}
