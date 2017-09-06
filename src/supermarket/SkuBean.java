package supermarket;

import java.io.Serializable;

public class SkuBean implements Serializable {
	
	private String productCode;
	private String description;
	private BigDecimal price;
	
	public SkuBean() {
		
	}
}
