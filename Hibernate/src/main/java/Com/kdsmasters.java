package Com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "kdsmaster_table")
public class kdsmasters {
	
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
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getKds_id() {
		return kds_id;
	}
	public void setKds_id(String kds_id) {
		this.kds_id = kds_id;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public kdsmasters(int id, String created_at, String updated_at, String store_id, String kds_id, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.store_id = store_id;
		this.kds_id = kds_id;
		this.is_active = is_active;
	}
	
	@Id
    @Column(name="Id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="store_id")
	String store_id;
	
	@Column(name="kds_id")
	String kds_id;
	
	@Column(name="is_active")
	String is_active;
	
public kdsmasters() {}
}
