package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tableformlinks_table")
public class tableformlinks {
	
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
	public String getForm_id() {
		return form_id;
	}
	public void setForm_id(String form_id) {
		this.form_id = form_id;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	public tableformlinks(int id, String created_at, String updated_at, String form_id, String table_name,
			String model_name, String is_active, String user_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.form_id = form_id;
		this.table_name = table_name;
		this.model_name = model_name;
		this.is_active = is_active;
		this.user_id = user_id;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="FormID")
	String form_id;
	
	@Column(name="TableName")
	String table_name;
	
	@Column(name="ModelName")
	String model_name;
	
	@Column(name="IsActive")
	String is_active;
	
	@Column(name="UserId")
	String user_id;
	
	
	public tableformlinks() {}

}
