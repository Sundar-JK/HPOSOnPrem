package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "portionweight_table")
public class portionweights {

	@Override
	public String toString() {
		return "portionweights [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", portion_weight_label=" + portion_weight_label + ", portion_weight_code=" + portion_weight_code
				+ ", portion_weight_value=" + portion_weight_value + ", extra=" + extra + ", is_active=" + is_active
				+ "]";
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
	public String getPortion_weight_label() {
		return portion_weight_label;
	}
	public void setPortion_weight_label(String portion_weight_label) {
		this.portion_weight_label = portion_weight_label;
	}
	public String getPortion_weight_code() {
		return portion_weight_code;
	}
	public void setPortion_weight_code(String portion_weight_code) {
		this.portion_weight_code = portion_weight_code;
	}
	public String getPortion_weight_value() {
		return portion_weight_value;
	}
	public void setPortion_weight_value(String portion_weight_value) {
		this.portion_weight_value = portion_weight_value;
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
	
	
	public portionweights(int id, String created_at, String updated_at, String portion_weight_label,
			String portion_weight_code, String portion_weight_value, String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.portion_weight_label = portion_weight_label;
		this.portion_weight_code = portion_weight_code;
		this.portion_weight_value = portion_weight_value;
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
	
	@Column(name="PortionweightLabel")
	String portion_weight_label;
	
	@Column(name="portionWeightCode")
	String portion_weight_code;
	
	@Column(name="portionWeightvalue")
	String portion_weight_value;
	
	@Column(name="Extra")
	String extra;
	
	@Column(name="IsActive")
	String is_active;

	public portionweights() {}
}
