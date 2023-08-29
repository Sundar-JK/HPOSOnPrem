package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers_table")
public class customerss {

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
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCredit_customer() {
		return credit_customer;
	}
	public void setCredit_customer(String credit_customer) {
		this.credit_customer = credit_customer;
	}
	public String getVat_registraion_no() {
		return vat_registraion_no;
	}
	public void setVat_registraion_no(String vat_registraion_no) {
		this.vat_registraion_no = vat_registraion_no;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAlt_mobile_no() {
		return alt_mobile_no;
	}
	public void setAlt_mobile_no(String alt_mobile_no) {
		this.alt_mobile_no = alt_mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public customerss(int id, String created_at, String updated_at, String customer_id, String company_code, String no,
			String first_name, String last_name, String salutation, String nationality, String country_code,
			String credit_customer, String vat_registraion_no, String mobile_no, String alt_mobile_no, String email,
			String status, String created_by, String created_date, String updated_by, String updated_date) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer_id = customer_id;
		this.company_code = company_code;
		this.no = no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salutation = salutation;
		this.nationality = nationality;
		this.country_code = country_code;
		this.credit_customer = credit_customer;
		this.vat_registraion_no = vat_registraion_no;
		this.mobile_no = mobile_no;
		this.alt_mobile_no = alt_mobile_no;
		this.email = email;
		this.status = status;
		this.created_by = created_by;
		this.created_date = created_date;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="updatedAt")
	String updated_at;
	
	@Column(name="customerId")
	String customer_id;
	
	@Column(name="companyCode")
	String company_code;
	
	@Column(name="no")
	String no;
	
	@Column(name="firstName")
	String first_name;
	
	@Column(name="lastName")
	String last_name;
	
	@Column(name="salutation")
	String salutation;
	
	@Column(name="nationality")
	String nationality;
	
	@Column(name="countryCodes")
	String country_code;
	
	@Column(name="creditCustomer")
	String credit_customer;
	
	@Column(name="vatRegistrationNo")
	String vat_registraion_no;
	
	@Column(name="mobileNo")
	String mobile_no;
	
	@Column(name="AltMobileNo")
	String alt_mobile_no;
	
	@Column(name="Email")
	String email;
	
	@Column(name="Status")
	String status;
	
	@Column(name="createdBy")
	String created_by;
	
	@Column(name="createdDate")
	String created_date;
	
	@Column(name="updatedBy")
	String updated_by;
	
	@Column(name="updatedDate")
	String updated_date;
	
public customerss() {}	
}
