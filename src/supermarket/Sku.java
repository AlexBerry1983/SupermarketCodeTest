package supermarket;

import java.io.Serializable;
import java.math.BigDecimal;

public class Sku implements Serializable {
	
	private String productCode;
	private String description;
	private BigDecimal price;
	
	public Sku() {
		
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Sku)) {
			return false;
		}
		Sku other = (Sku) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		if (productCode == null) {
			if (other.productCode != null) {
				return false;
			}
		} else if (!productCode.equals(other.productCode)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "SkuBean productCode=" + productCode + ", description=" + description + ", price=" + price.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public Sku createNewSkuObject(String stringToCheck) {
		String[] details = stringToCheck.split("/t");
		Sku newObject = new Sku();
		newObject.setProductCode(details[0]);
		newObject.setDescription(details[1]);
		BigDecimal price = new BigDecimal(details[2]);
		newObject.setPrice(price);
		return newObject;
	}
	
	

	
	
	
	
	
	
	
}
