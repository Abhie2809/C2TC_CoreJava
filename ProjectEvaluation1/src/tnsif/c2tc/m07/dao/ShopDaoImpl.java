package tnsif.c2tc.m07.dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.entity.ShopOwner;

public class ShopDaoImpl implements ShopDao{
	EntityManager entitymanager;
	public ShopDaoImpl()
	{
		entitymanager=Configuration.createEntityManager();
	}
	@Override
	public void startTransaction() {
		entitymanager.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		entitymanager.getTransaction().commit();
		
	}
	@Override
	public void addShop(Shop shop) {
		entitymanager.persist(shop);
		
	}
	@Override
	public void updateShop(Shop shop) {
		entitymanager.merge(shop);
		
	}
	@Override
	public Shop getShop(long l) {
		Shop s = entitymanager.find(Shop.class, l);
		return s;
	}
	@Override
	public void deleteShop(long l) {
		Shop s = entitymanager.find(Shop.class, l);
		entitymanager.remove(s);
		
	}
	@Override
	public void addShopOwner(ShopOwner shopowner) {
		entitymanager.persist(shopowner);
		
	}
	@Override
	public void updateShopOwner(ShopOwner shopowner) {
		entitymanager.merge(shopowner);
		
	}
	@Override
	public ShopOwner getShopOwner(long l) {
		ShopOwner so = entitymanager.find(ShopOwner.class, l);
		return so;
	}
	@Override
	public void deleteShopOwner(long l) {
		ShopOwner so = entitymanager.find(ShopOwner.class, l);
		entitymanager.remove(so);
	}
	

}
