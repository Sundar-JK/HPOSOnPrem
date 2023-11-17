package pojo;

import java.util.List;

public class itemsWithVat {

	@Override
	public String toString() {
		return "itemsWithVat [mi_id=" + mi_id + ", mi_division_code=" + mi_division_code + ", mi_created_at="
				+ mi_created_at + ", mi_updated_at=" + mi_updated_at + ", mi_no=" + mi_no + ", mi_description="
				+ mi_description + ", mi_arabic_description=" + mi_arabic_description + ", mi_assembly_bom="
				+ mi_assembly_bom + ", mi_base_unit_of_measure=" + mi_base_unit_of_measure + ", mi_unit_price="
				+ mi_unit_price + ", mi_costing_method=" + mi_costing_method + ", mi_unit_cost=" + mi_unit_cost
				+ ", mi_vendor_no=" + mi_vendor_no + ", mi_vendor_item_no=" + mi_vendor_item_no
				+ ", mi_last_date_modified=" + mi_last_date_modified + ", mi_inventory=" + mi_inventory
				+ ", mi_no_series=" + mi_no_series + ", mi_sales_unit_of_measure=" + mi_sales_unit_of_measure
				+ ", mi_purch_unit_of_measure=" + mi_purch_unit_of_measure + ", mi_item_category_code="
				+ mi_item_category_code + ", mi_product_group_code=" + mi_product_group_code + ", mi_brand_code="
				+ mi_brand_code + ", mi_date_created=" + mi_date_created + ", mi_created_by_user=" + mi_created_by_user
				+ ", mi_bom_method=" + mi_bom_method + ", mi_recipe_version_code=" + mi_recipe_version_code
				+ ", mi_recipe_item_type=" + mi_recipe_item_type + ", mi_wastage_=" + mi_wastage_
				+ ", mi_included_in_other_recipes=" + mi_included_in_other_recipes + ", mi_portion_weight="
				+ mi_portion_weight + ", mi_portion_cost=" + mi_portion_cost + ", mi_exclude_from_menu_requisition="
				+ mi_exclude_from_menu_requisition + ", mi_recipe_no_of_portions=" + mi_recipe_no_of_portions
				+ ", mi_max_modifiers_no_price=" + mi_max_modifiers_no_price + ", mi_max_ingr_removed_no_price="
				+ mi_max_ingr_removed_no_price + ", mi_max_ingr_modifiers=" + mi_max_ingr_modifiers
				+ ", mi_production_time_min=" + mi_production_time_min + ", mi_display_ingredients_in_monitor="
				+ mi_display_ingredients_in_monitor + ", mi_display_instruct_in_monitor="
				+ mi_display_instruct_in_monitor + ", mi_recipe_main_ingredient=" + mi_recipe_main_ingredient
				+ ", mi_recipe_style=" + mi_recipe_style + ", mi_recipe_category=" + mi_recipe_category
				+ ", mi_available_as_dish=" + mi_available_as_dish + ", mi_uom_popup_on_pos=" + mi_uom_popup_on_pos
				+ ", mi_warranty_period=" + mi_warranty_period + ", mi_vat_code=" + mi_vat_code
				+ ", mi_unit_price_amount=" + mi_unit_price_amount + ", mi_unit_price_without_tax="
				+ mi_unit_price_without_tax + ", mi_gross_amount=" + mi_gross_amount + ", mi_discount_amount="
				+ mi_discount_amount + ", mi_net_amount=" + mi_net_amount + ", mi_amount_without_tax="
				+ mi_amount_without_tax + ", mi_tax_amount=" + mi_tax_amount + ", mi_price_includes_tax="
				+ mi_price_includes_tax + ", mi_variant_code=" + mi_variant_code + ", mi_hierarchy=" + mi_hierarchy
				+ ", mi_unit_price_including_vat=" + mi_unit_price_including_vat + ", ip_item_no=" + ip_item_no
				+ ", vm_vat_code=" + vm_vat_code + ", uom=" + uom + ", Modifiers=" + Modifiers + ", getMi_id()="
				+ getMi_id() + ", getMi_division_code()=" + getMi_division_code() + ", getMi_created_at()="
				+ getMi_created_at() + ", getMi_updated_at()=" + getMi_updated_at() + ", getMi_no()=" + getMi_no()
				+ ", getMi_description()=" + getMi_description() + ", getMi_arabic_description()="
				+ getMi_arabic_description() + ", getMi_assembly_bom()=" + getMi_assembly_bom()
				+ ", getMi_base_unit_of_measure()=" + getMi_base_unit_of_measure() + ", getMi_unit_price()="
				+ getMi_unit_price() + ", getMi_costing_method()=" + getMi_costing_method() + ", getMi_unit_cost()="
				+ getMi_unit_cost() + ", getMi_vendor_no()=" + getMi_vendor_no() + ", getMi_vendor_item_no()="
				+ getMi_vendor_item_no() + ", getMi_last_date_modified()=" + getMi_last_date_modified()
				+ ", getMi_inventory()=" + getMi_inventory() + ", getMi_no_series()=" + getMi_no_series()
				+ ", getMi_sales_unit_of_measure()=" + getMi_sales_unit_of_measure()
				+ ", getMi_purch_unit_of_measure()=" + getMi_purch_unit_of_measure() + ", getMi_item_category_code()="
				+ getMi_item_category_code() + ", getMi_product_group_code()=" + getMi_product_group_code()
				+ ", getMi_brand_code()=" + getMi_brand_code() + ", getMi_date_created()=" + getMi_date_created()
				+ ", getMi_created_by_user()=" + getMi_created_by_user() + ", getMi_bom_method()=" + getMi_bom_method()
				+ ", getMi_recipe_version_code()=" + getMi_recipe_version_code() + ", getMi_recipe_item_type()="
				+ getMi_recipe_item_type() + ", getMi_wastage_()=" + getMi_wastage_()
				+ ", getMi_included_in_other_recipes()=" + getMi_included_in_other_recipes()
				+ ", getMi_portion_weight()=" + getMi_portion_weight() + ", getMi_portion_cost()="
				+ getMi_portion_cost() + ", getMi_exclude_from_menu_requisition()="
				+ getMi_exclude_from_menu_requisition() + ", getMi_recipe_no_of_portions()="
				+ getMi_recipe_no_of_portions() + ", getMi_max_modifiers_no_price()=" + getMi_max_modifiers_no_price()
				+ ", getMi_max_ingr_removed_no_price()=" + getMi_max_ingr_removed_no_price()
				+ ", getMi_max_ingr_modifiers()=" + getMi_max_ingr_modifiers() + ", getMi_production_time_min()="
				+ getMi_production_time_min() + ", getMi_display_ingredients_in_monitor()="
				+ getMi_display_ingredients_in_monitor() + ", getMi_display_instruct_in_monitor()="
				+ getMi_display_instruct_in_monitor() + ", getMi_recipe_main_ingredient()="
				+ getMi_recipe_main_ingredient() + ", getMi_recipe_style()=" + getMi_recipe_style()
				+ ", getMi_recipe_category()=" + getMi_recipe_category() + ", getMi_available_as_dish()="
				+ getMi_available_as_dish() + ", getMi_uom_popup_on_pos()=" + getMi_uom_popup_on_pos()
				+ ", getMi_warranty_period()=" + getMi_warranty_period() + ", getMi_vat_code()=" + getMi_vat_code()
				+ ", getMi_unit_price_amount()=" + getMi_unit_price_amount() + ", getMi_unit_price_without_tax()="
				+ getMi_unit_price_without_tax() + ", getMi_gross_amount()=" + getMi_gross_amount()
				+ ", getMi_discount_amount()=" + getMi_discount_amount() + ", getMi_net_amount()=" + getMi_net_amount()
				+ ", getMi_amount_without_tax()=" + getMi_amount_without_tax() + ", getMi_tax_amount()="
				+ getMi_tax_amount() + ", getMi_price_includes_tax()=" + getMi_price_includes_tax()
				+ ", getMi_variant_code()=" + getMi_variant_code() + ", getMi_hierarchy()=" + getMi_hierarchy()
				+ ", getMi_unit_price_including_vat()=" + getMi_unit_price_including_vat() + ", getIp_item_no()="
				+ getIp_item_no() + ", getVm_vat_code()=" + getVm_vat_code() + ", getUom()=" + getUom()
				+ ", getModifiers()=" + getModifiers() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getMi_id() {
		return mi_id;
	}
	public void setMi_id(int mi_id) {
		this.mi_id = mi_id;
	}
	public String getMi_division_code() {
		return mi_division_code;
	}
	public void setMi_division_code(String mi_division_code) {
		this.mi_division_code = mi_division_code;
	}
	public String getMi_created_at() {
		return mi_created_at;
	}
	public void setMi_created_at(String mi_created_at) {
		this.mi_created_at = mi_created_at;
	}
	public String getMi_updated_at() {
		return mi_updated_at;
	}
	public void setMi_updated_at(String mi_updated_at) {
		this.mi_updated_at = mi_updated_at;
	}
	public int getMi_no() {
		return mi_no;
	}
	public void setMi_no(int mi_no) {
		this.mi_no = mi_no;
	}
	public String getMi_description() {
		return mi_description;
	}
	public void setMi_description(String mi_description) {
		this.mi_description = mi_description;
	}
	public int getMi_arabic_description() {
		return mi_arabic_description;
	}
	public void setMi_arabic_description(int mi_arabic_description) {
		this.mi_arabic_description = mi_arabic_description;
	}
	public String getMi_assembly_bom() {
		return mi_assembly_bom;
	}
	public void setMi_assembly_bom(String mi_assembly_bom) {
		this.mi_assembly_bom = mi_assembly_bom;
	}
	public String getMi_base_unit_of_measure() {
		return mi_base_unit_of_measure;
	}
	public void setMi_base_unit_of_measure(String mi_base_unit_of_measure) {
		this.mi_base_unit_of_measure = mi_base_unit_of_measure;
	}
	public int getMi_unit_price() {
		return mi_unit_price;
	}
	public void setMi_unit_price(int mi_unit_price) {
		this.mi_unit_price = mi_unit_price;
	}
	public String getMi_costing_method() {
		return mi_costing_method;
	}
	public void setMi_costing_method(String mi_costing_method) {
		this.mi_costing_method = mi_costing_method;
	}
	public int getMi_unit_cost() {
		return mi_unit_cost;
	}
	public void setMi_unit_cost(int mi_unit_cost) {
		this.mi_unit_cost = mi_unit_cost;
	}
	public int getMi_vendor_no() {
		return mi_vendor_no;
	}
	public void setMi_vendor_no(int mi_vendor_no) {
		this.mi_vendor_no = mi_vendor_no;
	}
	public int getMi_vendor_item_no() {
		return mi_vendor_item_no;
	}
	public void setMi_vendor_item_no(int mi_vendor_item_no) {
		this.mi_vendor_item_no = mi_vendor_item_no;
	}
	public String getMi_last_date_modified() {
		return mi_last_date_modified;
	}
	public void setMi_last_date_modified(String mi_last_date_modified) {
		this.mi_last_date_modified = mi_last_date_modified;
	}
	public String getMi_inventory() {
		return mi_inventory;
	}
	public void setMi_inventory(String mi_inventory) {
		this.mi_inventory = mi_inventory;
	}
	public String getMi_no_series() {
		return mi_no_series;
	}
	public void setMi_no_series(String mi_no_series) {
		this.mi_no_series = mi_no_series;
	}
	public int getMi_sales_unit_of_measure() {
		return mi_sales_unit_of_measure;
	}
	public void setMi_sales_unit_of_measure(int mi_sales_unit_of_measure) {
		this.mi_sales_unit_of_measure = mi_sales_unit_of_measure;
	}
	public int getMi_purch_unit_of_measure() {
		return mi_purch_unit_of_measure;
	}
	public void setMi_purch_unit_of_measure(int mi_purch_unit_of_measure) {
		this.mi_purch_unit_of_measure = mi_purch_unit_of_measure;
	}
	public int getMi_item_category_code() {
		return mi_item_category_code;
	}
	public void setMi_item_category_code(int mi_item_category_code) {
		this.mi_item_category_code = mi_item_category_code;
	}
	public int getMi_product_group_code() {
		return mi_product_group_code;
	}
	public void setMi_product_group_code(int mi_product_group_code) {
		this.mi_product_group_code = mi_product_group_code;
	}
	public int getMi_brand_code() {
		return mi_brand_code;
	}
	public void setMi_brand_code(int mi_brand_code) {
		this.mi_brand_code = mi_brand_code;
	}
	public String getMi_date_created() {
		return mi_date_created;
	}
	public void setMi_date_created(String mi_date_created) {
		this.mi_date_created = mi_date_created;
	}
	public String getMi_created_by_user() {
		return mi_created_by_user;
	}
	public void setMi_created_by_user(String mi_created_by_user) {
		this.mi_created_by_user = mi_created_by_user;
	}
	public String getMi_bom_method() {
		return mi_bom_method;
	}
	public void setMi_bom_method(String mi_bom_method) {
		this.mi_bom_method = mi_bom_method;
	}
	public String getMi_recipe_version_code() {
		return mi_recipe_version_code;
	}
	public void setMi_recipe_version_code(String mi_recipe_version_code) {
		this.mi_recipe_version_code = mi_recipe_version_code;
	}
	public String getMi_recipe_item_type() {
		return mi_recipe_item_type;
	}
	public void setMi_recipe_item_type(String mi_recipe_item_type) {
		this.mi_recipe_item_type = mi_recipe_item_type;
	}
	public String getMi_wastage_() {
		return mi_wastage_;
	}
	public void setMi_wastage_(String mi_wastage_) {
		this.mi_wastage_ = mi_wastage_;
	}
	public String getMi_included_in_other_recipes() {
		return mi_included_in_other_recipes;
	}
	public void setMi_included_in_other_recipes(String mi_included_in_other_recipes) {
		this.mi_included_in_other_recipes = mi_included_in_other_recipes;
	}
	public String getMi_portion_weight() {
		return mi_portion_weight;
	}
	public void setMi_portion_weight(String mi_portion_weight) {
		this.mi_portion_weight = mi_portion_weight;
	}
	public String getMi_portion_cost() {
		return mi_portion_cost;
	}
	public void setMi_portion_cost(String mi_portion_cost) {
		this.mi_portion_cost = mi_portion_cost;
	}
	public String getMi_exclude_from_menu_requisition() {
		return mi_exclude_from_menu_requisition;
	}
	public void setMi_exclude_from_menu_requisition(String mi_exclude_from_menu_requisition) {
		this.mi_exclude_from_menu_requisition = mi_exclude_from_menu_requisition;
	}
	public String getMi_recipe_no_of_portions() {
		return mi_recipe_no_of_portions;
	}
	public void setMi_recipe_no_of_portions(String mi_recipe_no_of_portions) {
		this.mi_recipe_no_of_portions = mi_recipe_no_of_portions;
	}
	public int getMi_max_modifiers_no_price() {
		return mi_max_modifiers_no_price;
	}
	public void setMi_max_modifiers_no_price(int mi_max_modifiers_no_price) {
		this.mi_max_modifiers_no_price = mi_max_modifiers_no_price;
	}
	public int getMi_max_ingr_removed_no_price() {
		return mi_max_ingr_removed_no_price;
	}
	public void setMi_max_ingr_removed_no_price(int mi_max_ingr_removed_no_price) {
		this.mi_max_ingr_removed_no_price = mi_max_ingr_removed_no_price;
	}
	public String getMi_max_ingr_modifiers() {
		return mi_max_ingr_modifiers;
	}
	public void setMi_max_ingr_modifiers(String mi_max_ingr_modifiers) {
		this.mi_max_ingr_modifiers = mi_max_ingr_modifiers;
	}
	public String getMi_production_time_min() {
		return mi_production_time_min;
	}
	public void setMi_production_time_min(String mi_production_time_min) {
		this.mi_production_time_min = mi_production_time_min;
	}
	public String getMi_display_ingredients_in_monitor() {
		return mi_display_ingredients_in_monitor;
	}
	public void setMi_display_ingredients_in_monitor(String mi_display_ingredients_in_monitor) {
		this.mi_display_ingredients_in_monitor = mi_display_ingredients_in_monitor;
	}
	public String getMi_display_instruct_in_monitor() {
		return mi_display_instruct_in_monitor;
	}
	public void setMi_display_instruct_in_monitor(String mi_display_instruct_in_monitor) {
		this.mi_display_instruct_in_monitor = mi_display_instruct_in_monitor;
	}
	public String getMi_recipe_main_ingredient() {
		return mi_recipe_main_ingredient;
	}
	public void setMi_recipe_main_ingredient(String mi_recipe_main_ingredient) {
		this.mi_recipe_main_ingredient = mi_recipe_main_ingredient;
	}
	public String getMi_recipe_style() {
		return mi_recipe_style;
	}
	public void setMi_recipe_style(String mi_recipe_style) {
		this.mi_recipe_style = mi_recipe_style;
	}
	public String getMi_recipe_category() {
		return mi_recipe_category;
	}
	public void setMi_recipe_category(String mi_recipe_category) {
		this.mi_recipe_category = mi_recipe_category;
	}
	public String getMi_available_as_dish() {
		return mi_available_as_dish;
	}
	public void setMi_available_as_dish(String mi_available_as_dish) {
		this.mi_available_as_dish = mi_available_as_dish;
	}
	public String getMi_uom_popup_on_pos() {
		return mi_uom_popup_on_pos;
	}
	public void setMi_uom_popup_on_pos(String mi_uom_popup_on_pos) {
		this.mi_uom_popup_on_pos = mi_uom_popup_on_pos;
	}
	public String getMi_warranty_period() {
		return mi_warranty_period;
	}
	public void setMi_warranty_period(String mi_warranty_period) {
		this.mi_warranty_period = mi_warranty_period;
	}
	public String getMi_vat_code() {
		return mi_vat_code;
	}
	public void setMi_vat_code(String mi_vat_code) {
		this.mi_vat_code = mi_vat_code;
	}
	public int getMi_unit_price_amount() {
		return mi_unit_price_amount;
	}
	public void setMi_unit_price_amount(int mi_unit_price_amount) {
		this.mi_unit_price_amount = mi_unit_price_amount;
	}
	public int getMi_unit_price_without_tax() {
		return mi_unit_price_without_tax;
	}
	public void setMi_unit_price_without_tax(int mi_unit_price_without_tax) {
		this.mi_unit_price_without_tax = mi_unit_price_without_tax;
	}
	public int getMi_gross_amount() {
		return mi_gross_amount;
	}
	public void setMi_gross_amount(int mi_gross_amount) {
		this.mi_gross_amount = mi_gross_amount;
	}
	public int getMi_discount_amount() {
		return mi_discount_amount;
	}
	public void setMi_discount_amount(int mi_discount_amount) {
		this.mi_discount_amount = mi_discount_amount;
	}
	public int getMi_net_amount() {
		return mi_net_amount;
	}
	public void setMi_net_amount(int mi_net_amount) {
		this.mi_net_amount = mi_net_amount;
	}
	public int getMi_amount_without_tax() {
		return mi_amount_without_tax;
	}
	public void setMi_amount_without_tax(int mi_amount_without_tax) {
		this.mi_amount_without_tax = mi_amount_without_tax;
	}
	public int getMi_tax_amount() {
		return mi_tax_amount;
	}
	public void setMi_tax_amount(int mi_tax_amount) {
		this.mi_tax_amount = mi_tax_amount;
	}
	public int getMi_price_includes_tax() {
		return mi_price_includes_tax;
	}
	public void setMi_price_includes_tax(int mi_price_includes_tax) {
		this.mi_price_includes_tax = mi_price_includes_tax;
	}
	public String getMi_variant_code() {
		return mi_variant_code;
	}
	public void setMi_variant_code(String mi_variant_code) {
		this.mi_variant_code = mi_variant_code;
	}
	public String getMi_hierarchy() {
		return mi_hierarchy;
	}
	public void setMi_hierarchy(String mi_hierarchy) {
		this.mi_hierarchy = mi_hierarchy;
	}
	public int getMi_unit_price_including_vat() {
		return mi_unit_price_including_vat;
	}
	public void setMi_unit_price_including_vat(int mi_unit_price_including_vat) {
		this.mi_unit_price_including_vat = mi_unit_price_including_vat;
	}
	public int getIp_item_no() {
		return ip_item_no;
	}
	public void setIp_item_no(int ip_item_no) {
		this.ip_item_no = ip_item_no;
	}
	public String getVm_vat_code() {
		return vm_vat_code;
	}
	public void setVm_vat_code(String vm_vat_code) {
		this.vm_vat_code = vm_vat_code;
	}
	public List<UOM> getUom() {
		return uom;
	}
	public void setUom(List<UOM> uom) {
		this.uom = uom;
	}
	public List<modifiers> getModifiers() {
		return Modifiers;
	}
	public void setModifiers(List<modifiers> modifiers) {
		Modifiers = modifiers;
	}
	
	int mi_id;
	public itemsWithVat(int mi_id, String mi_division_code, String mi_created_at, String mi_updated_at, int mi_no,
			String mi_description, int mi_arabic_description, String mi_assembly_bom, String mi_base_unit_of_measure,
			int mi_unit_price, String mi_costing_method, int mi_unit_cost, int mi_vendor_no, int mi_vendor_item_no,
			String mi_last_date_modified, String mi_inventory, String mi_no_series, int mi_sales_unit_of_measure,
			int mi_purch_unit_of_measure, int mi_item_category_code, int mi_product_group_code, int mi_brand_code,
			String mi_date_created, String mi_created_by_user, String mi_bom_method, String mi_recipe_version_code,
			String mi_recipe_item_type, String mi_wastage_, String mi_included_in_other_recipes,
			String mi_portion_weight, String mi_portion_cost, String mi_exclude_from_menu_requisition,
			String mi_recipe_no_of_portions, int mi_max_modifiers_no_price, int mi_max_ingr_removed_no_price,
			String mi_max_ingr_modifiers, String mi_production_time_min, String mi_display_ingredients_in_monitor,
			String mi_display_instruct_in_monitor, String mi_recipe_main_ingredient, String mi_recipe_style,
			String mi_recipe_category, String mi_available_as_dish, String mi_uom_popup_on_pos,
			String mi_warranty_period, String mi_vat_code, int mi_unit_price_amount, int mi_unit_price_without_tax,
			int mi_gross_amount, int mi_discount_amount, int mi_net_amount, int mi_amount_without_tax,
			int mi_tax_amount, int mi_price_includes_tax, String mi_variant_code, String mi_hierarchy,
			int mi_unit_price_including_vat, int ip_item_no, String vm_vat_code, List<UOM> uom,
			List<modifiers> modifiers) {
		super();
		this.mi_id = mi_id;
		this.mi_division_code = mi_division_code;
		this.mi_created_at = mi_created_at;
		this.mi_updated_at = mi_updated_at;
		this.mi_no = mi_no;
		this.mi_description = mi_description;
		this.mi_arabic_description = mi_arabic_description;
		this.mi_assembly_bom = mi_assembly_bom;
		this.mi_base_unit_of_measure = mi_base_unit_of_measure;
		this.mi_unit_price = mi_unit_price;
		this.mi_costing_method = mi_costing_method;
		this.mi_unit_cost = mi_unit_cost;
		this.mi_vendor_no = mi_vendor_no;
		this.mi_vendor_item_no = mi_vendor_item_no;
		this.mi_last_date_modified = mi_last_date_modified;
		this.mi_inventory = mi_inventory;
		this.mi_no_series = mi_no_series;
		this.mi_sales_unit_of_measure = mi_sales_unit_of_measure;
		this.mi_purch_unit_of_measure = mi_purch_unit_of_measure;
		this.mi_item_category_code = mi_item_category_code;
		this.mi_product_group_code = mi_product_group_code;
		this.mi_brand_code = mi_brand_code;
		this.mi_date_created = mi_date_created;
		this.mi_created_by_user = mi_created_by_user;
		this.mi_bom_method = mi_bom_method;
		this.mi_recipe_version_code = mi_recipe_version_code;
		this.mi_recipe_item_type = mi_recipe_item_type;
		this.mi_wastage_ = mi_wastage_;
		this.mi_included_in_other_recipes = mi_included_in_other_recipes;
		this.mi_portion_weight = mi_portion_weight;
		this.mi_portion_cost = mi_portion_cost;
		this.mi_exclude_from_menu_requisition = mi_exclude_from_menu_requisition;
		this.mi_recipe_no_of_portions = mi_recipe_no_of_portions;
		this.mi_max_modifiers_no_price = mi_max_modifiers_no_price;
		this.mi_max_ingr_removed_no_price = mi_max_ingr_removed_no_price;
		this.mi_max_ingr_modifiers = mi_max_ingr_modifiers;
		this.mi_production_time_min = mi_production_time_min;
		this.mi_display_ingredients_in_monitor = mi_display_ingredients_in_monitor;
		this.mi_display_instruct_in_monitor = mi_display_instruct_in_monitor;
		this.mi_recipe_main_ingredient = mi_recipe_main_ingredient;
		this.mi_recipe_style = mi_recipe_style;
		this.mi_recipe_category = mi_recipe_category;
		this.mi_available_as_dish = mi_available_as_dish;
		this.mi_uom_popup_on_pos = mi_uom_popup_on_pos;
		this.mi_warranty_period = mi_warranty_period;
		this.mi_vat_code = mi_vat_code;
		this.mi_unit_price_amount = mi_unit_price_amount;
		this.mi_unit_price_without_tax = mi_unit_price_without_tax;
		this.mi_gross_amount = mi_gross_amount;
		this.mi_discount_amount = mi_discount_amount;
		this.mi_net_amount = mi_net_amount;
		this.mi_amount_without_tax = mi_amount_without_tax;
		this.mi_tax_amount = mi_tax_amount;
		this.mi_price_includes_tax = mi_price_includes_tax;
		this.mi_variant_code = mi_variant_code;
		this.mi_hierarchy = mi_hierarchy;
		this.mi_unit_price_including_vat = mi_unit_price_including_vat;
		this.ip_item_no = ip_item_no;
		this.vm_vat_code = vm_vat_code;
		this.uom = uom;
		Modifiers = modifiers;
	}

	String mi_division_code;
	String mi_created_at;
	String mi_updated_at;
	int mi_no;
	String mi_description;
	int mi_arabic_description;
	String mi_assembly_bom;
	String mi_base_unit_of_measure;
	int mi_unit_price;
	String mi_costing_method;
	int mi_unit_cost;
	int mi_vendor_no;
	int mi_vendor_item_no;
	String mi_last_date_modified;
	String mi_inventory;
	String mi_no_series;
	int mi_sales_unit_of_measure;
	int mi_purch_unit_of_measure;
	int mi_item_category_code;
	int mi_product_group_code;
	int mi_brand_code;
	String mi_date_created;
	String mi_created_by_user;
	String mi_bom_method;
	String mi_recipe_version_code;
	String mi_recipe_item_type;
	String mi_wastage_;
	String mi_included_in_other_recipes;
	String mi_portion_weight;
	String mi_portion_cost;
	String mi_exclude_from_menu_requisition;
	String mi_recipe_no_of_portions;
	int mi_max_modifiers_no_price;
	int mi_max_ingr_removed_no_price;
	String mi_max_ingr_modifiers;
	String mi_production_time_min;
	String mi_display_ingredients_in_monitor;
	String mi_display_instruct_in_monitor;
	String mi_recipe_main_ingredient;
	String mi_recipe_style;
	String mi_recipe_category;
	String mi_available_as_dish;
	String mi_uom_popup_on_pos;
	String mi_warranty_period;
	String mi_vat_code;
	int mi_unit_price_amount;
	int mi_unit_price_without_tax;
	int mi_gross_amount;
	int mi_discount_amount;
	int mi_net_amount;
	int mi_amount_without_tax;
	int mi_tax_amount;
	int mi_price_includes_tax;
	String mi_variant_code;
	String mi_hierarchy;
	int mi_unit_price_including_vat;
	int ip_item_no;
	String vm_vat_code;
	List<UOM> uom;
	List <modifiers> Modifiers;
	
	
	
	public itemsWithVat() {
		
	}
	
	
	
}
