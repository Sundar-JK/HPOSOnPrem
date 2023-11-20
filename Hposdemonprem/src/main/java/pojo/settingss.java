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
@Table(name = "settings")
public class settingss {
	@Override
	public String toString() {
		return "settingss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", user=" + user
				+ ", store=" + store + ", setup=" + setup + ", is_active=" + is_active + ", tenant=" + tenant + "]";
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
	
	
	public settingss(int id, LocalDateTime created_at, LocalDateTime updated_at, String user, String store, String setup,
			String is_active, String tenant) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.user = user;
		this.store = store;
		this.setup = setup;
		this.is_active = is_active;
		this.tenant = tenant;
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
	
	@Column(name="Users")
	String user;
	
	@Column(name="Store")
	String store;
	
	@Column(name="setup")
	String setup;
	
	@Column(name="IsActive")
	String is_active;
	
	@Column(name="Tenant")
	String tenant;
	
	public settingss() {}
}
