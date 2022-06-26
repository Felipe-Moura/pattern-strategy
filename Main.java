import java.util.ArrayList;
import java.util.Random;

import strategy.Enchanter;
import strategy.FireEnchantment;
import strategy.IceEnchantment;
import strategy.Item;
import strategy.PoisonEnchantment;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Item> myItems = new ArrayList();
		Enchanter theEnchanter = new Enchanter();
		Random rnd = new Random();
		
		for(int i = 0; i < 3; i++) {
			myItems.add(new Item("Sword", rnd.nextInt(100)));
		}
		
		for(int i = 0; i < 3; i++) {
			myItems.get(i).getItemInfo();
		}
		
		System.out.println("\nEnchanting...\n");
		
		
		for(int i = 0; i < 3; i++) {
			theEnchanter.receiveItem(myItems.remove(0));
		}
		
		theEnchanter.setEnchantment(new FireEnchantment());
		theEnchanter.enchant();
		
		theEnchanter.setEnchantment(new IceEnchantment());
		theEnchanter.enchant();
		
		theEnchanter.setEnchantment(new PoisonEnchantment());
		theEnchanter.enchant();
		
		for(int i = 0; i < 3; i++) {
			myItems.add(theEnchanter.deliverItem());
		}
		
		for(int i = 0; i < 3; i++) {
			myItems.get(i).getItemInfo();
		}
		

	}

}
