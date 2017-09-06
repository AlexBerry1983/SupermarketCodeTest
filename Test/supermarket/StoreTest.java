package supermarket;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class StoreTest {

	@Test
	public void checkArrayListStockStartsEmptytest() {
		Store shop = new Store();
		assertEquals(0, shop.getStockCount());
	}

}
