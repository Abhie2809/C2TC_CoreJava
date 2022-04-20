package tnsif.c2tc.m07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.repo.ShopRepo;

@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	ShopRepo sr;

	@Override
	public void addShop(Shop s) {
		sr.save(s);
	}

	@Override
	public Shop updateShop(Shop s) {
		Shop shop=sr.save(s);
		return s;
	}

	@Override
	public Shop getShop(long id) {
		Shop s = sr.findById(id).get();
		return s;
	}

	@Override
	public long deleteShop(long id) {
		Shop s=sr.findById(id).get();
		sr.delete(s);
		return 1;
	}

}
