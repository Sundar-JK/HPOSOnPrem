package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "discounttypes_table")
public class discounttypess {

	@Override
	public String toString() {
		return "discounttypess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", label="
				+ label + ", type=" + type + ", label_id=" + label_id + ", description=" + description + "]";
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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabel_id() {
		return label_id;
	}
	public void setLabel_id(String label_id) {
		this.label_id = label_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public discounttypess(int id, String created_at, String updated_at, String label, String type, String label_id,
			String description) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.label = label;
		this.type = type;
		this.label_id = label_id;
		this.description = description;
	}


	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="Label")
	String label;
	
	@Column(name="Type")
	String type;
	
	@Column(name="labelId")
	String label_id;
	
	@Column(name="Description")
	String description;
	
	public discounttypess() {}
}
