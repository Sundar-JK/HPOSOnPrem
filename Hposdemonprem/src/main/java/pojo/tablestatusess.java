package pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="table_statuses")
public class tablestatusess {

	@Override
	public String toString() {
		return "tablestatusess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", status_label=" + status_label + ", icon=" + icon + ", label_color=" + label_color + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
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
	
	public tablestatusess(int id, LocalDateTime created_at, LocalDateTime updated_at, String status_label, String icon,
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@CreationTimestamp
	@Column(name="created_at")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updated_at;
	
	@Column(name="status_label")
	String status_label;
	
	@Column(name="icon")
	String icon;
	
	@Column(name="label_color")
	String label_color;
	
	public tablestatusess() {
		
	}
}
