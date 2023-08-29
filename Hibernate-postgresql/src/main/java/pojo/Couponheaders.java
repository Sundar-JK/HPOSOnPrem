package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Couponheaders_table")
public class Couponheaders {

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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCoupon_issuer() {
		return coupon_issuer;
	}
	public void setCoupon_issuer(String coupon_issuer) {
		this.coupon_issuer = coupon_issuer;
	}
	public String getCoupon_reference_no() {
		return coupon_reference_no;
	}
	public void setCoupon_reference_no(String coupon_reference_no) {
		this.coupon_reference_no = coupon_reference_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription_2() {
		return description_2;
	}
	public void setDescription_2(String description_2) {
		this.description_2 = description_2;
	}
	public String getPrice_group() {
		return price_group;
	}
	public void setPrice_group(String price_group) {
		this.price_group = price_group;
	}
	public String getDiscount_type() {
		return discount_type;
	}
	public void setDiscount_type(String discount_type) {
		this.discount_type = discount_type;
	}
	public String getValidation_period_id() {
		return validation_period_id;
	}
	public void setValidation_period_id(String validation_period_id) {
		this.validation_period_id = validation_period_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHandling() {
		return handling;
	}
	public void setHandling(String handling) {
		this.handling = handling;
	}
	public String getNo_of_items_to_trigger() {
		return no_of_items_to_trigger;
	}
	public void setNo_of_items_to_trigger(String no_of_items_to_trigger) {
		this.no_of_items_to_trigger = no_of_items_to_trigger;
	}
	public String getApply_to_no_of_items() {
		return apply_to_no_of_items;
	}
	public void setApply_to_no_of_items(String apply_to_no_of_items) {
		this.apply_to_no_of_items = apply_to_no_of_items;
	}
	public String getAffects() {
		return affects;
	}
	public void setAffects(String affects) {
		this.affects = affects;
	}
	public String getNo_series() {
		return no_series;
	}
	public void setNo_series(String no_series) {
		this.no_series = no_series;
	}
	public String getMultiply_value() {
		return multiply_value;
	}
	public void setMultiply_value(String multiply_value) {
		this.multiply_value = multiply_value;
	}
	public String getMultiply_value_period_id() {
		return multiply_value_period_id;
	}
	public void setMultiply_value_period_id(String multiply_value_period_id) {
		this.multiply_value_period_id = multiply_value_period_id;
	}
	public String getIssue_at_pos() {
		return issue_at_pos;
	}
	public void setIssue_at_pos(String issue_at_pos) {
		this.issue_at_pos = issue_at_pos;
	}
	public String getLoyalty_scheme() {
		return loyalty_scheme;
	}
	public void setLoyalty_scheme(String loyalty_scheme) {
		this.loyalty_scheme = loyalty_scheme;
	}
	public String getDiscount__of_total() {
		return discount__of_total;
	}
	public void setDiscount__of_total(String discount__of_total) {
		this.discount__of_total = discount__of_total;
	}
	public String getRounding_method() {
		return rounding_method;
	}
	public void setRounding_method(String rounding_method) {
		this.rounding_method = rounding_method;
	}
	public String getExtra_print_setup() {
		return extra_print_setup;
	}
	public void setExtra_print_setup(String extra_print_setup) {
		this.extra_print_setup = extra_print_setup;
	}
	public String getBarcode_mask() {
		return barcode_mask;
	}
	public void setBarcode_mask(String barcode_mask) {
		this.barcode_mask = barcode_mask;
	}
	public String getMember_type() {
		return member_type;
	}
	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}
	public String getMember_value() {
		return member_value;
	}
	public void setMember_value(String member_value) {
		this.member_value = member_value;
	}
	public String getFirst_valid_date_formula() {
		return first_valid_date_formula;
	}
	public void setFirst_valid_date_formula(String first_valid_date_formula) {
		this.first_valid_date_formula = first_valid_date_formula;
	}
	public String getLast_valid_date_formula() {
		return last_valid_date_formula;
	}
	public void setLast_valid_date_formula(String last_valid_date_formula) {
		this.last_valid_date_formula = last_valid_date_formula;
	}
	public String getBarcode_element_1() {
		return barcode_element_1;
	}
	public void setBarcode_element_1(String barcode_element_1) {
		this.barcode_element_1 = barcode_element_1;
	}
	public String getBarcode_element_2() {
		return barcode_element_2;
	}
	public void setBarcode_element_2(String barcode_element_2) {
		this.barcode_element_2 = barcode_element_2;
	}
	public String getBarcode_element_3() {
		return barcode_element_3;
	}
	public void setBarcode_element_3(String barcode_element_3) {
		this.barcode_element_3 = barcode_element_3;
	}
	public String getBarcode_element_4() {
		return barcode_element_4;
	}
	public void setBarcode_element_4(String barcode_element_4) {
		this.barcode_element_4 = barcode_element_4;
	}
	public String getBarcode_element_5() {
		return barcode_element_5;
	}
	public void setBarcode_element_5(String barcode_element_5) {
		this.barcode_element_5 = barcode_element_5;
	}
	public String getBarcode_element_6() {
		return barcode_element_6;
	}
	public void setBarcode_element_6(String barcode_element_6) {
		this.barcode_element_6 = barcode_element_6;
	}
	public String getBarcode_element_7() {
		return barcode_element_7;
	}
	public void setBarcode_element_7(String barcode_element_7) {
		this.barcode_element_7 = barcode_element_7;
	}
	public String getBarcode_element_8() {
		return barcode_element_8;
	}
	public void setBarcode_element_8(String barcode_element_8) {
		this.barcode_element_8 = barcode_element_8;
	}
	public String getCalculation_type() {
		return calculation_type;
	}
	public void setCalculation_type(String calculation_type) {
		this.calculation_type = calculation_type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getEntry_validation() {
		return entry_validation;
	}
	public void setEntry_validation(String entry_validation) {
		this.entry_validation = entry_validation;
	}
	public String getPosting_type() {
		return posting_type;
	}
	public void setPosting_type(String posting_type) {
		this.posting_type = posting_type;
	}
	public String getPosting_account() {
		return posting_account;
	}
	public void setPosting_account(String posting_account) {
		this.posting_account = posting_account;
	}
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getBuyer_group_code() {
		return buyer_group_code;
	}
	public void setBuyer_group_code(String buyer_group_code) {
		this.buyer_group_code = buyer_group_code;
	}
	public String getOffline_process() {
		return offline_process;
	}
	public void setOffline_process(String offline_process) {
		this.offline_process = offline_process;
	}
	public String getCoupon_id_method() {
		return coupon_id_method;
	}
	public void setCoupon_id_method(String coupon_id_method) {
		this.coupon_id_method = coupon_id_method;
	}
	public String getMax_per_member() {
		return max_per_member;
	}
	public void setMax_per_member(String max_per_member) {
		this.max_per_member = max_per_member;
	}
	public String getMinimum_trans_amount() {
		return minimum_trans_amount;
	}
	public void setMinimum_trans_amount(String minimum_trans_amount) {
		this.minimum_trans_amount = minimum_trans_amount;
	}
	public String getMaximum_trans_amount() {
		return maximum_trans_amount;
	}
	public void setMaximum_trans_amount(String maximum_trans_amount) {
		this.maximum_trans_amount = maximum_trans_amount;
	}
	
	
	public Couponheaders(int id, String created_at, String updated_at, String code, String coupon_issuer,
			String coupon_reference_no, String description, String description_2, String price_group,
			String discount_type, String validation_period_id, String status, String type, String handling,
			String no_of_items_to_trigger, String apply_to_no_of_items, String affects, String no_series,
			String multiply_value, String multiply_value_period_id, String issue_at_pos, String loyalty_scheme,
			String discount__of_total, String rounding_method, String extra_print_setup, String barcode_mask,
			String member_type, String member_value, String first_valid_date_formula, String last_valid_date_formula,
			String barcode_element_1, String barcode_element_2, String barcode_element_3, String barcode_element_4,
			String barcode_element_5, String barcode_element_6, String barcode_element_7, String barcode_element_8,
			String calculation_type, String value, String entry_validation, String posting_type, String posting_account,
			String buyer_id, String buyer_group_code, String offline_process, String coupon_id_method,
			String max_per_member, String minimum_trans_amount, String maximum_trans_amount) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.code = code;
		this.coupon_issuer = coupon_issuer;
		this.coupon_reference_no = coupon_reference_no;
		this.description = description;
		this.description_2 = description_2;
		this.price_group = price_group;
		this.discount_type = discount_type;
		this.validation_period_id = validation_period_id;
		this.status = status;
		this.type = type;
		this.handling = handling;
		this.no_of_items_to_trigger = no_of_items_to_trigger;
		this.apply_to_no_of_items = apply_to_no_of_items;
		this.affects = affects;
		this.no_series = no_series;
		this.multiply_value = multiply_value;
		this.multiply_value_period_id = multiply_value_period_id;
		this.issue_at_pos = issue_at_pos;
		this.loyalty_scheme = loyalty_scheme;
		this.discount__of_total = discount__of_total;
		this.rounding_method = rounding_method;
		this.extra_print_setup = extra_print_setup;
		this.barcode_mask = barcode_mask;
		this.member_type = member_type;
		this.member_value = member_value;
		this.first_valid_date_formula = first_valid_date_formula;
		this.last_valid_date_formula = last_valid_date_formula;
		this.barcode_element_1 = barcode_element_1;
		this.barcode_element_2 = barcode_element_2;
		this.barcode_element_3 = barcode_element_3;
		this.barcode_element_4 = barcode_element_4;
		this.barcode_element_5 = barcode_element_5;
		this.barcode_element_6 = barcode_element_6;
		this.barcode_element_7 = barcode_element_7;
		this.barcode_element_8 = barcode_element_8;
		this.calculation_type = calculation_type;
		this.value = value;
		this.entry_validation = entry_validation;
		this.posting_type = posting_type;
		this.posting_account = posting_account;
		this.buyer_id = buyer_id;
		this.buyer_group_code = buyer_group_code;
		this.offline_process = offline_process;
		this.coupon_id_method = coupon_id_method;
		this.max_per_member = max_per_member;
		this.minimum_trans_amount = minimum_trans_amount;
		this.maximum_trans_amount = maximum_trans_amount;
	}


	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="Code")
	String code;
	
