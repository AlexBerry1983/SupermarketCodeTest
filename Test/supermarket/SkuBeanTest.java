package supermarket;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class SkuBeanTest {

	@Test
	public void getProductCodeTest() {
		SkuBean bean = new SkuBean();
		bean.setProductCode("H123");
		assertEquals("H123", bean.getProductCode());
	}
	
	@Test
	public void getDescriptionTest() {
		SkuBean bean = new SkuBean();
		bean.setDescription("Chocolate cake");
		assertEquals("Chocolate cake", bean.getDescription());
	}
	
	@Test
	public void getPriceTest() {
		SkuBean bean = new SkuBean();
		BigDecimal price = new BigDecimal(5.99);
		bean.setPrice(price);
		assertEquals(price, bean.getPrice());
	}
	
	@Test
	public void ItemsSameProductCodeTest() {
		SkuBean bean1 = new SkuBean();
		bean1.setProductCode("A123");
		SkuBean bean2 = new SkuBean();
		bean2.setProductCode("A123");
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void ItemsSameDescriptionTest() {
		SkuBean bean1 = new SkuBean();
		bean1.setDescription("Cake");
		SkuBean bean2 = new SkuBean();
		bean2.setDescription("Cake");
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void itemsSamePriceTest() {
		BigDecimal price = new BigDecimal(7.99);
		SkuBean bean1 = new SkuBean();
		bean1.setPrice(price);
		SkuBean bean2 = new SkuBean();
		bean2.setPrice(price);
		assertEquals(true, bean1.equals(bean2));
	}
	
	@Test
	public void itemsNotEqualProdCode() {
		BigDecimal price1 = new BigDecimal(5.98);
		SkuBean bean1 = new SkuBean();
		SkuBean bean2 = new SkuBean();
		
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
		SkuBean bean1 = new SkuBean();
		SkuBean bean2 = new SkuBean();
		
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
		SkuBean bean1 = new SkuBean();
		SkuBean bean2 = new SkuBean();
		
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
		SkuBean bean1 = new SkuBean();
		SkuBean bean2 = new SkuBean();
		
		bean1.setProductCode("Q123");
		bean2.setProductCode("Q123");
		
		assertEquals(bean1.hashCode(), bean2.hashCode());
	}
	
	@Test
	public void hashCodesUnequal() {
		SkuBean bean1 = new SkuBean();
		SkuBean bean2 = new SkuBean();
		
		bean1.setProductCode("Q123");
		bean2.setProductCode("W123");
		
		assertNotSame(bean1.hashCode(), bean2.hashCode());
	}

}
