package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Tablestatuses")
public class tablestatuses {

	@Override
	public String toString() {
		return "tablestatuses [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", status_label=" + status_label + ", icon=" + icon + ", label_color=" + label_color + "]";
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
	public String getStatus_label() {
		return status_label;
	}
	public void setStatus_label(String status_label) {
		this.status_label = status_label;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLabel_color() {
		return label_color;
	}
	public void setLabel_color(String label_color) {
		this.label_color = label_color;
	}
	
	public tablestatuses(int id, String created_at, String updated_at, String status_label, String icon,
			String label_color) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.status_label = status_label;
		this.icon = icon;
		this.label_color = label_color;
	}

	@Id
	@Column(name="id")
	
	int id;
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="statusLabel")
	String status_label;
	
	@Column(name="Icon")
	String icon;
	
	@Column(name="Lablecolor")
	String label_color;
	
	public tablestatuses() {
		
	}
}