	@Column(name="CouponIssuer")
	String coupon_issuer;
	
	@Column(name="CouponReferenceNo")
	String coupon_reference_no;
	
	@Column(name="Description")
	String description;
	
	@Column(name="Description2")
	String description_2;
	
	@Column(name="Pricegroup")
	String price_group;
	
	@Column(name="DiscountType")
	String discount_type;
	
	@Column(name="ValidationPeriodId")
	String validation_period_id;
	
	@Column(name="Status")
	String status;
	
	@Column(name="Type")
	String type;
	
	@Column(name="Handling")
	String handling;
	
	@Column(name="NoOfItemsToTrigger")
	String no_of_items_to_trigger;
	
	@Column(name="ApplyToNoOFItems")
	String apply_to_no_of_items;
	
	@Column(name="Affects")
	String affects;
	
	@Column(name="NoSeries")
	String no_series;
	
	@Column(name="MultiolyValue")
	String multiply_value;
	
	@Column(name="MultiplyValuePeroidId")
	String multiply_value_period_id;
	
	@Column(name="issuesAtPos")
	String issue_at_pos;
	
	@Column(name="LoyalityScheme")
	String loyalty_scheme;
	
	@Column(name="DiscountOfTotal")
	String discount__of_total;
	
	@Column(name="RoundingMethod")
	String rounding_method;
	
