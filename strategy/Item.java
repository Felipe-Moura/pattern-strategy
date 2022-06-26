package strategy;

public class Item {

	private String type;
	private int price;
	private boolean enchanted;
	private String enchantment;
	
	public Item(String itemType, int itemPrice) {
		this.type = itemType;
		this.price = itemPrice;
		this.enchanted = false;
		this.enchantment = "";
	}
	
	public void getItemInfo() {
		System.out.println("----------------------------------------------");
		System.out.println("Item type: " + this.type);
		System.out.println("Item price: " + this.price);
		System.out.println("Item enchantment: " + this.enchantment);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isEnchanted() {
		return enchanted;
	}

	public void setEnchanted(boolean enchanted) {
		this.enchanted = enchanted;
	}

	public String getEnchantment() {
		return enchantment;
	}

	public void setEnchantment(String enchantment) {
		this.enchantment = enchantment;
	}
	
}
