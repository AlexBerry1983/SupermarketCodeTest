package supermarket;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkuBean implements Serializable {
	
	private String productCode;
	private String description;
	private BigDecimal price;
	
	public SkuBean() {
		
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	
	
	
	
	
}
