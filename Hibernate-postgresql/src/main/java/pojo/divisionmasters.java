package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "divisionmasters_table")
public class divisionmasters {

	@Override
	public String toString() {
		return "divisionmasters [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", division_label=" + division_label + ", division_code=" + division_code + ", extra=" + extra
				+ ", is_active=" + is_active + "]";
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
	public String getDivision_label() {
		return division_label;
	}
	public void setDivision_label(String division_label) {
		this.division_label = division_label;
	}
	public String getDivision_code() {
		return division_code;
	}
	public void setDivision_code(String division_code) {
		this.division_code = division_code;
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
	
	public divisionmasters(int id, String created_at, String updated_at, String division_label, String division_code,
			String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.division_label = division_label;
		this.division_code = division_code;
		this.extra = extra;
		this.is_active = is_active;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="divisioinlabel")
	String division_label;
	
	@Column(name="divisionCode")
	String division_code;
	
	@Column(name="extra")
	String extra;
	
	@Column(name="IsActive")
	String is_active;

	public divisionmasters() {}
}
