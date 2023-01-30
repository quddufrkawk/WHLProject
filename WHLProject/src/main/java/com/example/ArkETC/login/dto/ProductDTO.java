package com.example.ArkETC.login.dto;

public class ProductDTO {
	
	private String productName;
	private String productCode;
	private String productPrice;
	private String productCount;
	private String productSeller;
	private String productNum;
	private String productViewCount;
	
	// 조회수 증가를 위한 기능
	private String ip;
	private String id;
	
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
	public String getProductSeller() {
		return productSeller;
	}
	public void setProductSeller(String productSeller) {
		this.productSeller = productSeller;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductViewCount() {
		return productViewCount;
	}
	public void setProductViewCount(String productViewCount) {
		this.productViewCount = productViewCount;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", productCode=" + productCode + ", productPrice="
				+ productPrice + ", productCount=" + productCount + "]";
	}
	
	
}
