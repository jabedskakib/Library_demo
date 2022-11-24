package objectDemo;

public class Laptop {
	int ram;
	int hard_disc;
	String brand;
	double price;

	Laptop() {

	}

	Laptop(int ram, int hard_disc, String brand, double price) {
		this.ram = ram;
		this.hard_disc = hard_disc;
		this.brand = brand;
		this.price = price;
	}

	public String toString() {
		return "RAM:" + ram + " Hard-Disc:" + hard_disc + " Brand:" + brand + " Price:" + price;

	}
}
