package com;

public class Products {
	int pId;
	String pName;
	int pPrice;
	int mfgCode;
	int areaCode;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getMfgCode() {
		return mfgCode;
	}
	public void setMfgCode(int mfgCode) {
		this.mfgCode = mfgCode;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public Products(int pId, String pName, int pPrice, int mfgCode, int areaCode) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.mfgCode = mfgCode;
		this.areaCode = areaCode;
	}
	@Override
	public String toString() {
		return "Products [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", mfgCode=" + mfgCode
				+ ", areaCode=" + areaCode + "]";
	}
	

}
