package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes_table")
public class recipes {
	
	@Override
	public String toString() {
		return "recipes [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", parent_item_no="
				+ parent_item_no + ", line_no=" + line_no + ", type=" + type + ", no=" + no + ", assembly_bom="
				+ assembly_bom + ", description=" + description + ", unit_of_measure_code=" + unit_of_measure_code
				+ ", quantity_per=" + quantity_per + ", bom_description=" + bom_description + ", resource_usage_type="
				+ resource_usage_type + ", bom_recipe_version_code=" + bom_recipe_version_code + ", bom_component_type="
				+ bom_component_type + ", recipe_version_code=" + recipe_version_code + ", wastage_=" + wastage_
				+ ", gross_weight=" + gross_weight + ", net_weight=" + net_weight + ", cost=" + cost
				+ ", exclude_from_menu_requisition=" + exclude_from_menu_requisition + ", excluded_from_portion_weight="
				+ excluded_from_portion_weight + ", unaff_by_multipl_factor=" + unaff_by_multipl_factor + ", item_no="
				+ item_no + ", qty_per_recipe_noof_portions=" + qty_per_recipe_noof_portions + ", exclusion="
				+ exclusion + ", price_on_exclusion=" + price_on_exclusion + "]";
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
	public String getParent_item_no() {
		return parent_item_no;
	}
	public void setParent_item_no(String parent_item_no) {
		this.parent_item_no = parent_item_no;
	}
	public String getLine_no() {
		return line_no;
	}
	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAssembly_bom() {
		return assembly_bom;
	}
	public void setAssembly_bom(String assembly_bom) {
		this.assembly_bom = assembly_bom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnit_of_measure_code() {
		return unit_of_measure_code;
	}
	public void setUnit_of_measure_code(String unit_of_measure_code) {
		this.unit_of_measure_code = unit_of_measure_code;
	}
	public String getQuantity_per() {
		return quantity_per;
	}
	public void setQuantity_per(String quantity_per) {
		this.quantity_per = quantity_per;
	}
	public String getBom_description() {
		return bom_description;
	}
	public void setBom_description(String bom_description) {
		this.bom_description = bom_description;
	}
	public String getResource_usage_type() {
		return resource_usage_type;
	}
	public void setResource_usage_type(String resource_usage_type) {
		this.resource_usage_type = resource_usage_type;
	}
	public String getBom_recipe_version_code() {
		return bom_recipe_version_code;
	}
	public void setBom_recipe_version_code(String bom_recipe_version_code) {
		this.bom_recipe_version_code = bom_recipe_version_code;
	}
	public String getBom_component_type() {
		return bom_component_type;
	}
	public void setBom_component_type(String bom_component_type) {
		this.bom_component_type = bom_component_type;
	}
	public String getRecipe_version_code() {
		return recipe_version_code;
	}
	public void setRecipe_version_code(String recipe_version_code) {
		this.recipe_version_code = recipe_version_code;
	}
	public String getWastage_() {
		return wastage_;
	}
	public void setWastage_(String wastage_) {
		this.wastage_ = wastage_;
	}
	public String getGross_weight() {
		return gross_weight;
	}
	public void setGross_weight(String gross_weight) {
		this.gross_weight = gross_weight;
	}
	public String getNet_weight() {
		return net_weight;
	}
	public void setNet_weight(String net_weight) {
		this.net_weight = net_weight;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getExclude_from_menu_requisition() {
		return exclude_from_menu_requisition;
	}
	public void setExclude_from_menu_requisition(String exclude_from_menu_requisition) {
		this.exclude_from_menu_requisition = exclude_from_menu_requisition;
	}
	public String getExcluded_from_portion_weight() {
		return excluded_from_portion_weight;
	}
	public void setExcluded_from_portion_weight(String excluded_from_portion_weight) {
		this.excluded_from_portion_weight = excluded_from_portion_weight;
	}
	public String getUnaff_by_multipl_factor() {
		return unaff_by_multipl_factor;
	}
	public void setUnaff_by_multipl_factor(String unaff_by_multipl_factor) {
		this.unaff_by_multipl_factor = unaff_by_multipl_factor;
	}
	public String getItem_no() {
		return item_no;
	}
	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}
	public String getQty_per_recipe_noof_portions() {
		return qty_per_recipe_noof_portions;
	}
	public void setQty_per_recipe_noof_portions(String qty_per_recipe_noof_portions) {
		this.qty_per_recipe_noof_portions = qty_per_recipe_noof_portions;
	}
	public String getExclusion() {
		return exclusion;
	}
	public void setExclusion(String exclusion) {
		this.exclusion = exclusion;
	}
	public String getPrice_on_exclusion() {
		return price_on_exclusion;
	}
	public void setPrice_on_exclusion(String price_on_exclusion) {
		this.price_on_exclusion = price_on_exclusion;
	}
	public recipes(int id, String created_at, String updated_at, String parent_item_no, String line_no, String type,
			String no, String assembly_bom, String description, String unit_of_measure_code, String quantity_per,
			String bom_description, String resource_usage_type, String bom_recipe_version_code,
			String bom_component_type, String recipe_version_code, String wastage_, String gross_weight,
			String net_weight, String cost, String exclude_from_menu_requisition, String excluded_from_portion_weight,
			String unaff_by_multipl_factor, String item_no, String qty_per_recipe_noof_portions, String exclusion,
			String price_on_exclusion) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.parent_item_no = parent_item_no;
		this.line_no = line_no;
		this.type = type;
		this.no = no;
		this.assembly_bom = assembly_bom;
		this.description = description;
		this.unit_of_measure_code = unit_of_measure_code;
		this.quantity_per = quantity_per;
		this.bom_description = bom_description;
		this.resource_usage_type = resource_usage_type;
		this.bom_recipe_version_code = bom_recipe_version_code;
		this.bom_component_type = bom_component_type;
		this.recipe_version_code = recipe_version_code;
		this.wastage_ = wastage_;
		this.gross_weight = gross_weight;
		this.net_weight = net_weight;
		this.cost = cost;
		this.exclude_from_menu_requisition = exclude_from_menu_requisition;
		this.excluded_from_portion_weight = excluded_from_portion_weight;
		this.unaff_by_multipl_factor = unaff_by_multipl_factor;
		this.item_no = item_no;
		this.qty_per_recipe_noof_portions = qty_per_recipe_noof_portions;
		this.exclusion = exclusion;
		this.price_on_exclusion = price_on_exclusion;
	}
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="Created_at")
	String created_at;
	
