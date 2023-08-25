package Com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemmodifierdetails_table")
public class itemmodifierdetails {

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
	public String getSub_code() {
		return Sub_code;
	}
	public void setSub_code(String sub_code) {
		Sub_code = sub_code;
	}
	public String getItem_no() {
		return item_no;
	}
	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription_2() {
		return description_2;
	}
	public void setDescription_2(String description_2) {
		this.description_2 = description_2;
	}
	public String getQty_per_uom() {
		return qty_per_uom;
	}
	public void setQty_per_uom(String qty_per_uom) {
		this.qty_per_uom = qty_per_uom;
	}
	public String getMax_selection() {
		return max_selection;
	}
	public void setMax_selection(String max_selection) {
		this.max_selection = max_selection;
	}
	public String getMin_selection() {
		return min_selection;
	}
	public void setMin_selection(String min_selection) {
		this.min_selection = min_selection;
	}
	public String getPrice_type() {
		return price_type;
	}
	public void setPrice_type(String price_type) {
		this.price_type = price_type;
	}
	public String getPrice_handling() {
		return price_handling;
	}
	public void setPrice_handling(String price_handling) {
		this.price_handling = price_handling;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getUsage_category() {
		return usage_category;
	}
	public void setUsage_category(String usage_category) {
		this.usage_category = usage_category;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	public itemmodifierdetails(int id, String created_at, String updated_at, String code, String sub_code,
			String item_no, String description, String description_2, String qty_per_uom, String max_selection,
			String min_selection, String price_type, String price_handling, String uom, String usage_category,
			String priority) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		Sub_code = sub_code;
		this.item_no = item_no;
		this.description = description;
		this.description_2 = description_2;
		this.qty_per_uom = qty_per_uom;
		this.max_selection = max_selection;
		this.min_selection = min_selection;
		this.price_type = price_type;
		this.price_handling = price_handling;
		this.uom = uom;
		this.usage_category = usage_category;
		this.priority = priority;
	}
	
	@Id
    @Column(name="Id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="code")
	String code;
	
	@Column(name="Sub_code")
	String Sub_code;
	
	@Column(name="item_no")
	String item_no;
	
	@Column(name="description")
	String description;
	
	@Column(name="description_2")
	String description_2;
	
	@Column(name="qty_per_uom")
	String qty_per_uom;
	
	@Column(name="max_selection")
	String max_selection;
	
	@Column(name="min_selection")
	String min_selection;
	
	@Column(name="price_type")
	String price_type;
	
	@Column(name="price_handling")
	String price_handling;
	
	@Column(name="uom")
	String uom;
	
	@Column(name="usage_category")
	String usage_category;
	
	@Column(name="priority")
	String priority;

public itemmodifierdetails() {}
	
}
