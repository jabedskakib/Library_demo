package objectDemo.equals;

public class Book {
	int id;
	double price;
	int edition;

	Book() {
	}

	Book(int id, double price, int edition) {
		this.id = id;
		this.price = price;
		this.edition = edition;
	}

	public String toString() {
		return "ID:" + id + " Price:" + price + " Edition:" + edition;
	}

	public boolean equals(Object o) {
		Book b = (Book) o;// downcasting

		if (this.id == b.id && this.price == b.price && this.edition == b.edition) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int hc = 0;
		hc = hc + id;
		hc = hc + (int) price;
		hc = hc + edition;
		return hc;
	}
}
