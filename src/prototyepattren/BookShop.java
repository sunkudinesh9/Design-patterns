package prototyepattren;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopName;
	private List<Book> bookList = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void load() {
		for (int i = 0; i < 10; i++) {
			Book book = new Book();
			book.setId(i);
			book.setBookName("Book" + i);
			getBookList().add(book);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop newBookSHop = new BookShop();

		for (Book book : this.getBookList()) {
			newBookSHop.getBookList().add(book);
		}
		return newBookSHop;
	}

}
