package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shifts_table")
public class shifts {

	@Override
	public String toString() {
		return "shifts [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", shift_id="
				+ shift_id + ", label_id=" + label_id + "]";
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
	public String getShift_id() {
		return shift_id;
	}
	public void setShift_id(String shift_id) {
		this.shift_id = shift_id;
	}
	public String getLabel_id() {
		return label_id;
	}
	public void setLabel_id(String label_id) {
		this.label_id = label_id;
	}
	
	public shifts(int id, String created_at, String updated_at, String shift_id, String label_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.shift_id = shift_id;
		this.label_id = label_id;
	}
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="ShiftId")
	String shift_id;
	
	@Column(name="LabelId")
	String label_id;
	
public shifts() {}
}
