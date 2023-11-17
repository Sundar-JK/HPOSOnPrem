package pojo;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="temporary_order_headers")
public class TempTrnOrdHeaders {

	@Override
	public String toString() {
		return "TempTrnOrdHeaders [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", transaction_no=" + transaction_no + ", receipt_no=" + receipt_no + ", line_no=" + line_no
				+ ", product_code=" + product_code + ", entry_status=" + entry_status + ", description=" + description
				+ ", uom=" + uom + ", store_no=" + store_no + ", pos_terminal_no=" + pos_terminal_no + ", quantity="
				+ quantity + ", vat_percent=" + vat_percent + ", discount_percent=" + discount_percent
				+ ", discount_amount=" + discount_amount + ", net_amount=" + net_amount + ", vat_amount=" + vat_amount
				+ ", amount=" + amount + ", additional_info_exist=" + additional_info_exist + ", sales_type="
				+ sales_type + ", line_current_status=" + line_current_status + ", additional_charge_lines_exist="
				+ additional_charge_lines_exist + ", sales_staff=" + sales_staff + ", coverid=" + coverid
				+ ", parent_item_no=" + parent_item_no + ", hierarchy=" + hierarchy + ", parent_order_ref_no="
				+ parent_order_ref_no + ", vat_code=" + vat_code + ", vat_percentage=" + vat_percentage
				+ ", unit_price_amount=" + unit_price_amount + ", unit_price_without_tax=" + unit_price_without_tax
				+ ", gross_amount=" + gross_amount + ", amount_without_tax=" + amount_without_tax + ", tax_amount="
				+ tax_amount + ", price_includes_tax=" + price_includes_tax + ", kot_ref_id=" + kot_ref_id
				+ ", deal_name=" + deal_name + ", deal_trn_link=" + deal_trn_link + ", variant_code=" + variant_code
				+ ",]";  
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	public String getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}
	public int getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(int receipt_no) {
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getVat_percent() {
		return vat_percent;
	}
	public void setVat_percent(int vat_percent) {
		this.vat_percent = vat_percent;
	}
	public int getDiscount_percent() {
		return discount_percent;
	}
	public void setDiscount_percent(int discount_percent) {
		this.discount_percent = discount_percent;
	}
	public int getDiscount_amount() {
		return discount_amount;
	}
	public void setDiscount_amount(int discount_amount) {
		this.discount_amount = discount_amount;
	}
	public int getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(int net_amount) {
		this.net_amount = net_amount;
	}
	public int getVat_amount() {
		return vat_amount;
	}
	public void setVat_amount(int vat_amount) {
		this.vat_amount = vat_amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
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
	public String getLine_current_status() {
		return line_current_status;
	}
	public void setLine_current_status(String line_current_status) {
		this.line_current_status = line_current_status;
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
	public String getHierarchy() {
		return hierarchy;
	}
	public void setHierarchy(String hierarchy) {
		this.hierarchy = hierarchy;
	}
	public String getParent_order_ref_no() {
		return parent_order_ref_no;
	}
	public void setParent_order_ref_no(String parent_order_ref_no) {
		this.parent_order_ref_no = parent_order_ref_no;
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
	public String getGross_amount() {
		return gross_amount;
	}
	public void setGross_amount(String gross_amount) {
		this.gross_amount = gross_amount;
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
	public boolean getPrice_includes_tax() {
		return price_includes_tax;
	}
	public void setPrice_includes_tax(boolean price_includes_tax) {
		this.price_includes_tax = price_includes_tax;
	}
	public String getKot_ref_id() {
		return kot_ref_id;
	}
	public void setKot_ref_id(String kot_ref_id) {
		this.kot_ref_id = kot_ref_id;
	}
	public String getDeal_name() {
		return deal_name;
	}
	public void setDeal_name(String deal_name) {
		this.deal_name = deal_name;
	}
	public String getDeal_trn_link() {
		return deal_trn_link;
	}
	public void setDeal_trn_link(String deal_trn_link) {
		this.deal_trn_link = deal_trn_link;
	}
	public String getVariant_code() {
		return variant_code;
	}
	public void setVariant_code(String variant_code) {
		this.variant_code = variant_code;
	}
	
	
	public TempTrnOrdHeaders(int id, LocalDateTime created_at, LocalDateTime updated_at, String transaction_no, int receipt_no,
			String line_no, String product_code, String entry_status, String description, String uom, String store_no,
			String pos_terminal_no, int quantity, int vat_percent, int discount_percent,
			int discount_amount, int net_amount, int vat_amount, int amount, String additional_info_exist,
			String sales_type, String line_current_status, String additional_charge_lines_exist, String sales_staff,
			String coverid, String parent_item_no, String hierarchy, String parent_order_ref_no, String vat_code,
			String vat_percentage, String unit_price_amount, String unit_price_without_tax, String gross_amount,
			String amount_without_tax, String tax_amount, boolean price_includes_tax, String kot_ref_id,
			String deal_name, String deal_trn_link, String variant_code) {
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
		this.line_current_status = line_current_status;
		this.additional_charge_lines_exist = additional_charge_lines_exist;
		this.sales_staff = sales_staff;
		this.coverid = coverid;
		this.parent_item_no = parent_item_no;
		this.hierarchy = hierarchy;
		this.parent_order_ref_no = parent_order_ref_no;
		this.vat_code = vat_code;
		this.vat_percentage = vat_percentage;
		this.unit_price_amount = unit_price_amount;
		this.unit_price_without_tax = unit_price_without_tax;
		this.gross_amount = gross_amount;
		this.amount_without_tax = amount_without_tax;
		this.tax_amount = tax_amount;
		this.price_includes_tax = price_includes_tax;
		this.kot_ref_id = kot_ref_id;
		this.deal_name = deal_name;
		this.deal_trn_link = deal_trn_link;
		this.variant_code = variant_code;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@CreationTimestamp
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	private LocalDateTime updated_at;
	
	@Column(name="transaction_no")
	String transaction_no;
	
	@Column(name="receipt_no")
	private int receipt_no;
	
	@Column(name="line_no")
	 String line_no;
	
	@Column(name="product_code")
	String product_code;
	
	@Column(name="entry_status")
	private String entry_status;
	
	@Column(name="description")
	String description;
	
	@Column(name="uom")
	String uom;
	
	@Column(name="store_no")
	String store_no;
	
	@Column(name="pos_terminal_no")
	String pos_terminal_no;
	
	@Column(name="quantity")
	private int  quantity;
	
	@Column(name="vat_percent")
	private int vat_percent;
	
	@Column(name="discount_percent")
	private int discount_percent;
	
	@Column(name="discount_amount")
	private int discount_amount;
	
	@Column(name="net_amount")
	private int net_amount;
	
	@Column(name="vat_amount")
	private int vat_amount;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="additional_info_exist")
	String additional_info_exist;
	
	@Column(name="sales_type")
	String sales_type;
	
	@Column(name="line_current_status")
	String line_current_status;
	
	@Column(name="additional_charge_lines_exist")
	String additional_charge_lines_exist;
	
	@Column(name="sales_staff")
	String sales_staff;
	
	@Column(name="coverid")
	String coverid;
	
	@Column(name="parent_item_no")
	String parent_item_no;
	
	@Column(name="hierarchy")
	String hierarchy;
	
	@Column(name="parent_order_ref_no")
	String parent_order_ref_no;
	
	@Column(name="vat_code")
	String vat_code;
	
	@Column(name="vat_percentage")
	String vat_percentage;
	
	@Column(name="unit_price_amount")
	String unit_price_amount;
	
	@Column(name="unit_price_without_tax")
	String unit_price_without_tax;
	
	@Column(name="gross_amount")
	String gross_amount;
	
	@Column(name="amount_without_tax")
	String amount_without_tax;
	
	@Column(name="tax_amount")
	String tax_amount;
	
	@Column(name="price_includes_tax")
	private boolean price_includes_tax;
	
	@Column(name="kot_ref_id")
	String kot_ref_id;
	
	@Column(name="deal_name")
	String deal_name;
	
	@Column(name="deal_trn_link")
	String deal_trn_link;
	
	@Column(name="variant_code")
	String variant_code;
	

	
	
public TempTrnOrdHeaders() {}	

}
