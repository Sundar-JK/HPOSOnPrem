package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Erpmasters_table")
public class erp_itemmaster {

	@Override
	public String toString() {
		return "erp_itemmaster [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", arabic_description=" + arabic_description + ", brand_name=" + brand_name + ", band_code="
				+ band_code + ", category_name=" + category_name + ", combo_menu=" + combo_menu + ", company_code="
				+ company_code + ", creation_date_time=" + creation_date_time + ", invent_price=" + invent_price
				+ ", invent_unit=" + invent_unit + ", item_code=" + item_code + ", item_description=" + item_description
				+ ", item_group=" + item_group + ", item_model_group=" + item_model_group + ", item_name=" + item_name
				+ ", modified_date_time=" + modified_date_time + ", purch_price=" + purch_price + ", purch_unit="
				+ purch_unit + ", sales_price=" + sales_price + ", sales_unit=" + sales_unit + ", sction_name="
				+ sction_name + ", serch_name=" + serch_name + ", shelf_life=" + shelf_life + ", vendor_no=" + vendor_no
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
	public String getArabic_description() {
		return arabic_description;
	}
	public void setArabic_description(String arabic_description) {
		this.arabic_description = arabic_description;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getBand_code() {
		return band_code;
	}
	public void setBand_code(String band_code) {
		this.band_code = band_code;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCombo_menu() {
		return combo_menu;
	}
	public void setCombo_menu(String combo_menu) {
		this.combo_menu = combo_menu;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getCreation_date_time() {
		return creation_date_time;
	}
	public void setCreation_date_time(String creation_date_time) {
		this.creation_date_time = creation_date_time;
	}
	public String getInvent_price() {
		return invent_price;
	}
	public void setInvent_price(String invent_price) {
		this.invent_price = invent_price;
	}
	public String getInvent_unit() {
		return invent_unit;
	}
	public void setInvent_unit(String invent_unit) {
		this.invent_unit = invent_unit;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public String getItem_group() {
		return item_group;
	}
	public void setItem_group(String item_group) {
		this.item_group = item_group;
	}
	public String getItem_model_group() {
		return item_model_group;
	}
	public void setItem_model_group(String item_model_group) {
		this.item_model_group = item_model_group;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getModified_date_time() {
		return modified_date_time;
	}
	public void setModified_date_time(String modified_date_time) {
		this.modified_date_time = modified_date_time;
	}
	public String getPurch_price() {
		return purch_price;
	}
	public void setPurch_price(String purch_price) {
		this.purch_price = purch_price;
	}
	public String getPurch_unit() {
		return purch_unit;
	}
	public void setPurch_unit(String purch_unit) {
		this.purch_unit = purch_unit;
	}
	public String getSales_price() {
		return sales_price;
	}
	public void setSales_price(String sales_price) {
		this.sales_price = sales_price;
	}
	public String getSales_unit() {
		return sales_unit;
	}
	public void setSales_unit(String sales_unit) {
		this.sales_unit = sales_unit;
	}
	public String getSction_name() {
		return sction_name;
	}
	public void setSction_name(String sction_name) {
		this.sction_name = sction_name;
	}
	public String getSerch_name() {
		return serch_name;
	}
	public void setSerch_name(String serch_name) {
		this.serch_name = serch_name;
	}
	public String getShelf_life() {
		return shelf_life;
	}
	public void setShelf_life(String shelf_life) {
		this.shelf_life = shelf_life;
	}
	public String getVendor_no() {
		return vendor_no;
	}
	public void setVendor_no(String vendor_no) {
		this.vendor_no = vendor_no;
	}
	
	
	
	public erp_itemmaster(int id, String created_at, String updated_at, String arabic_description, String brand_name,
			String band_code, String category_name, String combo_menu, String company_code, String creation_date_time,
			String invent_price, String invent_unit, String item_code, String item_description, String item_group,
			String item_model_group, String item_name, String modified_date_time, String purch_price, String purch_unit,
			String sales_price, String sales_unit, String sction_name, String serch_name, String shelf_life,
			String vendor_no) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.arabic_description = arabic_description;
		this.brand_name = brand_name;
		this.band_code = band_code;
		this.category_name = category_name;
		this.combo_menu = combo_menu;
		this.company_code = company_code;
		this.creation_date_time = creation_date_time;
		this.invent_price = invent_price;
		this.invent_unit = invent_unit;
		this.item_code = item_code;
		this.item_description = item_description;
		this.item_group = item_group;
		this.item_model_group = item_model_group;
		this.item_name = item_name;
		this.modified_date_time = modified_date_time;
		this.purch_price = purch_price;
		this.purch_unit = purch_unit;
		this.sales_price = sales_price;
		this.sales_unit = sales_unit;
		this.sction_name = sction_name;
		this.serch_name = serch_name;
		this.shelf_life = shelf_life;
		this.vendor_no = vendor_no;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="createdAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="ArabicDescription")
	String arabic_description;
	
	@Column(name="brandName")
	String brand_name;
	
	@Column(name="bandCode")
	String band_code;
	
	@Column(name="category_name")
	String category_name;
	
	@Column(name="ComboMenu")
	String combo_menu;
	
	@Column(name="CompanyCode")
	String company_code;
	
	@Column(name="CreatioinDateTime")
	String creation_date_time;
	
	@Column(name="Inventprice")
	String invent_price;
	
	@Column(name="InventUnit")
	String invent_unit;
	
	@Column(name="ItemCode")
	String item_code;
	
	@Column(name="ItemDescription")
	String item_description;
	
	@Column(name="ItemGroup")
	String item_group;
	
	@Column(name="ItemModelgroup")
	String item_model_group;
	
	@Column(name="Itemname")
	String item_name;
	
	@Column(name="ModifiedDateTime")
	String modified_date_time;
	
	@Column(name="PurchPrice")
	String purch_price;
	
	@Column(name="PurchUnit")
	String purch_unit;
	
	@Column(name="SalesPrice")
	String sales_price;
	
	@Column(name="SalesUnit")
	String sales_unit;
	
	@Column(name="SctionName")
	String sction_name;
	
	@Column(name="SerchaName")
	String serch_name;
	
	@Column(name="ShelfLife")
	String shelf_life;
	
	@Column(name="VendoeNo")
	String vendor_no;
	
public erp_itemmaster() {}	
}
