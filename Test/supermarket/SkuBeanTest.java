package supermarket;

import static org.junit.Assert.*;

import org.junit.Test;

public class SkuBeanTest {

	@Test
	public void getProductCodeTest() {
		SkuBean bean = new SkuBean();
		bean.setProductCode("H123");
		assertEquals("H123", bean.getProductCode());
	}

}
