package pojo;

public class Details {

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
	public String getAdditional_info_exist() {
		return additional_info_exist;
	}
	public void setAdditional_info_exist(String additional_info_exist) {
		this.additional_info_exist = additional_info_exist;
	}
	public String getSales_type() {
		return sales_type;
	}
	public void setSales_type(String sales_type) {
		this.sales_type = sales_type;
	}
	public String getLine_is_excluded() {
		return line_is_excluded;
	}
	public void setLine_is_excluded(String line_is_excluded) {
		this.line_is_excluded = line_is_excluded;
	}
	public String getAdditional_charge_lines_exist() {
		return additional_charge_lines_exist;
	}
	public void setAdditional_charge_lines_exist(String additional_charge_lines_exist) {
		this.additional_charge_lines_exist = additional_charge_lines_exist;
	}
	public String getSales_staff() {
		return sales_staff;
	}
	public void setSales_staff(String sales_staff) {
		this.sales_staff = sales_staff;
	}
	public String getCoverid() {
		return coverid;
	}
	public void setCoverid(String coverid) {
		this.coverid = coverid;
	}
	public String getParent_item_no() {
		return parent_item_no;
	}
	public void setParent_item_no(String parent_item_no) {
		this.parent_item_no = parent_item_no;
	}
	public String getParent_order_ref_no() {
		return parent_order_ref_no;
	}
	public void setParent_order_ref_no(String parent_order_ref_no) {
		this.parent_order_ref_no = parent_order_ref_no;
	}
	
	public Details(int id, String created_at, String updated_at, String transaction_no, String receipt_no,
			String line_no, String product_code, String entry_status, String description, String uom, String store_no,
			String pos_terminal_no, String quantity, String vat_percent, String discount_percent,
			String discount_amount, String net_amount, String vat_amount, String amount, String additional_info_exist,
			String sales_type, String line_is_excluded, String additional_charge_lines_exist, String sales_staff,
			String coverid, String parent_item_no, String parent_order_ref_no) {
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
		this.additional_info_exist = additional_info_exist;
		this.sales_type = sales_type;
		this.line_is_excluded = line_is_excluded;
		this.additional_charge_lines_exist = additional_charge_lines_exist;
		this.sales_staff = sales_staff;
		this.coverid = coverid;
		this.parent_item_no = parent_item_no;
		this.parent_order_ref_no = parent_order_ref_no;
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
	String additional_info_exist;
	String sales_type;
	String line_is_excluded;
	String additional_charge_lines_exist;
	String sales_staff;
	String coverid;
	String parent_item_no;
	String parent_order_ref_no;
	
	public Details() {}
	
}
