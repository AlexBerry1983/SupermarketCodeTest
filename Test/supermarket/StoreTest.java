package supermarket;

import static org.junit.Assert.*;
import org.junit.Test;

public class StoreTest {

	@Test
	public void checkArrayListStockStartsEmptytest() {
		Store shop = new Store();
		assertEquals(0, shop.getStockCount());
	}
	
	@Test
	public void canAddStockToStore() {
		Store shop = new Store();
		Sku product = new Sku();
		shop.addProductToStock(product);
		assertEquals(1, shop.getStockCount());
	}

}
