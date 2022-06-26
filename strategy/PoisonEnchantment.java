package strategy;

public class PoisonEnchantment implements Enchantment{
	
	private String enchantment = "Poison damage.";

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
