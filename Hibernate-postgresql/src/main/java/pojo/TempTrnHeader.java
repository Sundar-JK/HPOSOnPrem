package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="temptrn_table")
public class TempTrnHeader {

	@Override
	public String toString() {
		return "TempTableHeader [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", transaction_no=" + transaction_no + ", receipt_no=" + receipt_no + ", store_no=" + store_no
				+ ", pos_terminal_no=" + pos_terminal_no + ", staff_id=" + staff_id + ", transaction_date="
				+ transaction_date + ", original_date=" + original_date + ", transaction_time=" + transaction_time
				+ ", customer_no=" + customer_no + ", net_amount=" + net_amount + ", gross_amount=" + gross_amount
				+ ", payment=" + payment + ", discounts=" + discounts + ", total_quantity=" + total_quantity
				+ ", entry_status=" + entry_status + ", no_of_item_lines=" + no_of_item_lines + ", no_of_payment_lines="
				+ no_of_payment_lines + ", table_no=" + table_no + ", table_capacity=" + table_capacity
				+ ", no_of_covers=" + no_of_covers + ", active_table_no=" + active_table_no + ", table_group="
				+ table_group + ", kitchen_status=" + kitchen_status + ", order_no=" + order_no
				+ ", order_current_status=" + order_current_status + ", order_delivery_id=" + order_delivery_id
				+ ", vat_amount=" + vat_amount + ", zreport_id=" + zreport_id + ", variant_code=" + variant_code
				+ ",]";
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
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getOriginal_date() {
		return original_date;
	}
	public void setOriginal_date(String original_date) {
		this.original_date = original_date;
	}
	public String getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(String net_amount) {
		this.net_amount = net_amount;
	}
	public String getGross_amount() {
		return gross_amount;
	}
	public void setGross_amount(String gross_amount) {
		this.gross_amount = gross_amount;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDiscounts() {
		return discounts;
	}
	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}
	public String getTotal_quantity() {
		return total_quantity;
	}
	public void setTotal_quantity(String total_quantity) {
		this.total_quantity = total_quantity;
	}
	public String getEntry_status() {
		return entry_status;
	}
	public void setEntry_status(String entry_status) {
		this.entry_status = entry_status;
	}
	public String getNo_of_item_lines() {
		return no_of_item_lines;
	}
	public void setNo_of_item_lines(String no_of_item_lines) {
		this.no_of_item_lines = no_of_item_lines;
	}
	public String getNo_of_payment_lines() {
		return no_of_payment_lines;
	}
	public void setNo_of_payment_lines(String no_of_payment_lines) {
		this.no_of_payment_lines = no_of_payment_lines;
	}
	public String getTable_no() {
		return table_no;
	}
	public void setTable_no(String table_no) {
		this.table_no = table_no;
	}
	public String getTable_capacity() {
		return table_capacity;
	}
	public void setTable_capacity(String table_capacity) {
		this.table_capacity = table_capacity;
	}
	public String getNo_of_covers() {
		return no_of_covers;
	}
	public void setNo_of_covers(String no_of_covers) {
		this.no_of_covers = no_of_covers;
	}
	public String getActive_table_no() {
		return active_table_no;
	}
	public void setActive_table_no(String active_table_no) {
		this.active_table_no = active_table_no;
	}
	public String getTable_group() {
		return table_group;
	}
	public void setTable_group(String table_group) {
		this.table_group = table_group;
	}
	public String getKitchen_status() {
		return kitchen_status;
	}
	public void setKitchen_status(String kitchen_status) {
		this.kitchen_status = kitchen_status;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getOrder_current_status() {
		return order_current_status;
	}
	public void setOrder_current_status(String order_current_status) {
		this.order_current_status = order_current_status;
	}
	public String getOrder_delivery_id() {
		return order_delivery_id;
	}
	public void setOrder_delivery_id(String order_delivery_id) {
		this.order_delivery_id = order_delivery_id;
	}
	public String getVat_amount() {
		return vat_amount;
	}
	public void setVat_amount(String vat_amount) {
		this.vat_amount = vat_amount;
	}
	public String getZreport_id() {
		return zreport_id;
	}
	public void setZreport_id(String zreport_id) {
		this.zreport_id = zreport_id;
	}
	public String getVariant_code() {
		return variant_code;
	}
	public void setVariant_code(String variant_code) {
		this.variant_code = variant_code;
	}
	
	
	
	public TempTrnHeader(int id, String created_at, String updated_at, String transaction_no, String receipt_no,
			String store_no, String pos_terminal_no, String staff_id, String transaction_date, String original_date,
			String transaction_time, String customer_no, String net_amount, String gross_amount, String payment,
			String discounts, String total_quantity, String entry_status, String no_of_item_lines,
			String no_of_payment_lines, String table_no, String table_capacity, String no_of_covers,
			String active_table_no, String table_group, String kitchen_status, String order_no,
			String order_current_status, String order_delivery_id, String vat_amount, String zreport_id,
			String variant_code) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.transaction_no = transaction_no;
		this.receipt_no = receipt_no;
		this.store_no = store_no;
		this.pos_terminal_no = pos_terminal_no;
		this.staff_id = staff_id;
		this.transaction_date = transaction_date;
		this.original_date = original_date;
		this.transaction_time = transaction_time;
		this.customer_no = customer_no;
		this.net_amount = net_amount;
		this.gross_amount = gross_amount;
		this.payment = payment;
		this.discounts = discounts;
		this.total_quantity = total_quantity;
		this.entry_status = entry_status;
		this.no_of_item_lines = no_of_item_lines;
		this.no_of_payment_lines = no_of_payment_lines;
		this.table_no = table_no;
		this.table_capacity = table_capacity;
		this.no_of_covers = no_of_covers;
		this.active_table_no = active_table_no;
		this.table_group = table_group;
		this.kitchen_status = kitchen_status;
		this.order_no = order_no;
		this.order_current_status = order_current_status;
		this.order_delivery_id = order_delivery_id;
		this.vat_amount = vat_amount;
		this.zreport_id = zreport_id;
		this.variant_code = variant_code;
	}


	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="TransactionNo")
	String transaction_no;
	
