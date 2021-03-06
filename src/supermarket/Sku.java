package supermarket;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;

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
		return "Sku productCode=" + productCode + ", description=" + description + ", price=" + price.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	public static Sku createNewSkuObject(String stringToCheck) {
		Scanner scanner = new Scanner(stringToCheck);
		scanner.useDelimiter("\t");
		String productCode = scanner.next();
		String description = scanner.next();
		String priceStr = scanner.next();
		BigDecimal price = new BigDecimal(priceStr);
		scanner.close();
		Sku newObject = new Sku();
		newObject.setProductCode(productCode);
		newObject.setDescription(description);
		newObject.setPrice(price);
		return newObject;
	}
	
	

	
	
	

	
	
	
	
	
	
	
}
