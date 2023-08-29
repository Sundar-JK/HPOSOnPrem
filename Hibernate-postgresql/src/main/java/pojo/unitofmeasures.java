package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Unitofmeasures_table")
public class unitofmeasures {

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
	public String getInternational_standard_code() {
		return international_standard_code;
	}
	public void setInternational_standard_code(String international_standard_code) {
		this.international_standard_code = international_standard_code;
	}
	
	
	
	public unitofmeasures(int id, String created_at, String updated_at, String code, String description,
			String international_standard_code) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.description = description;
		this.international_standard_code = international_standard_code;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="Code")
	String code;
	
	@Column(name="description")
	String description;
	
	@Column(name="InternationalStandardCode")
	String international_standard_code;
	
	public unitofmeasures() {}
}
