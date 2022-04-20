package tnsif.c2tc.m07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.entity.Shop.shopCategory;
import tnsif.c2tc.m07.entity.Shop.shopStatus;
import tnsif.c2tc.m07.entity.ShopOwner;
import tnsif.c2tc.m07.service.ShopService;
import tnsif.c2tc.m07.service.ShopServiceImpl;

public class Client {

	public static void main(String[] args) {
		ShopService service = new ShopServiceImpl();
		Shop shop = new Shop();
		ShopOwner shopowner = new ShopOwner();
		shop.setShopId(000002);
		shop.setShopName("Tata Motors");
		shop.setLeaseStatus("9Months");
		shop.setShopOwner(shopowner);
		shopowner.setId(02);
		shopowner.setName("Usha");
		shopowner.setAddress("Mumbai");
		shopowner.setShop(shop);
		
		//LocalDate
		LocalDate dt = LocalDate.parse("2022-04-15");
        System.out.println(dt);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(dt));
        shopowner.setDob(dt);
        
		//Enum
        
//		for(shopCategory sc: shopCategory.values())
//			System.out.println(sc);
		shopCategory sc= shopCategory.RETAIL;
		System.out.println(sc);
//		for(shopStatus ss: shopStatus.values())
//			System.out.println(ss);
		shopStatus ss = shopStatus.OPEN;
		System.out.println(ss);
		
		//Service(Execution Methods)
		
		//service.addShop(shop);
		service.updateShop(shop);
//		Shop s = service.getShop(000002L);
//		System.out.println(s);
		//service.deleteShop(000002L);
		
		//service.addShopOwner(shopowner);
		service.updateShopOwner(shopowner);
//		ShopOwner so = service.getShopOwner(1L);
//    	System.out.println(so);
		//service.deleteShopOwner(02L);
	}

}
