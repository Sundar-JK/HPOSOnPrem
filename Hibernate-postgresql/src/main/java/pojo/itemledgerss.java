package pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemledgers_table")
public class itemledgerss {

	@Override
	public String toString() {
		return "itemledgerss [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", entry_no="
				+ entry_no + ", item_no=" + item_no + ", posting_date=" + posting_date + ", entry_type=" + entry_type
				+ ", source_no=" + source_no + ", document_no=" + document_no + ", description=" + description
				+ ", location_code=" + location_code + ", quantity=" + quantity + ", remaining_quantity="
				+ remaining_quantity + ", invoiced_quantity=" + invoiced_quantity + ", applies_to_entry="
				+ applies_to_entry + ", open=" + open + ", global_dimension_1_code=" + global_dimension_1_code
				+ ", global_dimension_2_code=" + global_dimension_2_code + ", positive=" + positive + ", source_type="
				+ source_type + ", drop_shipment=" + drop_shipment + ", transaction_type=" + transaction_type
				+ ", transport_method=" + transport_method + ", country_region_code=" + country_region_code
				+ ", entry_exit_point=" + entry_exit_point + ", document_date=" + document_date
				+ ", external_document_no=" + external_document_no + ", area=" + area + ", transaction_specification="
				+ transaction_specification + ", no_series=" + no_series + ", reserved_quantity=" + reserved_quantity
				+ ", document_type=" + document_type + ", document_line_no=" + document_line_no + ", job_no=" + job_no
				+ ", job_task_no=" + job_task_no + ", job_purchase=" + job_purchase + ", prod_order_no=" + prod_order_no
				+ ", variant_code=" + variant_code + ", qty_per_unit_of_measure=" + qty_per_unit_of_measure
				+ ", unit_of_measure_code=" + unit_of_measure_code + ", derived_from_blanket_order="
				+ derived_from_blanket_order + ", cross_reference_no=" + cross_reference_no + ", originally_ordered_no="
				+ originally_ordered_no + ", originally_ordered_var_code=" + originally_ordered_var_code
				+ ", out_of_stock_substitution=" + out_of_stock_substitution + ", item_category_code="
				+ item_category_code + ", nonstock=" + nonstock + ", purchasing_code=" + purchasing_code
				+ ", product_group_code=" + product_group_code + ", transfer_order_no=" + transfer_order_no
				+ ", completely_invoiced=" + completely_invoiced + ", last_invoice_date=" + last_invoice_date
				+ ", applied_entry_to_adjust=" + applied_entry_to_adjust + ", cost_amount_expected="
				+ cost_amount_expected + ", cost_amount_actual=" + cost_amount_actual + ", cost_amount_non_invtbl="
				+ cost_amount_non_invtbl + ", cost_amount_expected_acy=" + cost_amount_expected_acy
				+ ", cost_amount_actual_acy=" + cost_amount_actual_acy + ", cost_amount_non_invtbl_acy="
				+ cost_amount_non_invtbl_acy + ", purchase_amount_expected=" + purchase_amount_expected
				+ ", purchase_amount_actual=" + purchase_amount_actual + ", sales_amount_expected="
				+ sales_amount_expected + ", sales_amount_actual=" + sales_amount_actual + ", correction=" + correction
				+ ", shipped_qty_not_returned=" + shipped_qty_not_returned + ", prod_order_line_no="
				+ prod_order_line_no + ", prod_order_comp_line_no=" + prod_order_comp_line_no + ", service_order_no="
				+ service_order_no + ", serial_no=" + serial_no + ", lot_no=" + lot_no + ", warranty_date="
				+ warranty_date + ", expiration_date=" + expiration_date + ", item_tracking=" + item_tracking
				+ ", return_reason_code=" + return_reason_code + ", offer_no=" + offer_no + ", batch_no=" + batch_no
				+ ", unit_retail_value=" + unit_retail_value + ", transfer_type=" + transfer_type + ", statement_no="
				+ statement_no + ", getId()=" + getId() + ", getCreated_at()=" + getCreated_at() + ", getUpdated_at()="
				+ getUpdated_at() + ", getEntry_no()=" + getEntry_no() + ", getItem_no()=" + getItem_no()
				+ ", getPosting_date()=" + getPosting_date() + ", getEntry_type()=" + getEntry_type()
				+ ", getSource_no()=" + getSource_no() + ", getDocument_no()=" + getDocument_no()
				+ ", getDescription()=" + getDescription() + ", getLocation_code()=" + getLocation_code()
				+ ", getQuantity()=" + getQuantity() + ", getRemaining_quantity()=" + getRemaining_quantity()
				+ ", getInvoiced_quantity()=" + getInvoiced_quantity() + ", getApplies_to_entry()="
				+ getApplies_to_entry() + ", getOpen()=" + getOpen() + ", getGlobal_dimension_1_code()="
				+ getGlobal_dimension_1_code() + ", getGlobal_dimension_2_code()=" + getGlobal_dimension_2_code()
				+ ", getPositive()=" + getPositive() + ", getSource_type()=" + getSource_type()
				+ ", getDrop_shipment()=" + getDrop_shipment() + ", getTransaction_type()=" + getTransaction_type()
				+ ", getTransport_method()=" + getTransport_method() + ", getCountry_region_code()="
				+ getCountry_region_code() + ", getEntry_exit_point()=" + getEntry_exit_point()
				+ ", getDocument_date()=" + getDocument_date() + ", getExternal_document_no()="
				+ getExternal_document_no() + ", getArea()=" + getArea() + ", getTransaction_specification()="
				+ getTransaction_specification() + ", getNo_series()=" + getNo_series() + ", getReserved_quantity()="
				+ getReserved_quantity() + ", getDocument_type()=" + getDocument_type() + ", getDocument_line_no()="
				+ getDocument_line_no() + ", getJob_no()=" + getJob_no() + ", getJob_task_no()=" + getJob_task_no()
				+ ", getJob_purchase()=" + getJob_purchase() + ", getProd_order_no()=" + getProd_order_no()
				+ ", getVariant_code()=" + getVariant_code() + ", getQty_per_unit_of_measure()="
				+ getQty_per_unit_of_measure() + ", getUnit_of_measure_code()=" + getUnit_of_measure_code()
				+ ", getDerived_from_blanket_order()=" + getDerived_from_blanket_order() + ", getCross_reference_no()="
				+ getCross_reference_no() + ", getOriginally_ordered_no()=" + getOriginally_ordered_no()
				+ ", getOriginally_ordered_var_code()=" + getOriginally_ordered_var_code()
				+ ", getOut_of_stock_substitution()=" + getOut_of_stock_substitution() + ", getItem_category_code()="
				+ getItem_category_code() + ", getNonstock()=" + getNonstock() + ", getPurchasing_code()="
				+ getPurchasing_code() + ", getProduct_group_code()=" + getProduct_group_code()
				+ ", getTransfer_order_no()=" + getTransfer_order_no() + ", getCompletely_invoiced()="
				+ getCompletely_invoiced() + ", getLast_invoice_date()=" + getLast_invoice_date()
				+ ", getApplied_entry_to_adjust()=" + getApplied_entry_to_adjust() + ", getCost_amount_expected()="
				+ getCost_amount_expected() + ", getCost_amount_actual()=" + getCost_amount_actual()
				+ ", getCost_amount_non_invtbl()=" + getCost_amount_non_invtbl() + ", getCost_amount_expected_acy()="
				+ getCost_amount_expected_acy() + ", getCost_amount_actual_acy()=" + getCost_amount_actual_acy()
				+ ", getCost_amount_non_invtbl_acy()=" + getCost_amount_non_invtbl_acy()
				+ ", getPurchase_amount_expected()=" + getPurchase_amount_expected() + ", getPurchase_amount_actual()="
				+ getPurchase_amount_actual() + ", getSales_amount_expected()=" + getSales_amount_expected()
				+ ", getSales_amount_actual()=" + getSales_amount_actual() + ", getCorrection()=" + getCorrection()
				+ ", getShipped_qty_not_returned()=" + getShipped_qty_not_returned() + ", getProd_order_line_no()="
				+ getProd_order_line_no() + ", getProd_order_comp_line_no()=" + getProd_order_comp_line_no()
				+ ", getService_order_no()=" + getService_order_no() + ", getSerial_no()=" + getSerial_no()
				+ ", getLot_no()=" + getLot_no() + ", getWarranty_date()=" + getWarranty_date()
				+ ", getExpiration_date()=" + getExpiration_date() + ", getItem_tracking()=" + getItem_tracking()
				+ ", getReturn_reason_code()=" + getReturn_reason_code() + ", getOffer_no()=" + getOffer_no()
				+ ", getBatch_no()=" + getBatch_no() + ", getUnit_retail_value()=" + getUnit_retail_value()
				+ ", getTransfer_type()=" + getTransfer_type() + ", getStatement_no()=" + getStatement_no()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public String getEntry_no() {
		return entry_no;
	}
	public void setEntry_no(String entry_no) {
		this.entry_no = entry_no;
	}
	public String getItem_no() {
		return item_no;
	}
	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}
	public String getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	public String getEntry_type() {
		return entry_type;
	}
	public void setEntry_type(String entry_type) {
		this.entry_type = entry_type;
	}
	public String getSource_no() {
		return source_no;
	}
	public void setSource_no(String source_no) {
		this.source_no = source_no;
	}
	public String getDocument_no() {
		return document_no;
	}
	public void setDocument_no(String document_no) {
		this.document_no = document_no;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation_code() {
		return location_code;
	}
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getRemaining_quantity() {
		return remaining_quantity;
	}
	public void setRemaining_quantity(String remaining_quantity) {
		this.remaining_quantity = remaining_quantity;
	}
	public String getInvoiced_quantity() {
		return invoiced_quantity;
	}
	public void setInvoiced_quantity(String invoiced_quantity) {
		this.invoiced_quantity = invoiced_quantity;
	}
	public String getApplies_to_entry() {
		return applies_to_entry;
	}
	public void setApplies_to_entry(String applies_to_entry) {
		this.applies_to_entry = applies_to_entry;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getGlobal_dimension_1_code() {
		return global_dimension_1_code;
	}
	public void setGlobal_dimension_1_code(String global_dimension_1_code) {
		this.global_dimension_1_code = global_dimension_1_code;
	}
	public String getGlobal_dimension_2_code() {
		return global_dimension_2_code;
	}
	public void setGlobal_dimension_2_code(String global_dimension_2_code) {
		this.global_dimension_2_code = global_dimension_2_code;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getDrop_shipment() {
		return drop_shipment;
	}
	public void setDrop_shipment(String drop_shipment) {
		this.drop_shipment = drop_shipment;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getTransport_method() {
		return transport_method;
	}
	public void setTransport_method(String transport_method) {
		this.transport_method = transport_method;
	}
	public String getCountry_region_code() {
		return country_region_code;
	}
	public void setCountry_region_code(String country_region_code) {
		this.country_region_code = country_region_code;
	}
	public String getEntry_exit_point() {
		return entry_exit_point;
	}
	public void setEntry_exit_point(String entry_exit_point) {
		this.entry_exit_point = entry_exit_point;
	}
	public String getDocument_date() {
		return document_date;
	}
	public void setDocument_date(String document_date) {
		this.document_date = document_date;
	}
	public String getExternal_document_no() {
		return external_document_no;
	}
	public void setExternal_document_no(String external_document_no) {
		this.external_document_no = external_document_no;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTransaction_specification() {
		return transaction_specification;
	}
	public void setTransaction_specification(String transaction_specification) {
		this.transaction_specification = transaction_specification;
	}
	public String getNo_series() {
		return no_series;
	}
	public void setNo_series(String no_series) {
		this.no_series = no_series;
	}
	public String getReserved_quantity() {
		return reserved_quantity;
	}
	public void setReserved_quantity(String reserved_quantity) {
		this.reserved_quantity = reserved_quantity;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	public String getDocument_line_no() {
		return document_line_no;
	}
	public void setDocument_line_no(String document_line_no) {
		this.document_line_no = document_line_no;
	}
	public String getJob_no() {
		return job_no;
	}
	public void setJob_no(String job_no) {
		this.job_no = job_no;
	}
	public String getJob_task_no() {
		return job_task_no;
	}
	public void setJob_task_no(String job_task_no) {
		this.job_task_no = job_task_no;
	}
	public String getJob_purchase() {
		return job_purchase;
	}
	public void setJob_purchase(String job_purchase) {
		this.job_purchase = job_purchase;
	}
	public String getProd_order_no() {
		return prod_order_no;
	}
	public void setProd_order_no(String prod_order_no) {
		this.prod_order_no = prod_order_no;
	}
	public String getVariant_code() {
		return variant_code;
	}
	public void setVariant_code(String variant_code) {
		this.variant_code = variant_code;
	}
	public String getQty_per_unit_of_measure() {
		return qty_per_unit_of_measure;
	}
	public void setQty_per_unit_of_measure(String qty_per_unit_of_measure) {
		this.qty_per_unit_of_measure = qty_per_unit_of_measure;
	}
	public String getUnit_of_measure_code() {
		return unit_of_measure_code;
	}
	public void setUnit_of_measure_code(String unit_of_measure_code) {
		this.unit_of_measure_code = unit_of_measure_code;
	}
	public String getDerived_from_blanket_order() {
		return derived_from_blanket_order;
	}
	public void setDerived_from_blanket_order(String derived_from_blanket_order) {
		this.derived_from_blanket_order = derived_from_blanket_order;
	}
	public String getCross_reference_no() {
		return cross_reference_no;
	}
	public void setCross_reference_no(String cross_reference_no) {
		this.cross_reference_no = cross_reference_no;
	}
	public String getOriginally_ordered_no() {
		return originally_ordered_no;
	}
	public void setOriginally_ordered_no(String originally_ordered_no) {
		this.originally_ordered_no = originally_ordered_no;
	}
	public String getOriginally_ordered_var_code() {
		return originally_ordered_var_code;
	}
	public void setOriginally_ordered_var_code(String originally_ordered_var_code) {
		this.originally_ordered_var_code = originally_ordered_var_code;
	}
	public String getOut_of_stock_substitution() {
		return out_of_stock_substitution;
	}
	public void setOut_of_stock_substitution(String out_of_stock_substitution) {
		this.out_of_stock_substitution = out_of_stock_substitution;
	}
	public String getItem_category_code() {
		return item_category_code;
	}
	public void setItem_category_code(String item_category_code) {
		this.item_category_code = item_category_code;
	}
	public String getNonstock() {
		return nonstock;
	}
	public void setNonstock(String nonstock) {
		this.nonstock = nonstock;
	}
	public String getPurchasing_code() {
		return purchasing_code;
	}
	public void setPurchasing_code(String purchasing_code) {
		this.purchasing_code = purchasing_code;
	}
	public String getProduct_group_code() {
		return product_group_code;
	}
	public void setProduct_group_code(String product_group_code) {
		this.product_group_code = product_group_code;
	}
	public String getTransfer_order_no() {
		return transfer_order_no;
	}
	public void setTransfer_order_no(String transfer_order_no) {
		this.transfer_order_no = transfer_order_no;
	}
	public String getCompletely_invoiced() {
		return completely_invoiced;
	}
	public void setCompletely_invoiced(String completely_invoiced) {
		this.completely_invoiced = completely_invoiced;
	}
	public String getLast_invoice_date() {
		return last_invoice_date;
	}
	public void setLast_invoice_date(String last_invoice_date) {
		this.last_invoice_date = last_invoice_date;
	}
	public String getApplied_entry_to_adjust() {
		return applied_entry_to_adjust;
	}
	public void setApplied_entry_to_adjust(String applied_entry_to_adjust) {
		this.applied_entry_to_adjust = applied_entry_to_adjust;
	}
	public String getCost_amount_expected() {
		return cost_amount_expected;
	}
	public void setCost_amount_expected(String cost_amount_expected) {
		this.cost_amount_expected = cost_amount_expected;
	}
	public String getCost_amount_actual() {
		return cost_amount_actual;
	}
	public void setCost_amount_actual(String cost_amount_actual) {
		this.cost_amount_actual = cost_amount_actual;
	}
	public String getCost_amount_non_invtbl() {
		return cost_amount_non_invtbl;
	}
	public void setCost_amount_non_invtbl(String cost_amount_non_invtbl) {
		this.cost_amount_non_invtbl = cost_amount_non_invtbl;
	}
	public String getCost_amount_expected_acy() {
		return cost_amount_expected_acy;
	}
	public void setCost_amount_expected_acy(String cost_amount_expected_acy) {
		this.cost_amount_expected_acy = cost_amount_expected_acy;
	}
	public String getCost_amount_actual_acy() {
		return cost_amount_actual_acy;
	}
	public void setCost_amount_actual_acy(String cost_amount_actual_acy) {
		this.cost_amount_actual_acy = cost_amount_actual_acy;
	}
	public String getCost_amount_non_invtbl_acy() {
		return cost_amount_non_invtbl_acy;
	}
	public void setCost_amount_non_invtbl_acy(String cost_amount_non_invtbl_acy) {
		this.cost_amount_non_invtbl_acy = cost_amount_non_invtbl_acy;
	}
	public String getPurchase_amount_expected() {
		return purchase_amount_expected;
	}
	public void setPurchase_amount_expected(String purchase_amount_expected) {
		this.purchase_amount_expected = purchase_amount_expected;
	}
	public String getPurchase_amount_actual() {
		return purchase_amount_actual;
	}
	public void setPurchase_amount_actual(String purchase_amount_actual) {
		this.purchase_amount_actual = purchase_amount_actual;
	}
	public String getSales_amount_expected() {
		return sales_amount_expected;
	}
	public void setSales_amount_expected(String sales_amount_expected) {
		this.sales_amount_expected = sales_amount_expected;
	}
	public String getSales_amount_actual() {
		return sales_amount_actual;
	}
	public void setSales_amount_actual(String sales_amount_actual) {
		this.sales_amount_actual = sales_amount_actual;
	}
	public String getCorrection() {
		return correction;
	}
	public void setCorrection(String correction) {
		this.correction = correction;
	}
	public String getShipped_qty_not_returned() {
		return shipped_qty_not_returned;
	}
	public void setShipped_qty_not_returned(String shipped_qty_not_returned) {
		this.shipped_qty_not_returned = shipped_qty_not_returned;
	}
	public String getProd_order_line_no() {
		return prod_order_line_no;
	}
	public void setProd_order_line_no(String prod_order_line_no) {
		this.prod_order_line_no = prod_order_line_no;
	}
	public String getProd_order_comp_line_no() {
		return prod_order_comp_line_no;
	}
	public void setProd_order_comp_line_no(String prod_order_comp_line_no) {
		this.prod_order_comp_line_no = prod_order_comp_line_no;
	}
	public String getService_order_no() {
		return service_order_no;
	}
	public void setService_order_no(String service_order_no) {
		this.service_order_no = service_order_no;
	}
	public String getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
	public String getLot_no() {
		return lot_no;
	}
	public void setLot_no(String lot_no) {
		this.lot_no = lot_no;
	}
	public String getWarranty_date() {
		return warranty_date;
	}
	public void setWarranty_date(String warranty_date) {
		this.warranty_date = warranty_date;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getItem_tracking() {
		return item_tracking;
	}
	public void setItem_tracking(String item_tracking) {
		this.item_tracking = item_tracking;
	}
	public String getReturn_reason_code() {
		return return_reason_code;
	}
	public void setReturn_reason_code(String return_reason_code) {
		this.return_reason_code = return_reason_code;
	}
	public String getOffer_no() {
		return offer_no;
	}
	public void setOffer_no(String offer_no) {
		this.offer_no = offer_no;
	}
	public String getBatch_no() {
		return batch_no;
	}
	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}
	public String getUnit_retail_value() {
		return unit_retail_value;
	}
	public void setUnit_retail_value(String unit_retail_value) {
		this.unit_retail_value = unit_retail_value;
	}
	public String getTransfer_type() {
		return transfer_type;
	}
	public void setTransfer_type(String transfer_type) {
		this.transfer_type = transfer_type;
	}
	public String getStatement_no() {
		return statement_no;
	}
	public void setStatement_no(String statement_no) {
		this.statement_no = statement_no;
	}
	
	public itemledgerss(int id, String created_at, String updated_at, String entry_no, String item_no,
			String posting_date, String entry_type, String source_no, String document_no, String description,
			String location_code, String quantity, String remaining_quantity, String invoiced_quantity,
			String applies_to_entry, String open, String global_dimension_1_code, String global_dimension_2_code,
			String positive, String source_type, String drop_shipment, String transaction_type, String transport_method,
			String country_region_code, String entry_exit_point, String document_date, String external_document_no,
			String area, String transaction_specification, String no_series, String reserved_quantity,
			String document_type, String document_line_no, String job_no, String job_task_no, String job_purchase,
			String prod_order_no, String variant_code, String qty_per_unit_of_measure, String unit_of_measure_code,
			String derived_from_blanket_order, String cross_reference_no, String originally_ordered_no,
			String originally_ordered_var_code, String out_of_stock_substitution, String item_category_code,
			String nonstock, String purchasing_code, String product_group_code, String transfer_order_no,
			String completely_invoiced, String last_invoice_date, String applied_entry_to_adjust,
			String cost_amount_expected, String cost_amount_actual, String cost_amount_non_invtbl,
			String cost_amount_expected_acy, String cost_amount_actual_acy, String cost_amount_non_invtbl_acy,
			String purchase_amount_expected, String purchase_amount_actual, String sales_amount_expected,
			String sales_amount_actual, String correction, String shipped_qty_not_returned, String prod_order_line_no,
			String prod_order_comp_line_no, String service_order_no, String serial_no, String lot_no,
			String warranty_date, String expiration_date, String item_tracking, String return_reason_code,
			String offer_no, String batch_no, String unit_retail_value, String transfer_type, String statement_no) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.entry_no = entry_no;
		this.item_no = item_no;
		this.posting_date = posting_date;
		this.entry_type = entry_type;
		this.source_no = source_no;
		this.document_no = document_no;
		this.description = description;
		this.location_code = location_code;
		this.quantity = quantity;
		this.remaining_quantity = remaining_quantity;
		this.invoiced_quantity = invoiced_quantity;
		this.applies_to_entry = applies_to_entry;
		this.open = open;
		this.global_dimension_1_code = global_dimension_1_code;
		this.global_dimension_2_code = global_dimension_2_code;
		this.positive = positive;
		this.source_type = source_type;
		this.drop_shipment = drop_shipment;
		this.transaction_type = transaction_type;
		this.transport_method = transport_method;
		this.country_region_code = country_region_code;
		this.entry_exit_point = entry_exit_point;
		this.document_date = document_date;
		this.external_document_no = external_document_no;
		this.area = area;
		this.transaction_specification = transaction_specification;
		this.no_series = no_series;
		this.reserved_quantity = reserved_quantity;
		this.document_type = document_type;
		this.document_line_no = document_line_no;
		this.job_no = job_no;
		this.job_task_no = job_task_no;
		this.job_purchase = job_purchase;
		this.prod_order_no = prod_order_no;
		this.variant_code = variant_code;
		this.qty_per_unit_of_measure = qty_per_unit_of_measure;
		this.unit_of_measure_code = unit_of_measure_code;
		this.derived_from_blanket_order = derived_from_blanket_order;
		this.cross_reference_no = cross_reference_no;
		this.originally_ordered_no = originally_ordered_no;
		this.originally_ordered_var_code = originally_ordered_var_code;
		this.out_of_stock_substitution = out_of_stock_substitution;
		this.item_category_code = item_category_code;
		this.nonstock = nonstock;
		this.purchasing_code = purchasing_code;
		this.product_group_code = product_group_code;
		this.transfer_order_no = transfer_order_no;
		this.completely_invoiced = completely_invoiced;
		this.last_invoice_date = last_invoice_date;
		this.applied_entry_to_adjust = applied_entry_to_adjust;
		this.cost_amount_expected = cost_amount_expected;
		this.cost_amount_actual = cost_amount_actual;
		this.cost_amount_non_invtbl = cost_amount_non_invtbl;
		this.cost_amount_expected_acy = cost_amount_expected_acy;
		this.cost_amount_actual_acy = cost_amount_actual_acy;
		this.cost_amount_non_invtbl_acy = cost_amount_non_invtbl_acy;
		this.purchase_amount_expected = purchase_amount_expected;
		this.purchase_amount_actual = purchase_amount_actual;
		this.sales_amount_expected = sales_amount_expected;
		this.sales_amount_actual = sales_amount_actual;
		this.correction = correction;
		this.shipped_qty_not_returned = shipped_qty_not_returned;
		this.prod_order_line_no = prod_order_line_no;
		this.prod_order_comp_line_no = prod_order_comp_line_no;
		this.service_order_no = service_order_no;
		this.serial_no = serial_no;
		this.lot_no = lot_no;
		this.warranty_date = warranty_date;
		this.expiration_date = expiration_date;
		this.item_tracking = item_tracking;
		this.return_reason_code = return_reason_code;
		this.offer_no = offer_no;
		this.batch_no = batch_no;
		this.unit_retail_value = unit_retail_value;
		this.transfer_type = transfer_type;
		this.statement_no = statement_no;
	}
	
	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="CreatedAt")
	String created_at;
	
	@Column(name="UpdatedAt")
	String updated_at;
	
	@Column(name="EntryNo")
	String entry_no;
	
	@Column(name="ItemNo")
	String item_no;
	
	@Column(name="PostingDate")
	String posting_date;
	
	@Column(name="EntryType")
	String entry_type;
	
	@Column(name="SourceNo")
	String source_no;
	
	@Column(name="DocumentNo")
	String document_no;
	
	@Column(name="Description")
	String description;
	
	@Column(name="LocationCode")
	String location_code;
	
	@Column(name="Quantity")
	String quantity;
	
	@Column(name="RemainingQuantity")
	String remaining_quantity;
	
	@Column(name="InvoicedQuantity")
	String invoiced_quantity;
	
	@Column(name="AppliesToEntry")
	String applies_to_entry;
	
	@Column(name="Open")
	String open;
	
	@Column(name="GlobalDimension1Code")
	String global_dimension_1_code;
	
	@Column(name="GlobalDimension2Code")
	String global_dimension_2_code;
	
	@Column(name="Positive")
	String positive;
	
	@Column(name="Sourcetype")
	String source_type;
	
	@Column(name="DropShipment")
	String drop_shipment;
	
	@Column(name="TransactionType")
	String transaction_type;
	
	@Column(name="TransportMethod")
	String transport_method;
	
	@Column(name="Country/region code")
	String country_region_code;
	
	@Column(name="Entry/Exit point")
	String entry_exit_point;
	
	@Column(name="DocumentDate")
	String document_date;
	
	@Column(name="ExternalDocumentNO")
	String external_document_no;
	
	@Column(name="Area")
	String area;
	
	@Column(name="TransactionSpecification")
	String transaction_specification;
	
	@Column(name="NoSeries")
	String no_series;
	
	@Column(name="ReservedQuantity")
	String reserved_quantity;
	
	@Column(name="DocumentType")
	String document_type;
	
	@Column(name="DocumentLineNo")
	String document_line_no;
	
	@Column(name="JobNo")
	String job_no;
	
	@Column(name="JobTaskNo")
	String job_task_no;
	
	@Column(name="JobPurchase")
	String job_purchase;
	
	@Column(name="ProdOrderNo")
	String prod_order_no;
	
	@Column(name="VariantCode")
	String variant_code;
	
	@Column(name="QtyPerUnitOfMeasure")
	String qty_per_unit_of_measure;
	
	@Column(name="UnitOfMeasureCode")
	String unit_of_measure_code;
	
	@Column(name="DerivedFromBlanketOrder")
	String derived_from_blanket_order;
	
	@Column(name="CrossReferenceNo")
	String cross_reference_no;
	
	@Column(name="OriginallyOrderedNo")
	String originally_ordered_no;
	
	@Column(name="OriginallyOrderdvarCode")
	String originally_ordered_var_code;
	
	@Column(name="OutOfStockSubstitution")
	String out_of_stock_substitution;
	
	@Column(name="ItemCategoryCode")
	String item_category_code;
	
	@Column(name="NonStock")
	String nonstock;
	
	@Column(name="PurchasingCode")
	String purchasing_code;
	
	@Column(name="ProductGroupCode")
	String product_group_code;
	
	@Column(name="TransferorderNo")
	String transfer_order_no;
	
	@Column(name="CompletelyInvoiced")
	String completely_invoiced;
	
	@Column(name="LastInvoiceDate")
	String last_invoice_date;
	
	@Column(name="appliedEntryToAdjust")
	String applied_entry_to_adjust;
	
	@Column(name="CostAmountExpected")
	String cost_amount_expected;
	
	@Column(name="CostAmountActual")
	String cost_amount_actual;
	
	@Column(name="CostAmountNOnInvtbl")
	String cost_amount_non_invtbl;
	
	@Column(name="costAmountExpectedAcy")
	String cost_amount_expected_acy;
	
	@Column(name="CostAmountActualAcy")
	String cost_amount_actual_acy;
	
	@Column(name="CostAmountNonInvitblAcy")
	String cost_amount_non_invtbl_acy;
	
	@Column(name="PurchaseAmountExpected")
	String purchase_amount_expected;
	
	@Column(name="purchaseAmountActual")
	String purchase_amount_actual;
	
	@Column(name="SalesAmountExpected")
	String sales_amount_expected;
	
	@Column(name="SalesAmountActual")
	String sales_amount_actual;
	
	@Column(name="Correction")
	String correction;
	
	@Column(name="ShippedQtyNotReturned")
	String shipped_qty_not_returned;
	
	@Column(name="ProdOrderLineNo")
	String prod_order_line_no;
	
	@Column(name="ProdOrderComplineNo")
	String prod_order_comp_line_no;
	
	@Column(name="serviceOrderNo")
	String service_order_no;
	
	@Column(name="SerialNo")
	String serial_no;
	
	@Column(name="lotNo")
	String lot_no;
	
	@Column(name="WarrantyDate")
	String warranty_date;
	
	@Column(name="ExpirationDate")
	String expiration_date;
	
	@Column(name="Itemtracking")
	String item_tracking;
	
	@Column(name="ReturnReasonCode")
	String return_reason_code;
	
	@Column(name="OfferNo")
	String offer_no;
	
	@Column(name="BatchNo")
	String batch_no;
	
	@Column(name="UnitRetailvalue")
	String unit_retail_value;
	
	@Column(name="TransferType")
	String transfer_type;
	
	@Column(name="StatementNO")
	String statement_no;
	
public itemledgerss() {}	
	

}
