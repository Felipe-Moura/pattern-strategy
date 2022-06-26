package strategy;

import java.util.ArrayList;

public class Enchanter {
	
	private ArrayList<Item> items = new ArrayList();
	private Enchantment enchantmente;
	
	//public Enchanter() {}
	
	public void receiveItem(Item newItem) {
		items.add(newItem);
	}
	
	public void setEnchantment(Enchantment newEnchantment) {
		this.enchantmente = newEnchantment;
	}
	
	public Item deliverItem() {
		if(!items.isEmpty()) {
			return items.remove(0);
		}
		
		return null;
	}
	
	public void enchant() {
		items.add(enchantmente.enchantItem(items.remove(0)));
	}

}
