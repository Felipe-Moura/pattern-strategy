package strategy;

public class FireEnchantment implements Enchantment{
	
	private String enchantment = "Fire damage.";

	@Override
	public Item enchantItem(Item theItem) {
		Item enchantedItem = theItem;
		
		if(!enchantedItem.isEnchanted()) {
			enchantedItem.setEnchanted(true);
			enchantedItem.setEnchantment(this.enchantment);
		}
		
		return enchantedItem;
	}

}
