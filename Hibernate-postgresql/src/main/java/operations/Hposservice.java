package operations;

import com.get.Erpmastersget;
import com.get.Tableformlinksget;
import com.get.Tablesget;
import com.get.addons;
import com.get.costingmethodsgets;
import com.get.couponentriesget;
import com.get.couponheadersget;
import com.get.customer;
import com.get.discounttypesget;
import com.get.divisionmastersget;
import com.get.getAllHospitalityTypesget;
import com.get.guimenusget;
import com.get.itemledgersget;
import com.get.itemmodifierdetails;
import com.get.itemmodifierheaders;
import com.get.itempricesget;
import com.get.kdsmasterss;
import com.get.kdsuser_linkss;
import com.get.menuhierarchie;
import com.get.menuitemsget;
import com.get.numberseriesget;
import com.get.portion_costhierarchiesget;
import com.get.portionweightsget;
import com.get.productgroupmasterget;
import com.get.producthierarchylinksget;
import com.get.reasonsmastersget;
import com.get.recipesget;
import com.get.sectionsget;
import com.get.settingsget;
import com.get.shiftsget;
import com.get.storeconfigurationget;
import com.get.tableconfiguratorsget;
import com.get.temptrnget;
import com.get.temptrnorddetget;
import com.get.temptrnordhdrssget;
import com.get.tsscget;
import com.get.unitOfmeasures;
import com.get.userget;
import com.get.usertablelinksget;
import com.get.usertablestatuses;
import com.get.vatmastersget;

public class Hposservice {
//	String date = "2023-09-12";
	public static void main(String[] args) {
		String date = "2023-09-12";
		sync(date);	
	}
	
	private static void sync(String date) {
		fetch_kdsmasters(date);
		fetch_kdsusers();
		fetch_addons();
		fetch_costingmethods();
		fetch_couponcontries();
		fetch_couponheader();
		fetch_customers();
		fetch_discnttypes();
		fetch_divisionmasters();
		fetch_Erpmstr();
		fetch_hospitalitytypes();
		fetch_guimenus();
		fetch_itemledgers();
		fetch_itemmodfiers();
		fetch_itemmodheaders();
		fetch_itemprices();
		fetch_menihierarchie();
		fetch_menuitems();
		fetch_numberseries();
		fetch_prtn_costhierarchies();
		fetch_portionweights();
		fetch_productgroupmstrs();
		fetch_producthierarchylinks();
		fetch_reasonmasters();
		fetch_recipes();
		fetch_sections();		
		fetch_settings();
		fetch_shifts();
		fetch_storeconfig();
		fetch_tableconfigurtor();
		fetch_tableformlink();
		fetch_tablesget();
		fetch_temptrn();
		fetch_temtrnorddet();
		fetch_temptrnordhrss();
		fetch_tsscs();
		fetch_unitofmsr();
		fetch_users();
		fetch_usertbllinks();
		fetch_usertablsatuses();
		fetch_vatmasters();
	}
	
	public static void fetch_kdsmasters(String date) {
//		String date = "2023-09-12";
		kdsmasterss kds=new kdsmasterss();
		kds.fetchDataAndSavedb(date);
	}
	
	
	public static void fetch_kdsusers() {
		kdsuser_linkss kdus = new kdsuser_linkss();
		kdus.fetchDataAndSavedb();
	}

	public static void fetch_addons() {
		addons adns = new addons();
		adns.fetchaddons();
	}
	
	public static void fetch_costingmethods() {
		costingmethodsgets cst = new costingmethodsgets();
		cst.fetchcostings();
	}

	public static void fetch_couponcontries() {
		couponentriesget ccnt = new couponentriesget();
		ccnt.fetchcouponcontries();
	}

	public static void fetch_couponheader() {
		couponheadersget chdrs = new couponheadersget();
		chdrs.fetchcoupnhdrs();
	}

	public static void fetch_customers() {
		customer cstmr = new customer();
		cstmr.fetchcstmrs();
	}
	
	public static void fetch_discnttypes() {
		discounttypesget dscnt = new discounttypesget();
		dscnt.fetchdiscountypes();
	}

	public static void fetch_divisionmasters() {
		divisionmastersget dvsmstr = new divisionmastersget();
		dvsmstr.fetchdivisionmstrs();
	}
	
	public static void fetch_Erpmstr() {
		Erpmastersget erpmstr = new Erpmastersget();
		erpmstr.fetcherpmstr();
	}
	
	
	public static void fetch_hospitalitytypes() {
		getAllHospitalityTypesget hsptltyp = new getAllHospitalityTypesget();
		hsptltyp.fetchgetAllhospitalitytypes();
	}

