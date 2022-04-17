package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.dao.ShopDao;
import tnsif.c2tc.m07.dao.ShopDaoImpl;
import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.entity.ShopOwner;

public class ShopServiceImpl implements ShopService {
	ShopDao sd;
	public ShopServiceImpl() 
	{
		sd=new ShopDaoImpl();
	}
	@Override
	public void addShop(Shop shop) {
		sd.startTransaction();
		sd.addShop(shop);
		sd.endTransaction();
		
	}
	@Override
	public void updateShop(Shop shop) {
		sd.startTransaction();
		sd.updateShop(shop);
		sd.endTransaction();
		
	}
	@Override
	public Shop getShop(long l) {
		Shop s = sd.getShop(l);
		return s;
	}
	
	@Override
	public void deleteShop(long l) {
		sd.startTransaction();
		sd.deleteShop(l);
		sd.endTransaction();
		
		
	}
	@Override
	public void addShopOwner(ShopOwner shopowner) {
		sd.startTransaction();
		sd.addShopOwner(shopowner);
		sd.endTransaction();
		
	}
	@Override
	public void updateShopOwner(ShopOwner shopowner) {
		sd.startTransaction();
		sd.updateShopOwner(shopowner);
		sd.endTransaction();
		
	}
	@Override
	public ShopOwner getShopOwner(long l) {
		ShopOwner so = sd.getShopOwner(l);
		return so;
	}
	@Override
	public void deleteShopOwner(long l) {
		sd.startTransaction();
		sd.deleteShopOwner(l);
		sd.endTransaction();
		
	}
}
