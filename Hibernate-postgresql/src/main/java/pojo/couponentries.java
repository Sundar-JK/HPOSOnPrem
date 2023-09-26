package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "couponcountries_table")
public class couponentries {

	@Override
	public String toString() {
		return "couponentries [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", store_no="
				+ store_no + ", pos_terminal_no=" + pos_terminal_no + ", transaction_no=" + transaction_no
				+ ", coupon_code=" + coupon_code + ", line_no=" + line_no + ", coupon_reference_no="
				+ coupon_reference_no + ", coupon_no=" + coupon_no + ", barcode=" + barcode + ", issued_by_store="
				+ issued_by_store + ", issued_by_pos_terminal=" + issued_by_pos_terminal + ", issue_date=" + issue_date
				+ ", issued_by_user=" + issued_by_user + ", reserved_by_pos_terminal_no=" + reserved_by_pos_terminal_no
				+ ", date_reserved_on_pos=" + date_reserved_on_pos + ", first_valid_date=" + first_valid_date
				+ ", last_valid_date=" + last_valid_date + ", status=" + status + ", sequence_no=" + sequence_no
				+ ", closed_by_store=" + closed_by_store + ", closed_by_terminal=" + closed_by_terminal
				+ ", closed_date=" + closed_date + ", closed_by_user=" + closed_by_user + ", closed_by_entry_no="
				+ closed_by_entry_no + ", discount_type=" + discount_type + ", value=" + value + ", value_type="
				+ value_type + ", g_l_status=" + g_l_status + ", g_l_amount=" + g_l_amount + ", coupon_function="
				+ coupon_function + ", fbp_ledger_entry_no=" + fbp_ledger_entry_no + ", member_account_no="
				+ member_account_no + "]";
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
	public String getTransaction_no() {
		return transaction_no;
	}
	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}
	public String getCoupon_code() {
		return coupon_code;
	}
	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}
	public String getLine_no() {
		return line_no;
	}
	public void setLine_no(String line_no) {
		this.line_no = line_no;
	}
	public String getCoupon_reference_no() {
		return coupon_reference_no;
	}
	public void setCoupon_reference_no(String coupon_reference_no) {
		this.coupon_reference_no = coupon_reference_no;
	}
	public String getCoupon_no() {
		return coupon_no;
	}
	public void setCoupon_no(String coupon_no) {
		this.coupon_no = coupon_no;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getIssued_by_store() {
		return issued_by_store;
	}
	public void setIssued_by_store(String issued_by_store) {
		this.issued_by_store = issued_by_store;
	}
	public String getIssued_by_pos_terminal() {
		return issued_by_pos_terminal;
	}
	public void setIssued_by_pos_terminal(String issued_by_pos_terminal) {
		this.issued_by_pos_terminal = issued_by_pos_terminal;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getIssued_by_user() {
		return issued_by_user;
	}
	public void setIssued_by_user(String issued_by_user) {
		this.issued_by_user = issued_by_user;
	}
	public String getReserved_by_pos_terminal_no() {
		return reserved_by_pos_terminal_no;
	}
	public void setReserved_by_pos_terminal_no(String reserved_by_pos_terminal_no) {
		this.reserved_by_pos_terminal_no = reserved_by_pos_terminal_no;
	}
	public String getDate_reserved_on_pos() {
		return date_reserved_on_pos;
	}
	public void setDate_reserved_on_pos(String date_reserved_on_pos) {
		this.date_reserved_on_pos = date_reserved_on_pos;
	}
	public String getFirst_valid_date() {
		return first_valid_date;
	}
	public void setFirst_valid_date(String first_valid_date) {
		this.first_valid_date = first_valid_date;
	}
	public String getLast_valid_date() {
		return last_valid_date;
	}
	public void setLast_valid_date(String last_valid_date) {
		this.last_valid_date = last_valid_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(String sequence_no) {
		this.sequence_no = sequence_no;
	}
	public String getClosed_by_store() {
		return closed_by_store;
	}
	public void setClosed_by_store(String closed_by_store) {
		this.closed_by_store = closed_by_store;
	}
	public String getClosed_by_terminal() {
		return closed_by_terminal;
	}
	public void setClosed_by_terminal(String closed_by_terminal) {
		this.closed_by_terminal = closed_by_terminal;
	}
	public String getClosed_date() {
		return closed_date;
	}
	public void setClosed_date(String closed_date) {
		this.closed_date = closed_date;
	}
	public String getClosed_by_user() {
		return closed_by_user;
	}
	public void setClosed_by_user(String closed_by_user) {
		this.closed_by_user = closed_by_user;
	}
	public String getClosed_by_entry_no() {
		return closed_by_entry_no;
	}
	public void setClosed_by_entry_no(String closed_by_entry_no) {
		this.closed_by_entry_no = closed_by_entry_no;
	}
	public String getDiscount_type() {
		return discount_type;
	}
	public void setDiscount_type(String discount_type) {
		this.discount_type = discount_type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue_type() {
		return value_type;
	}
	public void setValue_type(String value_type) {
		this.value_type = value_type;
	}
	public String getG_l_status() {
		return g_l_status;
	}
	public void setG_l_status(String g_l_status) {
		this.g_l_status = g_l_status;
	}
	public String getG_l_amount() {
		return g_l_amount;
	}
	public void setG_l_amount(String g_l_amount) {
		this.g_l_amount = g_l_amount;
	}
	public String getCoupon_function() {
		return coupon_function;
	}
	public void setCoupon_function(String coupon_function) {
		this.coupon_function = coupon_function;
	}
	public String getFbp_ledger_entry_no() {
		return fbp_ledger_entry_no;
	}
	public void setFbp_ledger_entry_no(String fbp_ledger_entry_no) {
		this.fbp_ledger_entry_no = fbp_ledger_entry_no;
	}
	public String getMember_account_no() {
		return member_account_no;
	}
	public void setMember_account_no(String member_account_no) {
		this.member_account_no = member_account_no;
	}
	public couponentries(int id, String created_at, String updated_at, String store_no, String pos_terminal_no,
			String transaction_no, String coupon_code, String line_no, String coupon_reference_no, String coupon_no,
			String barcode, String issued_by_store, String issued_by_pos_terminal, String issue_date,
			String issued_by_user, String reserved_by_pos_terminal_no, String date_reserved_on_pos,
			String first_valid_date, String last_valid_date, String status, String sequence_no, String closed_by_store,
			String closed_by_terminal, String closed_date, String closed_by_user, String closed_by_entry_no,
			String discount_type, String value, String value_type, String g_l_status, String g_l_amount,
			String coupon_function, String fbp_ledger_entry_no, String member_account_no) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.store_no = store_no;
		this.pos_terminal_no = pos_terminal_no;
		this.transaction_no = transaction_no;
		this.coupon_code = coupon_code;
		this.line_no = line_no;
		this.coupon_reference_no = coupon_reference_no;
		this.coupon_no = coupon_no;
		this.barcode = barcode;
		this.issued_by_store = issued_by_store;
		this.issued_by_pos_terminal = issued_by_pos_terminal;
		this.issue_date = issue_date;
		this.issued_by_user = issued_by_user;
		this.reserved_by_pos_terminal_no = reserved_by_pos_terminal_no;
		this.date_reserved_on_pos = date_reserved_on_pos;
		this.first_valid_date = first_valid_date;
		this.last_valid_date = last_valid_date;
		this.status = status;
		this.sequence_no = sequence_no;
		this.closed_by_store = closed_by_store;
		this.closed_by_terminal = closed_by_terminal;
		this.closed_date = closed_date;
		this.closed_by_user = closed_by_user;
		this.closed_by_entry_no = closed_by_entry_no;
		this.discount_type = discount_type;
		this.value = value;
		this.value_type = value_type;
		this.g_l_status = g_l_status;
		this.g_l_amount = g_l_amount;
		this.coupon_function = coupon_function;
		this.fbp_ledger_entry_no = fbp_ledger_entry_no;
		this.member_account_no = member_account_no;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="StoreNo")
	String store_no;
	
	@Column(name="posTerminalNo")
	String pos_terminal_no;
	
	@Column(name="TransactionNO")
	String transaction_no;
	
	@Column(name="CouponCode")
	String coupon_code;
	
	@Column(name="LineNo")
	String line_no;
	
	@Column(name="CouponReferenceNo")
	String coupon_reference_no;
	
	@Column(name="CouponNo")
	String coupon_no;
	
	@Column(name="barCode")
	String barcode;
	
	@Column(name="issuedByStore")
	String issued_by_store;
	
	@Column(name="IssuedByPosTerminal")
	String issued_by_pos_terminal;
	
	@Column(name="IssueDate")
	String issue_date;
	
	@Column(name="issuedByUser")
	String issued_by_user;
	
	@Column(name="ReservedByPosTerminalNO")
	String reserved_by_pos_terminal_no;
	@Column(name="DateReservedOnPos")
	String date_reserved_on_pos;
	
	@Column(name="firstvalidDate")
	String first_valid_date;
	
	@Column(name="LastValidDate")
	String last_valid_date;
	
	@Column(name="Status")
	String status;
	
	@Column(name="SequenceNo")
	String sequence_no;
	
	@Column(name="ClosedByStore")
	String closed_by_store;
	
	@Column(name="ClosedByTerminal")
	String closed_by_terminal;
	
	@Column(name="ClosedBydate")
	String closed_date;
	
	@Column(name="ClosedByuser")
	String closed_by_user;
	
	@Column(name="ClosedByEntryNO")
	String closed_by_entry_no;
	
	@Column(name="DiscountType")
	String discount_type;
	
	@Column(name="Value")
	String value;
	
	@Column(name="valueType")
	String value_type;
	
	@Column(name="g1Status")
	String g_l_status;
	
	@Column(name="g1 Amount")
	String g_l_amount;
	
	@Column(name="CouponFunction")
	String coupon_function;
	
	@Column(name="FbpledgerEntryNo")
	String fbp_ledger_entry_no;
	
	@Column(name="memberAcountNo")
	String member_account_no;
	
	
public couponentries() {}
}
