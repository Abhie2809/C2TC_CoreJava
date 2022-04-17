package tnsif.c2tc.m07.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")
public class Shop {
	@Id
	@Column(name = "SId")
	private long shopId;
	public enum shopCategory{ WHOLESALE , RETAIL };
	@Column(name = "SName")
	private String shopName;
	public enum shopStatus{ OPEN , CLOSED};
	@OneToOne
	private ShopOwner shopOwner;
	public String leaseStatus;
	
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
	public ShopOwner getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopOwner=" + shopOwner + ", leaseStatus="
				+ leaseStatus + "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	

}
