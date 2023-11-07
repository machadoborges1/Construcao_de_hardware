package model;

import model.strategy.GetHardwareStrategy;
import observer.Observer;

public abstract class Phone implements Observer, GetHardwareStrategy {

	private Double price = 0.0;

	public void assemble() {
		System.out.println("\nAssembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}

	public Double getPrice() {
		return price;
	}

	protected void setPrice(Double price) {
		this.price = price;
	}

}
