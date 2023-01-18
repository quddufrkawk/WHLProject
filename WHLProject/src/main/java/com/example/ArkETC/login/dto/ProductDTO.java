package com.example.ArkETC.login.dto;

public class ProductDTO {
	
	private String productName;
	private String productCode;
	private String productPrice;
	private String productCount;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", productCode=" + productCode + ", productPrice="
				+ productPrice + ", productCount=" + productCount + "]";
	}
	
	
}
