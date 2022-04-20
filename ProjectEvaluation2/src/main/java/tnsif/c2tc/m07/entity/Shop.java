package tnsif.c2tc.m07.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	@Id
	private long shopId;
	private String shopName;
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + "]";
	}
	

}
