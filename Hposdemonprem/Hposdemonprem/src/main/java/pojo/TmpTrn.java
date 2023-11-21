//package pojo;
//
//import java.util.List;
//
//public class TmpTrn {
//
//
//	@Override
//	public String toString() {
//		return "TmpTrn [trnheadr=" + trnheadr + ", addItems=" + addItems + "]";
//	}
//
//	public List<TempTrnOrdHeaders> getTrnheadr() {
//		return trnheadr;
//	}
//
//	public void setTrnheadr(List<TempTrnOrdHeaders> trnheadr) {
//		this.trnheadr = trnheadr;
//	}
//
//	public List<TempTrnOrdDetails> getAddItems() {
//		return addItems;
//	}
//
//	public void setAddItems(List<TempTrnOrdDetails> addItems) {
//		this.addItems = addItems;
//	}
//
//	public TmpTrn(List<TempTrnOrdHeaders> trnheadr, List<TempTrnOrdDetails> addItems) {
//		
//		this.trnheadr = trnheadr;
//		this.addItems = addItems;
//	}
//
//	private List<TempTrnOrdHeaders> trnheadr;
//	private List<TempTrnOrdDetails> addItems;
//	
//	public TmpTrn() {
//		
//	}
//}
package pojo;

import java.util.List;

public class TmpTrn {

    private List<TempTrnHeaders> trnheadr;
    private List<TempTrnOrdHeaders> addItems;

    public List<TempTrnHeaders> getTrnheadr() {
        return trnheadr;
    }

    public void setTrnheadr(List<TempTrnHeaders> trnheadr) {
        this.trnheadr = trnheadr;
    }

    public List<TempTrnOrdHeaders> getAddItems() {
        return addItems;
    }

    public void setAddItems(List<TempTrnOrdHeaders> tempTrn) {
        this.addItems = tempTrn;
    }

    public TmpTrn(List<TempTrnHeaders> trnheadr, List<TempTrnOrdHeaders> addItems) {
        this.trnheadr = trnheadr;
        this.addItems = addItems;
    }

    public TmpTrn() {
    }

    @Override
    public String toString() {
        return "TmpTrn [trnheadr=" + trnheadr + ", addItems=" + addItems + "]";
    }
}