	@Column(name="ExtraPrintSetup")
	String extra_print_setup;
	
	@Column(name="barcodeMask")
	String barcode_mask;
	
	@Column(name="MemeberType")
	String member_type;
	
	@Column(name="MemberValue")
	String member_value;
	
	@Column(name="FirstValidDateFormula")
	String first_valid_date_formula;
	
	@Column(name="LastValidDateFormula")
	String last_valid_date_formula;
	
	@Column(name="BarcodeElement1")
	String barcode_element_1;
	
	@Column(name="BarcodeElement2")
	String barcode_element_2;
	
	@Column(name="BarcodeElement3")
	String barcode_element_3;
	
	@Column(name="BarcodeElement4")
	String barcode_element_4;
	
	@Column(name="BarcodeElement5")
	String barcode_element_5;
	
	@Column(name="BarcodeElement6")
	String barcode_element_6;
	
	@Column(name="BarcodeElement7")
	String barcode_element_7;
	
	@Column(name="BarcodeElement8")
	String barcode_element_8;
	
	@Column(name="CalculationType")
	String calculation_type;
	
	@Column(name="Value")
	String value;
	
	@Column(name="EntryValidation")
	String entry_validation;
	
	@Column(name="PostingType")
	String posting_type;
	
	@Column(name="PostingAccount")
	String posting_account;
	
	@Column(name="BuyerId")
	String buyer_id;
	
	@Column(name="BuyerGroupCode")
	String buyer_group_code;
	
	@Column(name="offlineProcess")
	String offline_process;
	
	@Column(name="CouponIdMethod")
	String coupon_id_method;
	
	@Column(name="MaxPerMember")
	String max_per_member;
	
	@Column(name="MinimunTransAmount")
	String minimum_trans_amount;
	
	@Column(name="MaximumTransAmount")
	String maximum_trans_amount;
	
	
	public Couponheaders() {}
}
