package prototyepattren;

public class PrototypeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		shop.setShopName("A");
		shop.load();
		System.out.println(shop);

		BookShop newShop = shop.clone();
		newShop.setShopName("B");
		newShop.getBookList().remove(0);
		System.out.println(newShop);
		System.out.println(shop);
	}
}
