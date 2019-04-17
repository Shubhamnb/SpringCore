package Utility;

import com.bridge.LinkedListComDataPro.CompanyStock;

public class NodeStock {
	
	CompanyStock companyStock;
	NodeStock next;
	
	
	public NodeStock(CompanyStock companyStock, NodeStock next) {
		this.companyStock = companyStock;
		this.next = next;
	}


	public CompanyStock getCompanyStock() {
		return companyStock;
	}


	public void setCompanyStock(CompanyStock companyStock) {
		this.companyStock = companyStock;
	}


	public NodeStock getNext() {
		return next;
	}


	public void setNext(NodeStock next) {
		this.next = next;
	}
	
	
}
