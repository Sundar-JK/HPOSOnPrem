package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice_header")
public class invoice_header {

	
	@Override
	public String toString() {
		return "invoice_header [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", sales_header_no=" + sales_header_no + ", customer_code=" + customer_code + ", invoice_date="
				+ invoice_date + ", invoice_amount=" + invoice_amount + ", due_date=" + due_date + ", invoice_status="
				+ invoice_status + ", invoice_number=" + invoice_number + ", next_invoice_date=" + next_invoice_date
				+ ", period_start_date=" + period_start_date + ", period_end_date=" + period_end_date + ", updated_by="
				+ updated_by + "]";
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
	public String getSales_header_no() {
		return sales_header_no;
	}
	public void setSales_header_no(String sales_header_no) {
		this.sales_header_no = sales_header_no;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getInvoice_amount() {
		return invoice_amount;
	}
	public void setInvoice_amount(String invoice_amount) {
		this.invoice_amount = invoice_amount;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getInvoice_status() {
		return invoice_status;
	}
	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getNext_invoice_date() {
		return next_invoice_date;
	}
	public void setNext_invoice_date(String next_invoice_date) {
		this.next_invoice_date = next_invoice_date;
	}
	public String getPeriod_start_date() {
		return period_start_date;
	}
	public void setPeriod_start_date(String period_start_date) {
		this.period_start_date = period_start_date;
	}
	public String getPeriod_end_date() {
		return period_end_date;
	}
	public void setPeriod_end_date(String period_end_date) {
		this.period_end_date = period_end_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public invoice_header(int id, String created_at, String updated_at, String sales_header_no, String customer_code,
			String invoice_date, String invoice_amount, String due_date, String invoice_status, String invoice_number,
			String next_invoice_date, String period_start_date, String period_end_date, String updated_by) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.sales_header_no = sales_header_no;
		this.customer_code = customer_code;
		this.invoice_date = invoice_date;
		this.invoice_amount = invoice_amount;
		this.due_date = due_date;
		this.invoice_status = invoice_status;
		this.invoice_number = invoice_number;
		this.next_invoice_date = next_invoice_date;
		this.period_start_date = period_start_date;
		this.period_end_date = period_end_date;
		this.updated_by = updated_by;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="sales_header_no")
	String sales_header_no;
	
	@Column(name="customer_code")
	String customer_code;
	
	@Column(name="invoice_date")
	String invoice_date;
	
	@Column(name="invoice_amount")
	String invoice_amount;
	
	@Column(name="due_date")
	String due_date;
	
	@Column(name="invoice_status")
	String invoice_status;
	
	@Column(name="invoice_number")
	String invoice_number;
	
	@Column(name="next_invoice_date")
	String next_invoice_date;
	
	@Column(name="period_start_date")
	String period_start_date;
	
	@Column(name="period_end_date")
	String period_end_date;
	
	@Column(name="updated_by")
	String updated_by;

	
public invoice_header() {}
	
}
