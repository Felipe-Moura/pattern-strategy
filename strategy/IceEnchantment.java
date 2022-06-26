package strategy;

public class IceEnchantment  implements Enchantment{
	
	private String enchantment = "Ice damage.";

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
