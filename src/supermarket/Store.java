package supermarket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	private ArrayList<Sku>stock;
	
	public Store() {
		this.stock = new ArrayList<Sku>();
	}

	public int getStockCount() {
		return this.stock.size();
	}

	public void addProductToStock(Sku product) {
		this.stock.add(product);
	}
	
	public void parseTsv() {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("Products.tsv"));
			scanner.useDelimiter("\n");
    			scanner.nextLine();
    		while(scanner.hasNext()) {
    			String productLine = scanner.nextLine();
    			ArrayList<String> products = new ArrayList<String>();
    			products.add(productLine);
    			for (String product:products) {
    				Sku productObj = Sku.createNewSkuObject(product);
    				this.stock.add(productObj);
    			}
    		}
    		scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}
