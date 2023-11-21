package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gui_menuses")
public class Guimenus {


	@Override
	public String toString() {
		return "Guimenus [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", gui_menu_label=" + gui_menu_label + ", gui_menu_code=" + gui_menu_code + ", icon=" + icon
				+ ", color=" + color + ", badge_color=" + badge_color + ", parent_id=" + parent_id + ", is_active="
				+ is_active + ", form_id=" + form_id + "]";
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
	public String getGui_menu_label() {
		return gui_menu_label;
	}
	public void setGui_menu_label(String gui_menu_label) {
		this.gui_menu_label = gui_menu_label;
	}
	public String getGui_menu_code() {
		return gui_menu_code;
	}
	public void setGui_menu_code(String gui_menu_code) {
		this.gui_menu_code = gui_menu_code;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBadge_color() {
		return badge_color;
	}
	public void setBadge_color(String badge_color) {
		this.badge_color = badge_color;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public String getForm_id() {
		return form_id;
	}
	public void setForm_id(String form_id) {
		this.form_id = form_id;
	}
	
	public Guimenus(int id, String created_at, String updated_at, String gui_menu_label, String gui_menu_code,
			String icon, String color, String badge_color, String parent_id, String is_active, String form_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.gui_menu_label = gui_menu_label;
		this.gui_menu_code = gui_menu_code;
		this.icon = icon;
		this.color = color;
		this.badge_color = badge_color;
		this.parent_id = parent_id;
		this.is_active = is_active;
		this.form_id = form_id;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="GuiMenuLabel")
	String gui_menu_label;
	
	@Column(name="GuiMenuCode")
	String gui_menu_code;
	
	@Column(name="Icon")
	String icon;
	
	@Column(name="Color")
	String color;
	
	@Column(name="BadgeColor")
	String badge_color;
	
	@Column(name="ParentId")
	String parent_id;
	
	@Column(name="IsActive")
	String is_active;
	
	@Column(name="FormId")
	String form_id;

	public Guimenus() {}
}
