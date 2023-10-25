package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producthierarchy_table")
public class ProductHierarchyLinkss {

	@Override
	public String toString() {
		return "ProductHierarchyLinkss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", product_id=" + product_id + ", hierarchy_id=" + hierarchy_id + "]";
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
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getHierarchy_id() {
		return hierarchy_id;
	}
	public void setHierarchy_id(String hierarchy_id) {
		this.hierarchy_id = hierarchy_id;
	}
	
	
	public ProductHierarchyLinkss(int id, String created_at, String updated_at, String product_id,
			String hierarchy_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.product_id = product_id;
		this.hierarchy_id = hierarchy_id;
	}


	@Id
	@Column(name="Id")
	int id;
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="productId")
	String product_id;
	
	@Column(name="HierarchyId")
	String hierarchy_id;
	
	public ProductHierarchyLinkss() {}
}
