package pojo;

import java.util.List;

public class Headers {

	public void setDetails(List<Details> details) {
		this.details = details;
	}
	public List<Details> getDetails() {
		return details;
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
	public String getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}
	public String getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}
	public String getLine_no() {
		return line_no;
	}
	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getEntry_status() {
		return entry_status;
	}
	public void setEntry_status(String entry_status) {
		this.entry_status = entry_status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getStore_no() {
		return store_no;
	}
	public void setStore_no(String store_no) {
		this.store_no = store_no;
	}
	public String getPos_terminal_no() {
		return pos_terminal_no;
	}
	public void setPos_terminal_no(String pos_terminal_no) {
		this.pos_terminal_no = pos_terminal_no;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getVat_percent() {
		return vat_percent;
	}
	public void setVat_percent(String vat_percent) {
		this.vat_percent = vat_percent;
	}
	public String getDiscount_percent() {
		return discount_percent;
	}
	public void setDiscount_percent(String discount_percent) {
		this.discount_percent = discount_percent;
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
	public String getVat_amount() {
		return vat_amount;
	}
	public void setVat_amount(String vat_amount) {
		this.vat_amount = vat_amount;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
	public String getVat_percentage() {
		return vat_percentage;
	}
	public void setVat_percentage(String vat_percentage) {
		this.vat_percentage = vat_percentage;
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
	
	
	public Headers(int id, String created_at, String updated_at, String transaction_no, String receipt_no,
			String line_no, String product_code, String entry_status, String description, String uom, String store_no,
			String pos_terminal_no, String quantity, String vat_percent, String discount_percent,
			String discount_amount, String net_amount, String vat_amount, String amount,
			
			 String hierarchy, String vat_code,
			String vat_percentage, String unit_price_amount, String unit_price_without_tax,List<Details>details) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.transaction_no = transaction_no;
		this.receipt_no = receipt_no;
		this.line_no = line_no;
		this.product_code = product_code;
		this.entry_status = entry_status;
		this.description = description;
		this.uom = uom;
		this.store_no = store_no;
		this.pos_terminal_no = pos_terminal_no;
		this.quantity = quantity;
		this.vat_percent = vat_percent;
		this.discount_percent = discount_percent;
		this.discount_amount = discount_amount;
		this.net_amount = net_amount;
		this.vat_amount = vat_amount;
		this.amount = amount;
		this.hierarchy = hierarchy;	
		this.vat_code = vat_code;
		this.vat_percentage = vat_percentage;
		this.unit_price_amount = unit_price_amount;
		this.unit_price_without_tax = unit_price_without_tax;
		this.details=details;
		
	}


	int id;
	String created_at;
	String updated_at;
	String transaction_no;
	String receipt_no;
	String line_no;
	String product_code;
	String entry_status;
	String description;
	String uom;
	String store_no;
	String pos_terminal_no;
	String quantity;
	String vat_percent;
	String discount_percent;
	String discount_amount;
	String net_amount;
	String vat_amount;
	String amount;
	String hierarchy;
	String vat_code;
	String vat_percentage;
	String unit_price_amount;
	String unit_price_without_tax;
	
	List<Details>details;
	

	public Headers() {}

}
