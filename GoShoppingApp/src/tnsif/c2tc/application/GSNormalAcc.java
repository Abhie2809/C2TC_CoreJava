package tnsif.c2tc.application;

import tnsif.c2tc.framework.NormalAcc;
import tnsif.c2tc.framework.ShopFactory;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("You have purchased the product with charges"+charges+"along with delivery charges"+deliverycharges);
	}
	
	
}
	