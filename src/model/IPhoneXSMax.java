package model;

import model.strategy.GetHardwareStrategy;
import model.strategy.chipset.IphoneXChipset;
import model.strategy.memory.IPhoneMemory;
import model.strategy.ram.IPhoneXRam;
import model.strategy.screen.ProScreen;
import observer.Observer;

public class IPhoneXSMax extends Phone implements Observer, GetHardwareStrategy {

	private Double price = 0.0;


	@Override
	public void screen() {
		new ProScreen().screen();
	}

	@Override
	public void chipset() {
		new IphoneXChipset().chipset();
	}

	@Override
	public void ram() {
		new IPhoneXRam().ram();
	}

	@Override
	public void memory() {
		new IPhoneMemory().memory();
	}


	@Override
	public void update(Double priceIPhone13Chipset, Double priceIphoneXChipset, Double priceSansungChipset,
					   Double priceIphoneMomory, Double priceSansungMemory, Double priceSansungProMemory,
					   Double priceIPhoneRam, Double priceSansungRam, Double priceProScreen, Double priceScreen) {

		if(price == 0.0)
			setPrice(priceProScreen + priceIphoneXChipset + priceIPhoneRam + priceIphoneMomory);
	}
}
