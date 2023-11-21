package pojo;
import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reason_masters")
public class ReasonMasterss {

	@Override
	public String toString() {
		return "ReasonMasterss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", reason="
				+ reason + ", reason_type=" + reason_type + ", is_active=" + is_active + "]";
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getReason_type() {
		return reason_type;
	}
	public void setReason_type(int reason_type) {
		this.reason_type = reason_type;
	}
	public boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	
	public ReasonMasterss(int id, LocalDateTime created_at, LocalDateTime updated_at, String reason, int reason_type,
			boolean is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.reason = reason;
		this.reason_type = reason_type;
		this.is_active = is_active;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	int id;
	
//	@CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//	@Column(name="created_at")
//	private String  created_at;
//     Date created_at;
	
	   @CreationTimestamp
	    @Column(name = "created_at")
	    private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	 private LocalDateTime updated_at;
//	 Date updated_at;
	
	@Column(name="reason")
	String reason;
	
	@Column(name="reason_type")
	int reason_type;
	
	@Column(name="is_active")
	private boolean is_active;
	
	public ReasonMasterss() {}
}
