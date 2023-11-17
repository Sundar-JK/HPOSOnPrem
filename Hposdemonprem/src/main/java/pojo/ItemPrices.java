package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_prices")
public class ItemPrices {

	@Override
	public String toString() {
		return "ItemPrices [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", item_no="
				+ item_no + ", store_code=" + store_code + ", unit_price=" + unit_price + ", unit_price_incl_vat="
				+ unit_price_incl_vat + ", start_date=" + start_date + ", end_date=" + end_date + ", uom=" + uom
				+ ", vat_code=" + vat_code + ", location_code=" + location_code + ", variant_code=" + variant_code
				+ ", currency_code=" + currency_code + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", item_price=" + item_price + "]";
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
	public String getVat_code() {
		return vat_code;
	}
	public void setVat_code(String vat_code) {
		this.vat_code = vat_code;
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
	
	public ItemPrices(int id, String created_at, String updated_at, String item_no, String store_code,
			String unit_price, String unit_price_incl_vat, String start_date, String end_date, String uom,
			String vat_code, String location_code, String variant_code, String currency_code, String start_time,
			String end_time, String item_price) {
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
		this.vat_code = vat_code;
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
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="item_no")
	String item_no;
	
	@Column(name="store_code")
	String store_code;
	
	@Column(name="unit_price")
	String unit_price;
	
	@Column(name="unit_price_incl_vat")
	String unit_price_incl_vat;
	
	@Column(name="start_date")
	String start_date;
	
	@Column(name="end_date")
	String end_date;
	@Column(name="uom")
	String uom;
	@Column(name="vat_code")
	String vat_code;
	
	@Column(name="location_code")
	String location_code;
	
	@Column(name="variant_code")
	String variant_code;
	@Column(name="currency_code")
	String currency_code;
	
	@Column(name="start_time")
	String start_time;
	@Column(name="end_time")
	String end_time;
	
	@Column(name="item_price")
	String item_price;
	
public ItemPrices() {}
}
