package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "portioncosthierarchies_table")
public class portioncosthierarchies {

	@Override
	public String toString() {
		return "portioncosthierarchies [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", portion_cost_hierarchy_label=" + portion_cost_hierarchy_label + ", portion_cost_hierarchy_code="
				+ portion_cost_hierarchy_code + ", extra=" + extra + ", is_active=" + is_active + ", getId()=" + getId()
				+ ", getCreated_at()=" + getCreated_at() + ", getUpdated_at()=" + getUpdated_at()
				+ ", getPortion_cost_hierarchy_label()=" + getPortion_cost_hierarchy_label()
				+ ", getPortion_cost_hierarchy_code()=" + getPortion_cost_hierarchy_code() + ", getExtra()="
				+ getExtra() + ", getIs_active()=" + getIs_active() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
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
	public String getPortion_cost_hierarchy_label() {
		return portion_cost_hierarchy_label;
	}
	public void setPortion_cost_hierarchy_label(String portion_cost_hierarchy_label) {
		this.portion_cost_hierarchy_label = portion_cost_hierarchy_label;
	}
	public String getPortion_cost_hierarchy_code() {
		return portion_cost_hierarchy_code;
	}
	public void setPortion_cost_hierarchy_code(String portion_cost_hierarchy_code) {
		this.portion_cost_hierarchy_code = portion_cost_hierarchy_code;
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
	
	public portioncosthierarchies(int id, String created_at, String updated_at, String portion_cost_hierarchy_label,
			String portion_cost_hierarchy_code, String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.portion_cost_hierarchy_label = portion_cost_hierarchy_label;
		this.portion_cost_hierarchy_code = portion_cost_hierarchy_code;
		this.extra = extra;
		this.is_active = is_active;
	}

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="PortionCost_hierarchyLabel")
	String portion_cost_hierarchy_label;
	
	@Column(name="PortionCost_hierarchycode")
	String portion_cost_hierarchy_code;
	
	@Column(name="Extra")
	String extra;
	
	@Column(name="isActive")
	String is_active;
	
	public portioncosthierarchies() {}
	
	
}