	@Column(name="ReceiptNO")
	String receipt_no;
	
	@Column(name="StoreNo")
	String store_no;
	
	@Column(name="PosTerminalNo")
	String pos_terminal_no;
	
	@Column(name="StaffId")
	String staff_id;
	
	@Column(name="TransactionDate")
	String transaction_date;
	
	@Column(name="OriginalDate")
    String original_date;
	
	@Column(name="TransactionTime")
    String transaction_time;
	
	@Column(name="CustomerNO")
    String customer_no;
	
	@Column(name="NetAmount")
    String net_amount;
	
	@Column(name="GrossAmount")
    String gross_amount;
	
	@Column(name="Payment")
    String payment;
	
	@Column(name="Discounts")
    String discounts;
	
	@Column(name="TotalQuantity")
    String total_quantity;
	
	@Column(name="EntryStatus")
    String entry_status;
	
	@Column(name="NoOfItemlines")
    String no_of_item_lines;
	
	@Column(name="noofpaymentLines")
    String no_of_payment_lines;
	
	@Column(name="tableNo")
    String table_no;
	
	@Column(name="TableCapacity")
    String table_capacity;
	
	@Column(name="NoofCovers")
    String no_of_covers;
	
	@Column(name="ActivetableNO")
    String active_table_no;
	
	@Column(name="TableGroup")
    String table_group;
	
	@Column(name="KitchenStatus")
    String kitchen_status;
	
	@Column(name="orderNO")
    String order_no;
	
	@Column(name="OrderCurrentStatus")
    String order_current_status;
	
	@Column(name="OrderDeliveryId")
    String order_delivery_id;
	
	@Column(name="VatAmount")
    String vat_amount;
	
	@Column(name="ZreportId")
    String zreport_id;
	
	@Column(name="VariantCode")
    String variant_code;
   
	
	
	
  public TempTrnHeader() {}
		
}
