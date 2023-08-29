package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "settings_table")
public class settingss {

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
	
	
	
	public settingss(int id, String created_at, String updated_at, String user, String store, String setup,
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
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
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
