package technoserve.c2tc.m07;

import java.util.Objects;

public class Pen {
	
	private int price;
	private String color;
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pen [price=" + price + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		return Objects.equals(color, other.color) && price == other.price;
	}

}