	@Column(name="Updated_at")
	String updated_at;
	
	@Column(name="parent_item_no")
	String parent_item_no;
	
	@Column(name="line_no")
	String line_no;
	
	@Column(name="type")
	String type;
	
	@Column(name="no")
	String no;
	
	@Column(name="assembly_bom")
	String assembly_bom;
	
	
	@Column(name="description")
	String description;
	
	@Column(name="unit_of_measure_code")
	String unit_of_measure_code;
	
	@Column(name="quantity_per")
	String quantity_per;
	
	@Column(name="bom_description")
	String bom_description;
	
	@Column(name="resource_usage_type")
	String resource_usage_type;
	
	@Column(name="bom_recipe_version_code")
	String bom_recipe_version_code;
	
	@Column(name="bom_component_type")
	String bom_component_type;
	
	@Column(name="recipe_version_code")
	String recipe_version_code;
	
	@Column(name="wastage_")
	String wastage_;
	
	@Column(name="gross_weight")
	String gross_weight;
	
	@Column(name="net_weight")
	String net_weight;
	
	@Column(name="cost")
	String cost;
	
	@Column(name="exclude_from_menu_requisition")
	String exclude_from_menu_requisition;
	
	@Column(name="excluded_from_portion_weight")
	String excluded_from_portion_weight;
	
	@Column(name="unaff_by_multipl_factor")
	String unaff_by_multipl_factor;
	
	@Column(name="item_no")
	String item_no;
	
	@Column(name="qty_per_recipe_noof_portions")
	String qty_per_recipe_noof_portions;
	
	@Column(name="exclusion")
	String exclusion;
	
	@Column(name="price_on_exclusion")
	String price_on_exclusion;
	
	
public recipes() {}	
}
