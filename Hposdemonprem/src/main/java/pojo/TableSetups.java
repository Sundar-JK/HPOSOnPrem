package pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablesetups")
public class TableSetups {

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
	public String getLayoutcode() {
		return layoutcode;
	}
	public void setLayoutcode(String layoutcode) {
		this.layoutcode = layoutcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMaximum_guests() {
		return maximum_guests;
	}
	public void setMaximum_guests(String maximum_guests) {
		this.maximum_guests = maximum_guests;
	}
	public String getTrigger_alert_after_min() {
		return trigger_alert_after_min;
	}
	public void setTrigger_alert_after_min(String trigger_alert_after_min) {
		this.trigger_alert_after_min = trigger_alert_after_min;
	}
	public String getHospitality_type() {
		return hospitality_type;
	}
	public void setHospitality_type(String hospitality_type) {
		this.hospitality_type = hospitality_type;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	public TableSetups(int id, LocalDateTime created_at, LocalDateTime updated_at, String layoutcode, String description,
			String maximum_guests, String trigger_alert_after_min, String hospitality_type, String section) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.layoutcode = layoutcode;
		this.description = description;
		this.maximum_guests = maximum_guests;
		this.trigger_alert_after_min = trigger_alert_after_min;
		this.hospitality_type = hospitality_type;
		this.section = section;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@CreationTimestamp
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	private LocalDateTime updated_at;;
	
	@Column(name="layoutcode")
	String layoutcode;
	
	@Column(name="description")
	String description;
	
	@Column(name="maximum_guests")
	String maximum_guests;
	
	@Column(name="trigger_alert_after_min")
	String trigger_alert_after_min;
	
	@Column(name="hospitality_type")
	String hospitality_type;
	
	@Column(name="section")
	String section;
public TableSetups() {}	
}
