package pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="temporary_order_details")
public class TempTrnOrdDetails {


	@Override
	public String toString() {
		return "TempTrnOrdDetails [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", transaction_no=" + transaction_no + ", receipt_no=" + receipt_no + ", line_no=" + line_no
				+ ", product_code=" + product_code + ", entry_status=" + entry_status + ", description=" + description
				+ ", uom=" + uom + ", store_no=" + store_no + ", pos_terminal_no=" + pos_terminal_no + ", quantity="
				+ quantity + ", vat_percent=" + vat_percent + ", discount_percent=" + discount_percent
				+ ", discount_amount=" + discount_amount + ", net_amount=" + net_amount + ", vat_amount=" + vat_amount
				+ ", amount=" + amount + ", additional_info_exist=" + additional_info_exist + ", sales_type="
				+ sales_type + ", line_is_excluded=" + line_is_excluded + ", additional_charge_lines_exist="
				+ additional_charge_lines_exist + ", sales_staff=" + sales_staff + ", coverid=" + coverid
				+ ", parent_item_no=" + parent_item_no + ", parent_order_ref_no=" + parent_order_ref_no + ", getId()="
				+ getId() + ", getCreated_at()=" + getCreated_at() + ", getUpdated_at()=" + getUpdated_at()
				+ ", getTransaction_no()=" + getTransaction_no() + ", getReceipt_no()=" + getReceipt_no()
				+ ", getLine_no()=" + getLine_no() + ", getProduct_code()=" + getProduct_code() + ", getEntry_status()="
				+ getEntry_status() + ", getDescription()=" + getDescription() + ", getUom()=" + getUom()
				+ ", getStore_no()=" + getStore_no() + ", getPos_terminal_no()=" + getPos_terminal_no()
				+ ", getQuantity()=" + getQuantity() + ", getVat_percent()=" + getVat_percent()
				+ ", getDiscount_percent()=" + getDiscount_percent() + ", getDiscount_amount()=" + getDiscount_amount()
				+ ", getNet_amount()=" + getNet_amount() + ", getVat_amount()=" + getVat_amount() + ", getAmount()="
				+ getAmount() + ", getAdditional_info_exist()=" + getAdditional_info_exist() + ", getSales_type()="
				+ getSales_type() + ", getLine_is_excluded()=" + getLine_is_excluded()
				+ ", getAdditional_charge_lines_exist()=" + getAdditional_charge_lines_exist() + ", getSales_staff()="
				+ getSales_staff() + ", getCoverid()=" + getCoverid() + ", getParent_item_no()=" + getParent_item_no()
				+ ", getParent_order_ref_no()=" + getParent_order_ref_no() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	
	
	
	public TempTrnOrdDetails(int id, LocalDateTime created_at, LocalDateTime updated_at, String transaction_no, String receipt_no,
			String line_no, String product_code, String entry_status, String description, String uom, String store_no,
			String pos_terminal_no, int quantity, int vat_percent, int discount_percent,
			int discount_amount, int net_amount, int vat_amount, int amount, String additional_info_exist,
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	 int id;
	
	@CreationTimestamp
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	@CreationTimestamp
	@Column(name="updated_at")
	private LocalDateTime updated_at;
	
	@Column(name="transaction_no")
	String transaction_no;
	
	@Column(name="receipt_no")
	String receipt_no;
	
	@Column(name="line_no")
	String line_no;
	
	@Column(name="product_code")
	String product_code;
	
	@Column(name="entry_status")
	String entry_status;
	
	@Column(name="description")
	String description;
	
	@Column(name="uom")
	String uom;
	
	@Column(name="store_no")
	String store_no;
	
	@Column(name="pos_terminal_no")
	String pos_terminal_no;
	
	@Column(name="quantity")
	 int quantity;
	
	@Column(name="vat_percent")
	 int vat_percent;
	
	@Column(name="discount_percent")
	 int discount_percent;
	
	@Column(name="discount_amount")
	 int discount_amount;
	
	@Column(name="net_amount")
	 int net_amount;
	
	@Column(name="vat_amount")
	 int vat_amount;
	
	@Column(name="amount")
	 int amount;
	
	@Column(name="additional_info_exist")
	String additional_info_exist;
	
	@Column(name="sales_type")
	String sales_type;
	
	@Column(name="line_is_excluded")
	String line_is_excluded;
	
	@Column(name="additional_charge_lines_exist")
	String additional_charge_lines_exist;
	
	@Column(name="sales_staff")
	String sales_staff;
	
	@Column(name="coverid")
	String coverid;
	
	@Column(name="parent_item_no")
	String parent_item_no;
	
	@Column(name="parent_order_ref_no")
	String parent_order_ref_no;
	
	
	public TempTrnOrdDetails() {}
}
