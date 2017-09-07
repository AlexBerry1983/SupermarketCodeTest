package supermarket;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.Matcher;

import org.junit.Test;

public class SkuTest {

	@Test
	public void getProductCodeTest() {
		Sku bean = new Sku();
		bean.setProductCode("H123");
		assertEquals("H123", bean.getProductCode());
	}
	
	@Test
	public void getDescriptionTest() {
		Sku bean = new Sku();
		bean.setDescription("Chocolate cake");
		assertEquals("Chocolate cake", bean.getDescription());
	}
	
	@Test
	public void getPriceTest() {
		Sku bean = new Sku();
		BigDecimal price = new BigDecimal(5.99);
		bean.setPrice(price);
		assertEquals(price, bean.getPrice());
	}
	
	@Test
	public void ItemsSameProductCodeTest() {
		Sku bean1 = new Sku();
		bean1.setProductCode("A123");
		Sku bean2 = new Sku();
		bean2.setProductCode("A123");
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void ItemsSameDescriptionTest() {
		Sku bean1 = new Sku();
		bean1.setDescription("Cake");
		Sku bean2 = new Sku();
		bean2.setDescription("Cake");
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void itemsSamePriceTest() {
		BigDecimal price = new BigDecimal(7.99);
		Sku bean1 = new Sku();
		bean1.setPrice(price);
		Sku bean2 = new Sku();
		bean2.setPrice(price);
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void itemsNotEqualProdCode() {
		BigDecimal price1 = new BigDecimal(5.98);
		Sku bean1 = new Sku();
		Sku bean2 = new Sku();
		
		bean1.setProductCode("A123");
		bean2.setProductCode("A321");
		bean1.setDescription("cake");
		bean2.setDescription("cake");
		bean1.setPrice(price1);
		bean2.setPrice(price1);
		
		assertEquals(false, bean1.equals(bean2));
	}
	
	@Test
	public void itemsNotEqualDesc() {
		BigDecimal price1 = new BigDecimal(7.49);
		Sku bean1 = new Sku();
		Sku bean2 = new Sku();
		
		bean1.setProductCode("A123");
		bean2.setProductCode("A123");
		bean1.setDescription("fish");
		bean2.setDescription("cake");
		bean1.setPrice(price1);
		bean2.setPrice(price1);
		
		assertEquals(false, bean1.equals(bean2));
	}
	
	@Test
	public void itemsNotEqualPrice() {
		BigDecimal price1 = new BigDecimal(5.99);
		BigDecimal price2 = new BigDecimal(6.99);
		Sku bean1 = new Sku();
		Sku bean2 = new Sku();
		
		bean1.setProductCode("A123");
		bean2.setProductCode("A123");
		bean1.setDescription("cake");
		bean2.setDescription("cake");
		bean1.setPrice(price1);
		bean2.setPrice(price2);
		
		assertEquals(false, bean1.equals(bean2));
	}
	
	@Test
	public void hashCodesEqual() {
		Sku bean1 = new Sku();
		Sku bean2 = new Sku();
		
		bean1.setProductCode("Q123");
		bean2.setProductCode("Q123");
		
		assertEquals(bean1.hashCode(), bean2.hashCode());
	}
	
	@Test
	public void hashCodesUnequal() {
		Sku bean1 = new Sku();
		Sku bean2 = new Sku();
		
		bean1.setProductCode("Q123");
		bean2.setProductCode("W123");
		
		assertNotSame(bean1.hashCode(), bean2.hashCode());
	}
	
	@Test
	public void toStringTest() {
		BigDecimal price = new BigDecimal(8.45);
		Sku bean1 = new Sku();
		bean1.setDescription("Steak");
		bean1.setProductCode("Z123");
		bean1.setPrice(price);
		assertEquals("Sku productCode=Z123, description=Steak, price=8.45", bean1.toString());
	}
	
	@Test
	public void canCreateNewObject() {
		Sku bean1 = new Sku();
		assertThat(bean1.createNewSkuObject("Z123	steak	8.69"), instanceOf(Sku.class));
	}

	
}
