package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="getAllHospitalitytypes_table")
public class getAllHospitalityTypess {

	@Override
	public String toString() {
		return "getAllHospitalityTypess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", code=" + code + ", description=" + description + ", store_code=" + store_code + ", layout_view="
				+ layout_view + ", is_active=" + is_active + "]";
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
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getLayout_view() {
		return layout_view;
	}
	public void setLayout_view(String layout_view) {
		this.layout_view = layout_view;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	
	public getAllHospitalityTypess(int id, String created_at, String updated_at, String code, String description,
			String store_code, String layout_view, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.description = description;
		this.store_code = store_code;
		this.layout_view = layout_view;
		this.is_active = is_active;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="Code")
	String code;
	
	@Column(name="Description")
	String description;
	
	@Column(name="Storecode")
	String store_code;
	
	@Column(name="LayoutView")
	String layout_view;
	
	@Column(name="IsActive")
	String is_active;
	
	public getAllHospitalityTypess() {}
	
	
}
