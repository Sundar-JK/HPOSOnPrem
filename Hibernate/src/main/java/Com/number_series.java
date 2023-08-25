package Com;

public class number_series {
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
	public String getNumber_label() {
		return number_label;
	}
	public void setNumber_label(String number_label) {
		this.number_label = number_label;
	}
	public String getNumber_code() {
		return number_code;
	}
	public void setNumber_code(String number_code) {
		this.number_code = number_code;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public number_series(int id, String created_at, String updated_at, String number_label, String number_code,
			String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.number_label = number_label;
		this.number_code = number_code;
		this.extra = extra;
		this.is_active = is_active;
	}
	int id;
	String created_at;
	String updated_at;
	String number_label;
	String number_code;
	String extra;
	String is_active;
	
	public number_series() {}
	
}
