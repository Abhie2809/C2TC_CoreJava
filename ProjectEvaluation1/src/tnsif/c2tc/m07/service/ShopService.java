package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.entity.ShopOwner;

public interface ShopService {

	void addShop(Shop shop);

	void updateShop(Shop shop);

	Shop getShop(long l);

	void deleteShop(long l);

	void addShopOwner(ShopOwner shopowner);

	void updateShopOwner(ShopOwner shopowner);

	ShopOwner getShopOwner(long l);

	void deleteShopOwner(long l);
	



}
