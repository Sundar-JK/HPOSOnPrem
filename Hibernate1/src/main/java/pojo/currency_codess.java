package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "currency_codes")
public class currency_codess {

	@Override
	public String toString() {
		return "currency_codess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", symbol="
				+ symbol + ", name=" + name + ", symbol_native=" + symbol_native + ", decimal_digits=" + decimal_digits
				+ ", rounding=" + rounding + ", code=" + code + ", name_plural=" + name_plural + ", description="
				+ description + ", amount_rounding_precision=" + amount_rounding_precision + ", amount_decimal_places="
				+ amount_decimal_places + ", invoice_rounding_precision=" + invoice_rounding_precision
				+ ", unit_amount_rounding_precision=" + unit_amount_rounding_precision + ", unit_amount_decimal_places="
				+ unit_amount_decimal_places + ", last_date_modified=" + last_date_modified + "]";
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol_native() {
		return symbol_native;
	}
	public void setSymbol_native(String symbol_native) {
		this.symbol_native = symbol_native;
	}
	public String getDecimal_digits() {
		return decimal_digits;
	}
	public void setDecimal_digits(String decimal_digits) {
		this.decimal_digits = decimal_digits;
	}
	public String getRounding() {
		return rounding;
	}
	public void setRounding(String rounding) {
		this.rounding = rounding;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName_plural() {
		return name_plural;
	}
	public void setName_plural(String name_plural) {
		this.name_plural = name_plural;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount_rounding_precision() {
		return amount_rounding_precision;
	}
	public void setAmount_rounding_precision(String amount_rounding_precision) {
		this.amount_rounding_precision = amount_rounding_precision;
	}
	public String getAmount_decimal_places() {
		return amount_decimal_places;
	}
	public void setAmount_decimal_places(String amount_decimal_places) {
		this.amount_decimal_places = amount_decimal_places;
	}
	public String getInvoice_rounding_precision() {
		return invoice_rounding_precision;
	}
	public void setInvoice_rounding_precision(String invoice_rounding_precision) {
		this.invoice_rounding_precision = invoice_rounding_precision;
	}
	public String getUnit_amount_rounding_precision() {
		return unit_amount_rounding_precision;
	}
	public void setUnit_amount_rounding_precision(String unit_amount_rounding_precision) {
		this.unit_amount_rounding_precision = unit_amount_rounding_precision;
	}
	public String getUnit_amount_decimal_places() {
		return unit_amount_decimal_places;
	}
	public void setUnit_amount_decimal_places(String unit_amount_decimal_places) {
		this.unit_amount_decimal_places = unit_amount_decimal_places;
	}
	public String getLast_date_modified() {
		return last_date_modified;
	}
	public void setLast_date_modified(String last_date_modified) {
		this.last_date_modified = last_date_modified;
	}
	public currency_codess(int id, String created_at, String updated_at, String symbol, String name,
			String symbol_native, String decimal_digits, String rounding, String code, String name_plural,
			String description, String amount_rounding_precision, String amount_decimal_places,
			String invoice_rounding_precision, String unit_amount_rounding_precision, String unit_amount_decimal_places,
			String last_date_modified) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.symbol = symbol;
		this.name = name;
		this.symbol_native = symbol_native;
		this.decimal_digits = decimal_digits;
		this.rounding = rounding;
		this.code = code;
		this.name_plural = name_plural;
		this.description = description;
		this.amount_rounding_precision = amount_rounding_precision;
		this.amount_decimal_places = amount_decimal_places;
		this.invoice_rounding_precision = invoice_rounding_precision;
		this.unit_amount_rounding_precision = unit_amount_rounding_precision;
		this.unit_amount_decimal_places = unit_amount_decimal_places;
		this.last_date_modified = last_date_modified;
	}
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="symbol")
	String symbol;
	
	@Column(name="name")
	String name;
	
	@Column(name="symbol_native")
	String symbol_native;
	
	@Column(name="decimal_digits")
	String decimal_digits;
	
	@Column(name="rounding")
	String rounding;
	
	@Column(name="code")
	String code;
	
	@Column(name="name_plural")
	String name_plural;
	
	@Column(name="description")
	String description;
	
	@Column(name="amount_rounding_precision")
	String amount_rounding_precision;
	
	@Column(name="amount_decimal_places")
	String amount_decimal_places;
	
	@Column(name="invoice_rounding_precision")
	String invoice_rounding_precision;
	
	@Column(name="unit_amount_rounding_precision")
	String unit_amount_rounding_precision;
	
	@Column(name="unit_amount_decimal_places")
	String unit_amount_decimal_places;
	
	@Column(name="last_date_modified ")
	String last_date_modified;

	public currency_codess() {
		
	}
	
	
}
