package pojo;

public class Branch {

    @Override
	public String toString() {
		return "Branch [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", no=" + no
				+ ", name=" + name + ", address=" + address + ", address2=" + address2 + ", city=" + city
				+ ", postcode=" + postcode + ", storemanager_id=" + storemanager_id + ", storemanager_name="
				+ storemanager_name + ", phone_no=" + phone_no + ", country_code=" + country_code + ", email=" + email
				+ ", currency_code=" + currency_code + ", profile_code=" + profile_code + ", getId()=" + getId()
				+ ", getCreated_at()=" + getCreated_at() + ", getUpdated_at()=" + getUpdated_at() + ", getNo()="
				+ getNo() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAddress2()="
				+ getAddress2() + ", getCity()=" + getCity() + ", getPostcode()=" + getPostcode()
				+ ", getStoremanager_id()=" + getStoremanager_id() + ", getStoremanager_name()="
				+ getStoremanager_name() + ", getPhone_no()=" + getPhone_no() + ", getCountry_code()="
				+ getCountry_code() + ", getEmail()=" + getEmail() + ", getCurrency_code()=" + getCurrency_code()
				+ ", getProfile_code()=" + getProfile_code() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
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
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getStoremanager_id() {
		return storemanager_id;
	}
	public void setStoremanager_id(String storemanager_id) {
		this.storemanager_id = storemanager_id;
	}
	public String getStoremanager_name() {
		return storemanager_name;
	}
	public void setStoremanager_name(String storemanager_name) {
		this.storemanager_name = storemanager_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getProfile_code() {
		return profile_code;
	}
	public void setProfile_code(String profile_code) {
		this.profile_code = profile_code;
	}
		public Branch(int id, String created_at, String updated_at, String no, String name, String address, String address2,
			String city, String postcode, String storemanager_id, String storemanager_name, String phone_no,
			String country_code, String email, String currency_code, String profile_code) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.no = no;
		this.name = name;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.postcode = postcode;
		this.storemanager_id = storemanager_id;
		this.storemanager_name = storemanager_name;
		this.phone_no = phone_no;
		this.country_code = country_code;
		this.email = email;
		this.currency_code = currency_code;
		this.profile_code = profile_code;
	}
		int id;
	     String created_at;
	     String updated_at;
	     String no;
	     String name;
	     String address;
	     String address2;
	     String city;
	     String postcode;
	     String storemanager_id;
	     String storemanager_name;
	     String phone_no;
	    String country_code;
	    String email;
	    String currency_code;
	    String profile_code;
	
	    public Branch() {}
}
