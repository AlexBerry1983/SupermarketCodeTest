package supermarket;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Sku>stock;
	
	public Store() {
		this.stock = new ArrayList<Sku>();
	}

	public int getStockCount() {
		return this.stock.size();
	}

	
	
}
