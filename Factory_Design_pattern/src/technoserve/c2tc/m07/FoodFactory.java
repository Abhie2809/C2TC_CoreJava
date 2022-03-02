package technoserve.c2tc.m07;

//import java.util.Scanner;
//import java.util.*;
//import java.security.*;

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}
class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

public class FoodFactory {
	
	public Food getFood(String order) {
        if ("pizza".equals(order)) {
            return new Pizza();
        } else if ("cake".equals(order)) {
            return new Cake();
        }
        return null;
    }

}
