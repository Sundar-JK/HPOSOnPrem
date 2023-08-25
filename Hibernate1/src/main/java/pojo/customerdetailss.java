package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class customerdetailss {

	@Override
	public String toString() {
		return "customerdetailss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", customer_code=" + customer_code + ", phone_1=" + phone_1 + ", phone_2=" + phone_2 + ", bank_name="
				+ bank_name + ", account_number=" + account_number + ", iban=" + iban + ", sd_account_number="
				+ sd_account_number + ", swift_code=" + swift_code + ", vat_registration_number="
				+ vat_registration_number + ", primary_contact_name=" + primary_contact_name
				+ ", primary_contact_number=" + primary_contact_number + ", primary_contact_email="
				+ primary_contact_email + ", currency_code=" + currency_code + ", is_active=" + is_active
				+ ", address_id=" + address_id + ", created_by=" + created_by + ", updated_by=" + updated_by
				+ ", decimal_precision=" + decimal_precision + "]";
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
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getPhone_1() {
		return phone_1;
	}
	public void setPhone_1(String phone_1) {
		this.phone_1 = phone_1;
	}
	public String getPhone_2() {
		return phone_2;
	}
	public void setPhone_2(String phone_2) {
		this.phone_2 = phone_2;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getSd_account_number() {
		return sd_account_number;
	}
	public void setSd_account_number(String sd_account_number) {
		this.sd_account_number = sd_account_number;
	}
	public String getSwift_code() {
		return swift_code;
	}
	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}
	public String getVat_registration_number() {
		return vat_registration_number;
	}
	public void setVat_registration_number(String vat_registration_number) {
		this.vat_registration_number = vat_registration_number;
	}
	public String getPrimary_contact_name() {
		return primary_contact_name;
	}
	public void setPrimary_contact_name(String primary_contact_name) {
		this.primary_contact_name = primary_contact_name;
	}
	public String getPrimary_contact_number() {
		return primary_contact_number;
	}
	public void setPrimary_contact_number(String primary_contact_number) {
		this.primary_contact_number = primary_contact_number;
	}
	public String getPrimary_contact_email() {
		return primary_contact_email;
	}
	public void setPrimary_contact_email(String primary_contact_email) {
		this.primary_contact_email = primary_contact_email;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getDecimal_precision() {
		return decimal_precision;
	}
	public void setDecimal_precision(String decimal_precision) {
		this.decimal_precision = decimal_precision;
	}
	
	public customerdetailss(int id, String created_at, String updated_at, String customer_code, String phone_1,
			String phone_2, String bank_name, String account_number, String iban, String sd_account_number,
			String swift_code, String vat_registration_number, String primary_contact_name,
			String primary_contact_number, String primary_contact_email, String currency_code, int is_active,
			int address_id, String created_by, String updated_by, String decimal_precision) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer_code = customer_code;
		this.phone_1 = phone_1;
		this.phone_2 = phone_2;
		this.bank_name = bank_name;
		this.account_number = account_number;
		this.iban = iban;
		this.sd_account_number = sd_account_number;
		this.swift_code = swift_code;
		this.vat_registration_number = vat_registration_number;
		this.primary_contact_name = primary_contact_name;
		this.primary_contact_number = primary_contact_number;
		this.primary_contact_email = primary_contact_email;
		this.currency_code = currency_code;
		this.is_active = is_active;
		this.address_id = address_id;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.decimal_precision = decimal_precision;
	}
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="customer_code")
	String customer_code;
	
	@Column(name="phone_1")
	String phone_1;
	
	@Column(name="phone_2")
	String phone_2;
	
	@Column(name="bank_name")
	String bank_name;
	
	@Column(name="account_number")
	String account_number;
	
	@Column(name="iban")
	String iban;
	
	@Column(name="sd_account_number")
	String sd_account_number;
	
	@Column(name="swift_code")
	String swift_code;
	
	@Column(name="vat_registration_number")
	String vat_registration_number;
	
	@Column(name="primary_contact_name")
	String primary_contact_name;
	
	@Column(name="primary_contact_number")
	String primary_contact_number;
	
	@Column(name="primary_contact_email")
	String primary_contact_email;
	
	@Column(name="currency_code")
	String currency_code;
	
	@Column(name="is_active")
	int is_active;
	
	@Column(name="address_id")
	int address_id;
	
	@Column(name="created_by")
	String created_by;
	
	@Column(name="updated_by")
	String updated_by;
	
	@Column(name="decimal_precision")
	String decimal_precision;

	
public customerdetailss() {
	
}


}
