package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.entity.Shop;

public interface ShopService {
	public void addShop(Shop s);
	public long deleteShop(long id);
	public Shop updateShop(Shop s);
	public Shop getShop(long id);

}
