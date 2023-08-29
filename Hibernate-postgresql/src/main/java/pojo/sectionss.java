package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sections")
public class sectionss {
	
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
	
	public sectionss(int id, String created_at, String updated_at, String code, String description,
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
	@Column(name="id")
	int id;
	@Column(name="createdAt")
	String created_at;
	@Column(name="updatedAt")
	String updated_at;
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