	public static void fetch_guimenus() {
		guimenusget gmst = new guimenusget();
		gmst.fetchguimenus();
	}

	public static void fetch_itemledgers() {
		itemledgersget itmledgers =new itemledgersget();
		itmledgers.fetchitemledgers();
	}

	public static void fetch_itemmodfiers() {
		itemmodifierdetails itmmodfrs = new itemmodifierdetails();
		itmmodfrs.fetchitemmoddetails();
	}
	
	public static void fetch_itemmodheaders() {
		itemmodifierheaders itmhdrs = new itemmodifierheaders();
		itmhdrs.fetchitemmodfheadrs();
	}
	
	public static void fetch_itemprices() {
		itempricesget itmprc = new itempricesget();
		itmprc.fetchitemprice();
	}

	public static void fetch_menihierarchie() {
		menuhierarchie mhie = new menuhierarchie();
		mhie.fetchmenuhierarch();
	}
	
	public static void fetch_menuitems() {
		menuitemsget mnitm = new menuitemsget();
		mnitm.fetchmenuitems();
	}
	
	public static void fetch_numberseries() {
		numberseriesget nmbrsrs = new numberseriesget();
		nmbrsrs.fetchnumberseries();
	}

	public static void fetch_prtn_costhierarchies() {
		portion_costhierarchiesget prtcst = new portion_costhierarchiesget();
		prtcst.fetchportioncosthierarchies();
	}
	
	public static void fetch_portionweights() {
		portionweightsget prtnwghts = new portionweightsget();
		prtnwghts.fetchportionweights();
	}
	
	public static void fetch_productgroupmstrs() {
		productgroupmasterget prdctmstr = new productgroupmasterget();
		prdctmstr.fetchprdtgrupmstrs();
	}
	
	public static void fetch_producthierarchylinks() {
		producthierarchylinksget prdcthielnk = new producthierarchylinksget();
		prdcthielnk.fetchproducthierarchylinks();
	}
	
	public static void fetch_reasonmasters() {
		reasonsmastersget rsnmstr = new reasonsmastersget();
		rsnmstr.fetchreasonmasters();
	}
	
	
	public static void fetch_recipes() {
		recipesget rcips = new  recipesget();
		rcips.fetchrecipes();
	}
	
	
	public static void fetch_sections() {
		sectionsget sctns = new sectionsget();
		sctns.fetchsections();
	}
	
	
	public static void fetch_settings() {
		settingsget setns = new settingsget();
		setns.fetchsettings();
	}
	
	
	public static void fetch_shifts() {
		shiftsget shfts = new shiftsget();
		shfts.fetchshiftget();
	}
	
	public static void fetch_storeconfig() {
		storeconfigurationget strcnfg = new storeconfigurationget();
		strcnfg.fetchstoreconfig();
	}
	
	public static void fetch_tableconfigurtor() {
		tableconfiguratorsget tblconfg = new tableconfiguratorsget();
		tblconfg.fetchtableconfigurator();
	}
	
	public static void fetch_tableformlink() {
		Tableformlinksget tblfrm = new Tableformlinksget();
		tblfrm.fetchtableformlinks();
	}
	
	public static void fetch_tablesget() {
		Tablesget tbls = new Tablesget();
		tbls.fetchtablesget();
	}
	

	public static void fetch_temptrn() {
		temptrnget tmp = new temptrnget();
		tmp.fetchtemptrn();
	}

	public static void fetch_temtrnorddet() {
		temptrnorddetget tmptrndt = new temptrnorddetget();
		tmptrndt.fetchtrnorddet();
	}
	
	public static void fetch_temptrnordhrss() {
		temptrnordhdrssget tmptrnhdr = new temptrnordhdrssget();
		tmptrnhdr.fetchtemptrnordhdrs();
	}
	
	
	public static void fetch_tsscs() {
		tsscget tsc = new tsscget();
		tsc.fetchtsscget();
	}

	public static void fetch_unitofmsr() {
		unitOfmeasures uoms = new unitOfmeasures();
		uoms.fetchunitofmeasure();
	}
	
	
	public static void fetch_users() {
		userget usr = new userget();
		usr.fetchuserget();
	}
	
	
	public static void fetch_usertbllinks() {
		usertablelinksget usrtblink = new usertablelinksget();
		usrtblink.fetchusertablelinks();
	}
	
	public static void fetch_usertablsatuses() {
		usertablestatuses usrtblsatus = new usertablestatuses();
		usrtblsatus.fetchusertablestatuses();
	}
	
	
	public static void fetch_vatmasters() {
		vatmastersget vatmst = new vatmastersget();
		vatmst.fetchvatmasters();
	}

	
}
