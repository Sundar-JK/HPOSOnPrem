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
@Table(name="hospitalitytypes")
public class GetAllHospitalityTypess {

	@Override
	public String toString() {
		return "GetAllHospitalityTypess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", code=" + code + ", description=" + description + ", store_code=" + store_code + ", layout_view="
				+ layout_view + ", is_active=" + is_active + "]";
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
	
	
	public GetAllHospitalityTypess(int id, LocalDateTime created_at, LocalDateTime updated_at, String code, String description,
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
	private LocalDateTime updated_at;;
	
	@Column(name="code")
	String code;
	
	@Column(name="description")
	String description;
	
	@Column(name="store_code")
	String store_code;
	
	@Column(name="layout_view")
	String layout_view;
	
	@Column(name="is_active")
	String is_active;
	
	public GetAllHospitalityTypess() {}
	
}
