package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "menuitems_table")
public class MenuItems {


    @Override
	public String toString() {
		return "MenuItems [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", no=" + no
				+ ", description=" + description + ", arabic_description=" + arabic_description + ", assembly_bom="
				+ assembly_bom + ", base_unit_of_measure=" + base_unit_of_measure + ", unit_price=" + unit_price
				+ ", costing_method=" + costing_method + ", unit_cost=" + unit_cost + ", vendor_no=" + vendor_no
				+ ", vendor_item_no=" + vendor_item_no + ", last_date_modified=" + last_date_modified + ", inventory="
				+ inventory + ", no_series=" + no_series + ", sales_unit_of_measure=" + sales_unit_of_measure
				+ ", purch_unit_of_measure=" + purch_unit_of_measure + ", item_category_code=" + item_category_code
				+ ", product_group_code=" + product_group_code + ", brand_code=" + brand_code + ", date_created="
				+ date_created + ", created_by_user=" + created_by_user + ", division_code=" + division_code
				+ ", bom_method=" + bom_method + ", recipe_version_code=" + recipe_version_code + ", recipe_item_type="
				+ recipe_item_type + ", wastage_=" + wastage_ + ", included_in_other_recipes="
				+ included_in_other_recipes + ", portion_weight=" + portion_weight + ", portion_cost=" + portion_cost
				+ ", exclude_from_menu_requisition=" + exclude_from_menu_requisition + ", recipe_no_of_portions="
				+ recipe_no_of_portions + ", max_modifiers_no_price=" + max_modifiers_no_price
				+ ", max_ingr_removed_no_price=" + max_ingr_removed_no_price + ", max_ingr_modifiers="
				+ max_ingr_modifiers + ", production_time_min=" + production_time_min
				+ ", display_ingredients_in_monitor=" + display_ingredients_in_monitor
				+ ", display_instruct_in_monitor=" + display_instruct_in_monitor + ", recipe_main_ingredient="
				+ recipe_main_ingredient + ", recipe_style=" + recipe_style + ", recipe_category=" + recipe_category
				+ ", available_as_dish=" + available_as_dish + ", uom_popup_on_pos=" + uom_popup_on_pos
				+ ", unit_price_including_vat=" + unit_price_including_vat + ", warranty_period=" + warranty_period
				+ ", hierarchy=" + hierarchy + ", vat_code=" + vat_code + ", unit_price_amount=" + unit_price_amount
				+ ", unit_price_without_tax=" + unit_price_without_tax + ", gross_amount=" + gross_amount
				+ ", discount_amount=" + discount_amount + ", net_amount=" + net_amount + ", amount_without_tax="
				+ amount_without_tax + ", tax_amount=" + tax_amount + ", price_includes_tax=" + price_includes_tax
				+ ", variant_code=" + variant_code + "]";
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArabic_description() {
		return arabic_description;
	}

	public void setArabic_description(String arabic_description) {
		this.arabic_description = arabic_description;
	}

	public String getAssembly_bom() {
		return assembly_bom;
	}

	public void setAssembly_bom(String assembly_bom) {
		this.assembly_bom = assembly_bom;
	}

	public String getBase_unit_of_measure() {
		return base_unit_of_measure;
	}

	public void setBase_unit_of_measure(String base_unit_of_measure) {
		this.base_unit_of_measure = base_unit_of_measure;
	}

	public String getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}

	public String getCosting_method() {
		return costing_method;
	}

	public void setCosting_method(String costing_method) {
		this.costing_method = costing_method;
	}

	public String getUnit_cost() {
		return unit_cost;
	}

	public void setUnit_cost(String unit_cost) {
		this.unit_cost = unit_cost;
	}

	public String getVendor_no() {
		return vendor_no;
	}

	public void setVendor_no(String vendor_no) {
		this.vendor_no = vendor_no;
	}

	public String getVendor_item_no() {
		return vendor_item_no;
	}

	public void setVendor_item_no(String vendor_item_no) {
		this.vendor_item_no = vendor_item_no;
	}

