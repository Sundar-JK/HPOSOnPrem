package pojo;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="temporary_transaction_headers")
public class TempTrnHeaders {

	@Override
	public String toString() {
		return "TempTrnHeaders [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
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
	public int getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(int transaction_no) {
		this.transaction_no = transaction_no;
	}
	public int getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(int receipt_no) {
		this.receipt_no = receipt_no;
	}
	public int getStore_no() {
		return store_no;
	}
	public void setStore_no(int store_no) {
		this.store_no = store_no;
	}
	public int getPos_terminal_no() {
		return pos_terminal_no;
	}
	public void setPos_terminal_no(int pos_terminal_no) {
		this.pos_terminal_no = pos_terminal_no;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public LocalDateTime getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(LocalDateTime transaction_date) {
		this.transaction_date = transaction_date;
	}
	public LocalDateTime getOriginal_date() {
		return original_date;
	}
	public void setOriginal_date(LocalDateTime original_date) {
		this.original_date = original_date;
	}
	public LocalTime getTransaction_time() {
		return transaction_time;
	}
//	public void setTransaction_time(Time transaction_time) {
//		 if (transaction_time != null) {
//		        this.transaction_time = transaction_time ;
////		this.transaction_time = transaction_time;
//	}
	public void setTransaction_time(LocalTime transaction_time) {
	    if (transaction_time != null) {
	        this.transaction_time = transaction_time;
	    }
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public int getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(int net_amount) {
		this.net_amount = net_amount;
	}
	public int getGross_amount() {
		return gross_amount;
	}
	public void setGross_amount(int gross_amount) {
		this.gross_amount = gross_amount;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getDiscounts() {
		return discounts;
	}
	public void setDiscounts(int discounts) {
		this.discounts = discounts;
	}
	public int getTotal_quantity() {
		return total_quantity;
	}
	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}
	public int getEntry_status() {
		return entry_status;
	}
	public void setEntry_status(int entry_status) {
		this.entry_status = entry_status;
	}
	public int getNo_of_item_lines() {
		return no_of_item_lines;
	}
	public void setNo_of_item_lines(int no_of_item_lines) {
		this.no_of_item_lines = no_of_item_lines;
	}
	public int getNo_of_payment_lines() {
		return no_of_payment_lines;
	}
	public void setNo_of_payment_lines(int no_of_payment_lines) {
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
	
	
	
	public TempTrnHeaders(int id, LocalDateTime created_at, LocalDateTime updated_at, int transaction_no, int receipt_no,
			int store_no, int pos_terminal_no, int staff_id, LocalDateTime transaction_date, LocalDateTime original_date,
			LocalTime transaction_time, String customer_no, int net_amount, int gross_amount, int payment,
			int discounts, int total_quantity, int entry_status, int no_of_item_lines,
			int no_of_payment_lines, String table_no, String table_capacity, String no_of_covers,
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
	int transaction_no;
	

	
	
	@Column(name="receipt_no")
	private int receipt_no;

	
	
	@Column(name="store_no")
	private int store_no;
	

	@Column(name="pos_terminal_no")
	private int pos_terminal_no;
	
	
	@Column(name="staff_id")
	private int staff_id;
	

	@CreationTimestamp
	@Column(name="transaction_date")
	private LocalDateTime transaction_date;
	

	@CreationTimestamp
	@Column(name="original_date")
    private LocalDateTime original_date;
	

	@CreationTimestamp
	@Column(name="transaction_time")
	private LocalTime transaction_time;
	
 
	@Column(name="customer_no")
    String customer_no;
	
	
	@Column(name="net_amount")
	 int net_amount;
	
	
	@Column(name="gross_amount")
	 int gross_amount;
	
	
	@Column(name="Payment")
	 int payment;
	
	
	@Column(name="Discounts")
	 int discounts;
	
	
	@Column(name="total_quantity")
	private int total_quantity;

	@Column(name="entry_status")
     int entry_status;
	
	
	@Column(name="no_of_item_lines")
	int no_of_item_lines;
	
	
	@Column(name="no_of_payment_lines")
	 int no_of_payment_lines;
	

	@Column(name="table_no")
	 String table_no;
	
	
	@Column(name="table_capacity")
	 String table_capacity;
	
	
	@Column(name="no_of_covers")
	 String no_of_covers;
	
	
	@Column(name="active_table_no")
	 String active_table_no;
	

	@Column(name="table_group")
	 String table_group;
	
	
	@Column(name="kitchen_status")
	 String kitchen_status;
	
	
	@Column(name="order_no")
	 String order_no;
	
	
	@Column(name="order_current_status")
	 String order_current_status;
	

	@Column(name="order_delivery_id")
	String order_delivery_id;
	
	
	@Column(name="vat_amount")
	String vat_amount;

	@Column(name="zreport_id")
	 String zreport_id;
	
	
	@Column(name="variant_code")
	String variant_code;
   
	
	
	
  public TempTrnHeaders() {}
}
