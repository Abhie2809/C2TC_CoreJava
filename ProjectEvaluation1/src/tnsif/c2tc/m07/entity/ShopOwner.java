package tnsif.c2tc.m07.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Shopowner")
public class ShopOwner {
	@Id
	@Column(name = "SoId")
	private long id;
	@Column(name = "SoName")
	private String name;
	@Column(name = "SoAddr")
	private String address;
	@Column(name = "SoDateOfBirth")
	private LocalDate dob;
	@OneToOne
	private Shop shop;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", shop=" + shop
				+ "]";
	}
	
	
	
	
	
	

}
