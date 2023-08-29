package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "costingmethods_table")
public class costingmethods {
	
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
	public String getCosting_label() {
		return costing_label;
	}
	public void setCosting_label(String costing_label) {
		this.costing_label = costing_label;
	}
	public String getCosting_code() {
		return costing_code;
	}
	public void setCosting_code(String costing_code) {
		this.costing_code = costing_code;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	public costingmethods(int id, String created_at, String updated_at, String costing_label, String costing_code,
			String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.costing_label = costing_label;
		this.costing_code = costing_code;
		this.extra = extra;
		this.is_active = is_active;
	}
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="costingLabel")
	String costing_label;
	
	@Column(name="costingCode")
	String costing_code;
	
	@Column(name="extra")
	String extra;
	
	@Column(name="IsActive")
	String is_active;
	
public costingmethods() {}
}
