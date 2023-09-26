package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Item_discount_table")
public class itemdiscounts {

	@Override
	public String toString() {
		return "itemdiscounts [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", item_no="
				+ item_no + ", store_code=" + store_code + ", unit_price=" + unit_price + ", unit_price_incl_vat="
				+ unit_price_incl_vat + ", start_date=" + start_date + ", end_date=" + end_date + ", uom=" + uom
				+ ", discount_amount=" + discount_amount + ", discount_percentage=" + discount_percentage
				+ ", location_code=" + location_code + ", variant_code=" + variant_code + ", currency_code="
				+ currency_code + ", start_time=" + start_time + ", end_time=" + end_time + ", item_price=" + item_price
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
	public String getItem_no() {
		return item_no;
	}
	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}
	public String getUnit_price_incl_vat() {
		return unit_price_incl_vat;
	}
	public void setUnit_price_incl_vat(String unit_price_incl_vat) {
		this.unit_price_incl_vat = unit_price_incl_vat;
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
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getDiscount_amount() {
		return discount_amount;
	}
	public void setDiscount_amount(String discount_amount) {
		this.discount_amount = discount_amount;
	}
	public String getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(String discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
	public String getLocation_code() {
		return location_code;
	}
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	public String getVariant_code() {
		return variant_code;
	}
	public void setVariant_code(String variant_code) {
		this.variant_code = variant_code;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getItem_price() {
		return item_price;
	}
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	
	
	public itemdiscounts(int id, String created_at, String updated_at, String item_no, String store_code,
			String unit_price, String unit_price_incl_vat, String start_date, String end_date, String uom,
			String discount_amount, String discount_percentage, String location_code, String variant_code,
			String currency_code, String start_time, String end_time, String item_price) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.item_no = item_no;
		this.store_code = store_code;
		this.unit_price = unit_price;
		this.unit_price_incl_vat = unit_price_incl_vat;
		this.start_date = start_date;
		this.end_date = end_date;
		this.uom = uom;
		this.discount_amount = discount_amount;
		this.discount_percentage = discount_percentage;
		this.location_code = location_code;
		this.variant_code = variant_code;
		this.currency_code = currency_code;
		this.start_time = start_time;
		this.end_time = end_time;
		this.item_price = item_price;
	}

	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="Created_at")
	String created_at;
	
	@Column(name="Updated_at")
	String updated_at;
	
	@Column(name="Item_no")
	String item_no;
	
	@Column(name="Store_Code")
	String store_code;
	
	@Column(name="UnitPrice")
	String unit_price;
	
	@Column(name="Unit_Price_Incl_vat")
	String unit_price_incl_vat;
	
	@Column(name="Start_Date")
	String start_date;
	
	@Column(name="End_Date")
	String end_date;
	
	@Column(name="Uom")
	String uom;
	
	@Column(name="Discount_amount")
	String discount_amount;
	
	@Column(name="Discount_Percnt")
	String discount_percentage;
	
	@Column(name="Location_Code")
	String location_code;
	
	@Column(name="Variant_Code")
	String variant_code;
	
	@Column(name="Currency_Code")
	String currency_code;
	
	@Column(name="Start_Time")
	String start_time;
	
	@Column(name="End_Time")
	String end_time;
	
	@Column(name="Item_Price")
	String item_price;
	
	public itemdiscounts() {
		
	}
}
