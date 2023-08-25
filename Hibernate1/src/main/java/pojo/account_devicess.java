package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_devices")
public class account_devicess {

	@Override
	public String toString() {
		return "account_devicess [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", model="
				+ model + ", platform=" + platform + ", uuid=" + uuid + ", version=" + version + ", manufacturer="
				+ manufacturer + ", isVirtual=" + isVirtual + ", serial=" + serial + ", sdkVersion=" + sdkVersion
				+ ", appbundle=" + appbundle + ", isactive=" + isactive + ", device_token=" + device_token
				+ ", tenant_id=" + tenant_id + ", customer_id=" + customer_id + ", device_image=" + device_image
				+ ", push_id=" + push_id + ", user_id=" + user_id + ", token=" + token + "]";
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(String isVirtual) {
		this.isVirtual = isVirtual;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getSdkVersion() {
		return sdkVersion;
	}
	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}
	public String getAppbundle() {
		return appbundle;
	}
	public void setAppbundle(String appbundle) {
		this.appbundle = appbundle;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getDevice_token() {
		return device_token;
	}
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}
	public String getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getDevice_image() {
		return device_image;
	}
	public void setDevice_image(String device_image) {
		this.device_image = device_image;
	}
	public String getPush_id() {
		return push_id;
	}
	public void setPush_id(String push_id) {
		this.push_id = push_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public account_devicess(int id, String created_at, String updated_at, String model, String platform, String uuid,
			String version, String manufacturer, String isVirtual, String serial, String sdkVersion, String appbundle,
			String isactive, String device_token, String tenant_id, String customer_id, String device_image,
			String push_id, String user_id, String token) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.model = model;
		this.platform = platform;
		this.uuid = uuid;
		this.version = version;
		this.manufacturer = manufacturer;
		this.isVirtual = isVirtual;
		this.serial = serial;
		this.sdkVersion = sdkVersion;
		this.appbundle = appbundle;
		this.isactive = isactive;
		this.device_token = device_token;
		this.tenant_id = tenant_id;
		this.customer_id = customer_id;
		this.device_image = device_image;
		this.push_id = push_id;
		this.user_id = user_id;
		this.token = token;
	}
    @Id
    @Column(name="id")
	int id;
    
    @Column(name="created_at")
	String created_at;
    
    @Column(name="updated_at")
	String updated_at;
    
    @Column(name="model")
	String model;
    
    @Column(name="platform")
	String platform;
    
    @Column(name="uuid")
	String uuid;
    @Column(name="version")
	String version;
    
    @Column(name="manufacturer")
	String manufacturer;
    
    @Column(name="isVirtual")
	String isVirtual;
    
    @Column(name="serial")
	String serial;
    
    @Column(name="sdkVersion")
	String sdkVersion;
    
    @Column(name="appbundle")
	String appbundle;
    
    @Column(name="isactive")
	String isactive;
    
    @Column(name="device_token")
	String device_token;
    
    @Column(name="tenant_id")
	String tenant_id;
    
    @Column(name="customer_id")
	String customer_id;
    
    @Column(name="device_image")
	String device_image;
    
    @Column(name="push_id")
	String push_id;
    
    @Column(name="user_id")
	String user_id;
    
    @Column(name="token")
	String token;
	
public account_devicess() {}	


}
