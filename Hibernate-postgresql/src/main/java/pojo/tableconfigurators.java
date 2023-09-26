package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tableconfigurators_table")
public class tableconfigurators {

	@Override
	public String toString() {
		return "tableconfigurators [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", enabled=" + enabled + ", field_no=" + field_no + ", field_name=" + field_name + ", caption="
				+ caption + ", data_type=" + data_type + ", length=" + length + ", description=" + description
				+ ", field_class=" + field_class + ", option_string=" + option_string + ", form_id=" + form_id
				+ ", page_id=" + page_id + ", store_id=" + store_id + ", user_id=" + user_id + ", ui_columns="
				+ ui_columns + ", priority=" + priority + ", group_id=" + group_id + ", group_label=" + group_label
				+ ", mandatory=" + mandatory + ", option_type=" + option_type + ", option_url=" + option_url
				+ ", option_key=" + option_key + ", option_label=" + option_label + ", form_enabled=" + form_enabled
				+ "]";
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
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getField_no() {
		return field_no;
	}
	public void setField_no(String field_no) {
		this.field_no = field_no;
	}
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getField_class() {
		return field_class;
	}
	public void setField_class(String field_class) {
		this.field_class = field_class;
	}
	public String getOption_string() {
		return option_string;
	}
	public void setOption_string(String option_string) {
		this.option_string = option_string;
	}
	public String getForm_id() {
		return form_id;
	}
	public void setForm_id(String form_id) {
		this.form_id = form_id;
	}
	public String getPage_id() {
		return page_id;
	}
	public void setPage_id(String page_id) {
		this.page_id = page_id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUi_columns() {
		return ui_columns;
	}
	public void setUi_columns(String ui_columns) {
		this.ui_columns = ui_columns;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroup_label() {
		return group_label;
	}
	public void setGroup_label(String group_label) {
		this.group_label = group_label;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	public String getOption_type() {
		return option_type;
	}
	public void setOption_type(String option_type) {
		this.option_type = option_type;
	}
	public String getOption_url() {
		return option_url;
	}
	public void setOption_url(String option_url) {
		this.option_url = option_url;
	}
	public String getOption_key() {
		return option_key;
	}
	public void setOption_key(String option_key) {
		this.option_key = option_key;
	}
	public String getOption_label() {
		return option_label;
	}
	public void setOption_label(String option_label) {
		this.option_label = option_label;
	}
	public String getForm_enabled() {
		return form_enabled;
	}
	public void setForm_enabled(String form_enabled) {
		this.form_enabled = form_enabled;
	}
	
	
	public tableconfigurators(int id, String created_at, String updated_at, String enabled, String field_no,
			String field_name, String caption, String data_type, String length, String description, String field_class,
			String option_string, String form_id, String page_id, String store_id, String user_id, String ui_columns,
			String priority, String group_id, String group_label, String mandatory, String option_type,
			String option_url, String option_key, String option_label, String form_enabled) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.enabled = enabled;
		this.field_no = field_no;
		this.field_name = field_name;
		this.caption = caption;
		this.data_type = data_type;
		this.length = length;
		this.description = description;
		this.field_class = field_class;
		this.option_string = option_string;
		this.form_id = form_id;
		this.page_id = page_id;
		this.store_id = store_id;
		this.user_id = user_id;
		this.ui_columns = ui_columns;
		this.priority = priority;
		this.group_id = group_id;
		this.group_label = group_label;
		this.mandatory = mandatory;
		this.option_type = option_type;
		this.option_url = option_url;
		this.option_key = option_key;
		this.option_label = option_label;
		this.form_enabled = form_enabled;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="Enabled")
	String enabled;
	
	@Column(name="FieldNo")
	String field_no;
	
	@Column(name="FieldName")
	String field_name;
	
	@Column(name="Caption")
	String caption;
	
	@Column(name="dataType")
	String data_type;
	
	@Column(name="length")
	String length;
	
	@Column(name="Description")
	String description;
	
	@Column(name="FieldClass")
	String field_class;
	
	@Column(name="OptionString")
	String option_string;
	
	@Column(name="FormId")
	String form_id;
	
	@Column(name="pageId")
	String page_id;
	
	@Column(name="StoreId")
	String store_id;
	
	@Column(name="userId")
	String user_id;
	
	@Column(name="UiColumns")
	String ui_columns;
	
	@Column(name="priority")
	String priority;
	
	@Column(name="groupId")
	String group_id;
	
	@Column(name="groupLabel")
	String group_label;
	
	@Column(name="Mandatory")
	String mandatory;
	
	@Column(name="optionType")
	String option_type;
	
	@Column(name="OptionUrl")
	String option_url;
	
	@Column(name="OptionKey")
	String option_key;
	
	@Column(name="optionlabel")
	String option_label;
	
	@Column(name="FormEnabled")
	String form_enabled;

	public tableconfigurators() {}
}