	public String getLast_date_modified() {
		return last_date_modified;
	}

	public void setLast_date_modified(String last_date_modified) {
		this.last_date_modified = last_date_modified;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getNo_series() {
		return no_series;
	}

	public void setNo_series(String no_series) {
		this.no_series = no_series;
	}

	public String getSales_unit_of_measure() {
		return sales_unit_of_measure;
	}

	public void setSales_unit_of_measure(String sales_unit_of_measure) {
		this.sales_unit_of_measure = sales_unit_of_measure;
	}

	public String getPurch_unit_of_measure() {
		return purch_unit_of_measure;
	}

	public void setPurch_unit_of_measure(String purch_unit_of_measure) {
		this.purch_unit_of_measure = purch_unit_of_measure;
	}

	public String getItem_category_code() {
		return item_category_code;
	}

	public void setItem_category_code(String item_category_code) {
		this.item_category_code = item_category_code;
	}

	public String getProduct_group_code() {
		return product_group_code;
	}

	public void setProduct_group_code(String product_group_code) {
		this.product_group_code = product_group_code;
	}

	public String getBrand_code() {
		return brand_code;
	}

	public void setBrand_code(String brand_code) {
		this.brand_code = brand_code;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getCreated_by_user() {
		return created_by_user;
	}

	public void setCreated_by_user(String created_by_user) {
		this.created_by_user = created_by_user;
	}

	public String getDivision_code() {
		return division_code;
	}

	public void setDivision_code(String division_code) {
		this.division_code = division_code;
	}

	public String getBom_method() {
		return bom_method;
	}

	public void setBom_method(String bom_method) {
		this.bom_method = bom_method;
	}

	public String getRecipe_version_code() {
		return recipe_version_code;
	}

	public void setRecipe_version_code(String recipe_version_code) {
		this.recipe_version_code = recipe_version_code;
	}

	public String getRecipe_item_type() {
		return recipe_item_type;
	}

	public void setRecipe_item_type(String recipe_item_type) {
		this.recipe_item_type = recipe_item_type;
	}

	public String getWastage_() {
		return wastage_;
	}

	public void setWastage_(String wastage_) {
		this.wastage_ = wastage_;
	}

	public String getIncluded_in_other_recipes() {
		return included_in_other_recipes;
	}

	public void setIncluded_in_other_recipes(String included_in_other_recipes) {
		this.included_in_other_recipes = included_in_other_recipes;
	}

	public String getPortion_weight() {
		return portion_weight;
	}

	public void setPortion_weight(String portion_weight) {
		this.portion_weight = portion_weight;
	}

	public String getPortion_cost() {
		return portion_cost;
	}

	public void setPortion_cost(String portion_cost) {
		this.portion_cost = portion_cost;
	}

	public String getExclude_from_menu_requisition() {
		return exclude_from_menu_requisition;
	}

	public void setExclude_from_menu_requisition(String exclude_from_menu_requisition) {
		this.exclude_from_menu_requisition = exclude_from_menu_requisition;
	}

	public String getRecipe_no_of_portions() {
		return recipe_no_of_portions;
	}

	public void setRecipe_no_of_portions(String recipe_no_of_portions) {
		this.recipe_no_of_portions = recipe_no_of_portions;
	}

	public String getMax_modifiers_no_price() {
		return max_modifiers_no_price;
	}

	public void setMax_modifiers_no_price(String max_modifiers_no_price) {
		this.max_modifiers_no_price = max_modifiers_no_price;
	}

	public String getMax_ingr_removed_no_price() {
		return max_ingr_removed_no_price;
	}

	public void setMax_ingr_removed_no_price(String max_ingr_removed_no_price) {
		this.max_ingr_removed_no_price = max_ingr_removed_no_price;
	}

	public String getMax_ingr_modifiers() {
		return max_ingr_modifiers;
	}

	public void setMax_ingr_modifiers(String max_ingr_modifiers) {
		this.max_ingr_modifiers = max_ingr_modifiers;
	}

	public String getProduction_time_min() {
		return production_time_min;
	}

	public void setProduction_time_min(String production_time_min) {
		this.production_time_min = production_time_min;
	}

	public String getDisplay_ingredients_in_monitor() {
		return display_ingredients_in_monitor;
	}

	public void setDisplay_ingredients_in_monitor(String display_ingredients_in_monitor) {
		this.display_ingredients_in_monitor = display_ingredients_in_monitor;
	}

	public String getDisplay_instruct_in_monitor() {
		return display_instruct_in_monitor;
	}

	public void setDisplay_instruct_in_monitor(String display_instruct_in_monitor) {
		this.display_instruct_in_monitor = display_instruct_in_monitor;
	}

	public String getRecipe_main_ingredient() {
		return recipe_main_ingredient;
	}

	public void setRecipe_main_ingredient(String recipe_main_ingredient) {
		this.recipe_main_ingredient = recipe_main_ingredient;
	}

	public String getRecipe_style() {
		return recipe_style;
	}

	public void setRecipe_style(String recipe_style) {
		this.recipe_style = recipe_style;
	}

	public String getRecipe_category() {
		return recipe_category;
	}

	public void setRecipe_category(String recipe_category) {
		this.recipe_category = recipe_category;
	}

	public String getAvailable_as_dish() {
		return available_as_dish;
	}

	public void setAvailable_as_dish(String available_as_dish) {
		this.available_as_dish = available_as_dish;
	}

	public String getUom_popup_on_pos() {
		return uom_popup_on_pos;
	}

	public void setUom_popup_on_pos(String uom_popup_on_pos) {
		this.uom_popup_on_pos = uom_popup_on_pos;
	}

	public String getUnit_price_including_vat() {
		return unit_price_including_vat;
	}

	public void setUnit_price_including_vat(String unit_price_including_vat) {
		this.unit_price_including_vat = unit_price_including_vat;
	}

	public String getWarranty_period() {
		return warranty_period;
	}

	public void setWarranty_period(String warranty_period) {
		this.warranty_period = warranty_period;
	}

	public String getHierarchy() {
		return hierarchy;
	}

	public void setHierarchy(String hierarchy) {
		this.hierarchy = hierarchy;
	}

	public String getVat_code() {
		return vat_code;
	}

	public void setVat_code(String vat_code) {
		this.vat_code = vat_code;
	}

	public String getUnit_price_amount() {
		return unit_price_amount;
	}

	public void setUnit_price_amount(String unit_price_amount) {
		this.unit_price_amount = unit_price_amount;
	}

	public String getUnit_price_without_tax() {
		return unit_price_without_tax;
	}

	public void setUnit_price_without_tax(String unit_price_without_tax) {
		this.unit_price_without_tax = unit_price_without_tax;
	}

	public String getGross_amount() {
		return gross_amount;
	}

	public void setGross_amount(String gross_amount) {
		this.gross_amount = gross_amount;
	}

	public String getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(String discount_amount) {
		this.discount_amount = discount_amount;
	}

	public String getNet_amount() {
		return net_amount;
	}

	public void setNet_amount(String net_amount) {
		this.net_amount = net_amount;
	}

	public String getAmount_without_tax() {
		return amount_without_tax;
	}

	public void setAmount_without_tax(String amount_without_tax) {
		this.amount_without_tax = amount_without_tax;
	}

	public String getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(String tax_amount) {
		this.tax_amount = tax_amount;
	}

	public boolean isPrice_includes_tax() {
		return price_includes_tax;
	}

	public void setPrice_includes_tax(boolean price_includes_tax) {
		this.price_includes_tax = price_includes_tax;
	}

	public String getVariant_code() {
		return variant_code;
	}

	public void setVariant_code(String variant_code) {
		this.variant_code = variant_code;
	}



		public MenuItems(int id, String created_at, String updated_at, String no, String description,
			String arabic_description, String assembly_bom, String base_unit_of_measure, String unit_price,
			String costing_method, String unit_cost, String vendor_no, String vendor_item_no, String last_date_modified,
			String inventory, String no_series, String sales_unit_of_measure, String purch_unit_of_measure,
			String item_category_code, String product_group_code, String brand_code, String date_created,
			String created_by_user, String division_code, String bom_method, String recipe_version_code,
			String recipe_item_type, String wastage_, String included_in_other_recipes, String portion_weight,
			String portion_cost, String exclude_from_menu_requisition, String recipe_no_of_portions,
			String max_modifiers_no_price, String max_ingr_removed_no_price, String max_ingr_modifiers,
			String production_time_min, String display_ingredients_in_monitor, String display_instruct_in_monitor,
			String recipe_main_ingredient, String recipe_style, String recipe_category, String available_as_dish,
			String uom_popup_on_pos, String unit_price_including_vat, String warranty_period, String hierarchy,
			String vat_code, String unit_price_amount, String unit_price_without_tax, String gross_amount,
			String discount_amount, String net_amount, String amount_without_tax, String tax_amount,
			boolean price_includes_tax, String variant_code) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.no = no;
		this.description = description;
		this.arabic_description = arabic_description;
		this.assembly_bom = assembly_bom;
		this.base_unit_of_measure = base_unit_of_measure;
		this.unit_price = unit_price;
		this.costing_method = costing_method;
		this.unit_cost = unit_cost;
		this.vendor_no = vendor_no;
		this.vendor_item_no = vendor_item_no;
		this.last_date_modified = last_date_modified;
		this.inventory = inventory;
		this.no_series = no_series;
		this.sales_unit_of_measure = sales_unit_of_measure;
		this.purch_unit_of_measure = purch_unit_of_measure;
		this.item_category_code = item_category_code;
		this.product_group_code = product_group_code;
		this.brand_code = brand_code;
		this.date_created = date_created;
		this.created_by_user = created_by_user;
		this.division_code = division_code;
		this.bom_method = bom_method;
		this.recipe_version_code = recipe_version_code;
		this.recipe_item_type = recipe_item_type;
		this.wastage_ = wastage_;
		this.included_in_other_recipes = included_in_other_recipes;
		this.portion_weight = portion_weight;
		this.portion_cost = portion_cost;
		this.exclude_from_menu_requisition = exclude_from_menu_requisition;
		this.recipe_no_of_portions = recipe_no_of_portions;
		this.max_modifiers_no_price = max_modifiers_no_price;
		this.max_ingr_removed_no_price = max_ingr_removed_no_price;
		this.max_ingr_modifiers = max_ingr_modifiers;
		this.production_time_min = production_time_min;
		this.display_ingredients_in_monitor = display_ingredients_in_monitor;
		this.display_instruct_in_monitor = display_instruct_in_monitor;
		this.recipe_main_ingredient = recipe_main_ingredient;
		this.recipe_style = recipe_style;
		this.recipe_category = recipe_category;
		this.available_as_dish = available_as_dish;
		this.uom_popup_on_pos = uom_popup_on_pos;
		this.unit_price_including_vat = unit_price_including_vat;
		this.warranty_period = warranty_period;
		this.hierarchy = hierarchy;
		this.vat_code = vat_code;
		this.unit_price_amount = unit_price_amount;
		this.unit_price_without_tax = unit_price_without_tax;
		this.gross_amount = gross_amount;
		this.discount_amount = discount_amount;
		this.net_amount = net_amount;
		this.amount_without_tax = amount_without_tax;
		this.tax_amount = tax_amount;
		this.price_includes_tax = price_includes_tax;
		this.variant_code = variant_code;
		
	}
		@Id
		@Column(name="Id")
		private int id;
		
		@Column(name="created_at")
	    private String created_at;
		
		@Column(name="updated_at")
	    private String updated_at;
		
		@Column(name="no")
	    private String no;
		
		@Column(name="description")
	    private String description;
		
		@Column(name="arabic_description")
	    private String arabic_description;
		
		@Column(name="assembly_bom")
	    private String assembly_bom;
		
		@Column(name="base_unit_of_measure")
	    private String base_unit_of_measure;
		
		@Column(name="unit_price")
	    private String unit_price;
		@Column(name="costing_method")
	    private String costing_method;
		
		@Column(name="unit_cost")
	    private String unit_cost;
		
		@Column(name="vendor_no")
	    private String vendor_no;
		
		@Column(name="vendor_item_no")
	    private String vendor_item_no;
		
		@Column(name="last_date_modified")
	    private String last_date_modified;
		
		@Column(name="inventory")
	    private String inventory;
		
		@Column(name="no_series")
	    private String no_series;
		
		@Column(name="sales_unit_of_measure")
	    private String sales_unit_of_measure;
		
		@Column(name="purch_unit_of_measure")
	    private String purch_unit_of_measure;
		
		@Column(name="item_category_code")
	    private String item_category_code;
		
		@Column(name="product_group_code")
	    private String product_group_code;
		
		@Column(name="brand_code")
	    private String brand_code;
		
		@Column(name="date_created")
	    private String date_created;
		
		@Column(name="created_by_user")
	    private String created_by_user;
		
		@Column(name="division_code")
	    private String division_code;
		
		@Column(name="bom_method")
	    private String bom_method;
		
		@Column(name="recipe_version_code")
	    private String recipe_version_code;
		
		@Column(name="recipe_item_type")
	    private String recipe_item_type;
		
		@Column(name="wastage_")
	    private String wastage_;
		
		@Column(name="included_in_other_recipes")
	    private String included_in_other_recipes;
		
		@Column(name="portion_weight")
	    private String portion_weight;
		
		@Column(name="portion_cost")
	    private String portion_cost;
		
		@Column(name="exclude_from_menu_requisition")
	    private String exclude_from_menu_requisition;
		
		@Column(name="recipe_no_of_portions")
	    private String recipe_no_of_portions;
		
		@Column(name="max_modifiers_no_price")
	    private String max_modifiers_no_price;
		
		@Column(name="max_ingr_removed_no_price")
	    private String max_ingr_removed_no_price;
		
		@Column(name="max_ingr_modifiers")
	    private String max_ingr_modifiers;
		
		@Column(name="production_time_min")
	    private String production_time_min;
		
		@Column(name="display_ingredients_in_monitor")
	    private String display_ingredients_in_monitor;
		
		@Column(name="display_instruct_in_monitor")
	    private String display_instruct_in_monitor;
		
		@Column(name="recipe_main_ingredient")
	    private String recipe_main_ingredient;
		
		@Column(name="recipe_style")
	    private String recipe_style;
		
		@Column(name="recipe_category")
	    private String recipe_category;
		
		@Column(name="available_as_dish")
	    private String available_as_dish;
		
		@Column(name="uom_popup_on_pos")
	    private String uom_popup_on_pos;
		
		@Column(name="unit_price_including_vat")
	    private String unit_price_including_vat;
		
		@Column(name="warranty_period")
	    private String warranty_period;
		
		@Column(name="hierarchy")
	    private String hierarchy;
		
		@Column(name="vat_code")
	    private String vat_code;
		
		@Column(name="unit_price_amount")
	    private String unit_price_amount;
		
		@Column(name="unit_price_without_tax")
	    private String unit_price_without_tax;
		
		@Column(name="gross_amount")
	    private String gross_amount;
		
		@Column(name="discount_amount")
	    private String discount_amount;
		
		@Column(name="net_amount")
	    private String net_amount;
		
		@Column(name="amount_without_tax")
	    private String amount_without_tax;
		
		@Column(name="tax_amount")
	    private String tax_amount;
		
		@Column(name="price_includes_tax")
	    private boolean price_includes_tax;
		
		@Column(name="variant_code")
	    private String variant_code;
		
	
	 
public MenuItems() {}
}
