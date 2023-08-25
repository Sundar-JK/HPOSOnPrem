package Com;

public class costing_methods {
	
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
	public String getCosting_label() {
		return costing_label;
	}
	public void setCosting_label(String costing_label) {
		this.costing_label = costing_label;
	}
	public String getCosting_code() {
		return costing_code;
	}
	public void setCosting_code(String costing_code) {
		this.costing_code = costing_code;
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
	public costing_methods(int id, String created_at, String updated_at, String costing_label, String costing_code,
			String extra, String is_active) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.costing_label = costing_label;
		this.costing_code = costing_code;
		this.extra = extra;
		this.is_active = is_active;
	}
	int id;
	String created_at;
	String updated_at;
	String costing_label;
	String costing_code;
	String extra;
	String is_active;
	
	public costing_methods() {}
}
