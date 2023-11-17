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
@Table(name="sections")
public class sectionss {

	@Override
	public String toString() {
		return "sectionss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", code=" + code
				+ ", description=" + description + ", hospitality_type=" + hospitality_type + ", store_code="
				+ store_code + ", is_active=" + is_active + ", getId()=" + getId() + ", getCreated_at()="
				+ getCreated_at() + ", getUpdated_at()=" + getUpdated_at() + ", getCode()=" + getCode()
				+ ", getDescription()=" + getDescription() + ", getHospitality_type()=" + getHospitality_type()
				+ ", getStore_code()=" + getStore_code() + ", getIs_active()=" + getIs_active() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHospitality_type() {
		return hospitality_type;
	}
	public void setHospitality_type(String hospitality_type) {
		this.hospitality_type = hospitality_type;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	public sectionss(int id, LocalDateTime created_at, LocalDateTime updated_at, String code, String description,
			String hospitality_type, String store_code, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.description = description;
		this.hospitality_type = hospitality_type;
		this.store_code = store_code;
		this.is_active = is_active;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	
	@CreationTimestamp
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	
	@CreationTimestamp
	@Column(name="updated_at")
	private LocalDateTime updated_at;
	
	@Column(name="code")
	String code;
	@Column(name="description")
	String description;
	@Column(name="hospitality_type")
	String hospitality_type;
	@Column(name="store_code")
	String store_code;
	@Column(name="is_active")
	String is_active;

	public sectionss() {}

}
