package supermarket;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<SkuBean>stock;
	
	public Store() {
		this.stock = new ArrayList<SkuBean>();
	}

	public int getStockCount() {
		return this.stock.size();
	}

	
	
}
