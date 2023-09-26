package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemmodifiers_headers")
public class item_modifierheader {

	@Override
	public String toString() {
		return "item_modifierheader [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", code="
				+ code + ", description=" + description + ", prompt=" + prompt + ", display_option=" + display_option
				+ ", once_per_transaction=" + once_per_transaction + ", min_selection=" + min_selection
				+ ", max_selection=" + max_selection + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", multiple_selection=" + multiple_selection + ", triggering=" + triggering + ", priority=" + priority
				+ ", uom=" + uom + ", item_no=" + item_no + "]";
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
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getDisplay_option() {
		return display_option;
	}
	public void setDisplay_option(String display_option) {
		this.display_option = display_option;
	}
	public String getOnce_per_transaction() {
		return once_per_transaction;
	}
	public void setOnce_per_transaction(String once_per_transaction) {
		this.once_per_transaction = once_per_transaction;
	}
	public String getMin_selection() {
		return min_selection;
	}
	public void setMin_selection(String min_selection) {
		this.min_selection = min_selection;
	}
	public String getMax_selection() {
		return max_selection;
	}
	public void setMax_selection(String max_selection) {
		this.max_selection = max_selection;
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
	public String getMultiple_selection() {
		return multiple_selection;
	}
	public void setMultiple_selection(String multiple_selection) {
		this.multiple_selection = multiple_selection;
	}
	public String getTriggering() {
		return triggering;
	}
	public void setTriggering(String triggering) {
		this.triggering = triggering;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getItem_no() {
		return item_no;
	}
	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}
	public item_modifierheader(int id, String created_at, String updated_at, String code, String description,
			String prompt, String display_option, String once_per_transaction, String min_selection,
			String max_selection, String start_date, String end_date, String multiple_selection, String triggering,
			String priority, String uom, String item_no) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.description = description;
		this.prompt = prompt;
		this.display_option = display_option;
		this.once_per_transaction = once_per_transaction;
		this.min_selection = min_selection;
		this.max_selection = max_selection;
		this.start_date = start_date;
		this.end_date = end_date;
		this.multiple_selection = multiple_selection;
		this.triggering = triggering;
		this.priority = priority;
		this.uom = uom;
		this.item_no = item_no;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	@Column(name="updated_at")
	String updated_at;
	@Column(name="code")
	String code;
	@Column(name="description")
	String description;
	
	@Column(name="prompt")
	String  prompt;
	
	@Column(name="display_option")
	String display_option;
	
	@Column(name="once_per_transaction")
	String once_per_transaction;
	
	@Column(name="min_selection")
	String min_selection;
	
	@Column(name="max_selection")
	String max_selection;
	
	@Column(name="start_date")
	String start_date;
	
	@Column(name="end_date")
	String end_date;
	
	@Column(name="multiple_selection")
	String multiple_selection;
	
	@Column(name="triggering")
	String triggering;
	
	@Column(name="priority")
	String priority;
	
	@Column(name="uom")
	String uom;
	
	@Column(name="item_no")
	String item_no;
public item_modifierheader() {}	
}
