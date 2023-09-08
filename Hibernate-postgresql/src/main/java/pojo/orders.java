package pojo;

import java.util.List;

public class orders {
	

	@Override
	public String toString() {
		return "orders [tempTrnHeader=" + tempTrnHeader + ", headers=" + headers + ",details="+details+"]";
	}
	public TempTrnHeader getTempTrnHeader() {
		return tempTrnHeader;
	}
	public void setTempTrnHeader(TempTrnHeader tempTrnHeader) {
		this.tempTrnHeader = tempTrnHeader;
	}
	public List<Headers> getHeaders() {
		return headers;
	}
	public void setHeaders(List<Headers> headers) {
		this.headers = headers;
	}
	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
	
	public orders(TempTrnHeader tempTrnHeader, List<Headers> headers,List<Details>details) {
		super();
		this.tempTrnHeader = tempTrnHeader;
		this.headers = headers;
		this.details=details;
	}

	private TempTrnHeader tempTrnHeader;
    private List<Headers> headers;
    private List<Details> details;
    
    public orders() {}
}
