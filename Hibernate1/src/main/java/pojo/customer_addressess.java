package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_addresses")
public class customer_addressess {

	
	@Override
	public String toString() {
		return "customer_addressess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", lable=" + lable + ", customer_id=" + customer_id + ", country=" + country + ", first_name="
				+ first_name + ", last_name=" + last_name + ", email_id=" + email_id + ", company=" + company
				+ ", phone=" + phone + ", address_line_1=" + address_line_1 + ", address_line_2=" + address_line_2
				+ ", address_line_3=" + address_line_3 + ", city=" + city + ", postal_or_zip_code=" + postal_or_zip_code
				+ ", getId()=" + getId() + ", getCreated_at()=" + getCreated_at() + ", getUpdated_at()="
				+ getUpdated_at() + ", getLable()=" + getLable() + ", getCustomer_id()=" + getCustomer_id()
				+ ", getCountry()=" + getCountry() + ", getFirst_name()=" + getFirst_name() + ", getLast_name()="
				+ getLast_name() + ", getEmail_id()=" + getEmail_id() + ", getCompany()=" + getCompany()
				+ ", getPhone()=" + getPhone() + ", getAddress_line_1()=" + getAddress_line_1()
				+ ", getAddress_line_2()=" + getAddress_line_2() + ", getAddress_line_3()=" + getAddress_line_3()
				+ ", getCity()=" + getCity() + ", getPostal_or_zip_code()=" + getPostal_or_zip_code() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getAddress_line_3() {
		return address_line_3;
	}
	public void setAddress_line_3(String address_line_3) {
		this.address_line_3 = address_line_3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal_or_zip_code() {
		return postal_or_zip_code;
	}
	public void setPostal_or_zip_code(String postal_or_zip_code) {
		this.postal_or_zip_code = postal_or_zip_code;
	}
	
	public customer_addressess(int id, String created_at, String updated_at, String lable, String customer_id,
			String country, String first_name, String last_name, String email_id, String company, String phone,
			String address_line_1, String address_line_2, String address_line_3, String city,
			String postal_or_zip_code) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.lable = lable;
		this.customer_id = customer_id;
		this.country = country;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.company = company;
		this.phone = phone;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.address_line_3 = address_line_3;
		this.city = city;
		this.postal_or_zip_code = postal_or_zip_code;
	}

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="created_at")
	String created_at;
	
	@Column(name="updated_at")
	String updated_at;
	
	@Column(name="lable")
	String lable;
	
	@Column(name="customer_id")
	String customer_id;
	
	@Column(name="country")
	String country;
	
	@Column(name="first_name")
	String first_name;
	
	@Column(name="last_name")
	String last_name;
	@Column(name="email_id")
	String email_id;
	
	@Column(name="company")
	String company;
	
	@Column(name="phone")
	String phone;
	
	@Column(name="address_line_1")
	String address_line_1;
	
	@Column(name="address_line_2")
	String address_line_2;
	
	@Column(name="address_line_3")
	String address_line_3;
	
	@Column(name="city")
	String city;
	
	@Column(name="postal_or_zip_code")
	String postal_or_zip_code;

public customer_addressess() {}
	
}
