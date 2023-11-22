package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vat_masters")
public class Vatmasters {


	@Override
	public String toString() {
		return "Vatmasters [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", vat_code="
				+ vat_code + ", vat_percent=" + vat_percent + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", description=" + description + "]";
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
	public String getVat_code() {
		return vat_code;
	}
	public void setVat_code(String vat_code) {
		this.vat_code = vat_code;
	}
	public String getVat_percent() {
		return vat_percent;
	}
	public void setVat_percent(String vat_percent) {
		this.vat_percent = vat_percent;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Vatmasters(int id, String created_at, String updated_at, String vat_code, String vat_percent,
			String start_date, String end_date, String description) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.vat_code = vat_code;
		this.vat_percent = vat_percent;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="vat_code")
	String vat_code;
	
	@Column(name="vat_percent")
	String vat_percent;
	
	@Column(name="start_date")
	String start_date;
	
	@Column(name="end_date")
	String end_date;
	
	@Column(name="description")
	String description;

	
public Vatmasters() {}
}
