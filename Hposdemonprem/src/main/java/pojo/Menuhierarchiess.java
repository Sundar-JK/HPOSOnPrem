package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menuhierarchies")
public class Menuhierarchiess {

	@Override
	public String toString() {
		return "Menuhierarchiess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", hierarchy_label=" + hierarchy_label + ", hierarchy_code=" + hierarchy_code + ", parent_id="
				+ parent_id + ", is_active=" + is_active + ", section_code=" + section_code + ", section_name="
				+ section_name + "]";
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
	public String getHierarchy_label() {
		return hierarchy_label;
	}
	public void setHierarchy_label(String hierarchy_label) {
		this.hierarchy_label = hierarchy_label;
	}
	public String getHierarchy_code() {
		return hierarchy_code;
	}
	public void setHierarchy_code(String hierarchy_code) {
		this.hierarchy_code = hierarchy_code;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getSection_code() {
		return section_code;
	}
	public void setSection_code(String section_code) {
		this.section_code = section_code;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	
	public Menuhierarchiess(int id, String created_at, String updated_at, String hierarchy_label, String hierarchy_code,
			String parent_id, String is_active, String section_code, String section_name) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.hierarchy_label = hierarchy_label;
		this.hierarchy_code = hierarchy_code;
		this.parent_id = parent_id;
		this.is_active = is_active;
		this.section_code = section_code;
		this.section_name = section_name;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="hierarchy_label")
	String hierarchy_label;
	
	@Column(name="hierarchy_code")
	String hierarchy_code;
	
	@Column(name="parent_id")
	String parent_id;
	
	@Column(name="is_active")
	String is_active;
	
	@Column(name="section_Code")
	String section_code;
	
	@Column(name="section_name")
	String section_name;

	public Menuhierarchiess() {}
}
