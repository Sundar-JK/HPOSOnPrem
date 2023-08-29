package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productgroupmasters_table")
public class product_groupmasters {

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
	public String getProduct_group_label() {
		return product_group_label;
	}
	public void setProduct_group_label(String product_group_label) {
		this.product_group_label = product_group_label;
	}
	public String getProduct_group_code() {
		return product_group_code;
	}
	public void setProduct_group_code(String product_group_code) {
		this.product_group_code = product_group_code;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	public product_groupmasters(int id, String created_at, String updated_at, String product_group_label,
			String product_group_code, String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.product_group_label = product_group_label;
		this.product_group_code = product_group_code;
		this.extra = extra;
		this.is_active = is_active;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="productGrouplabel")
	String product_group_label;
	
	@Column(name="productGroupCode")
	String product_group_code;
	
	@Column(name="Extra")
	String extra;
	
	@Column(name="IsActive")
	String is_active;
	
public product_groupmasters() {}
}
