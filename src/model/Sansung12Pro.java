package model;

import model.strategy.GetHardwareStrategy;
import model.strategy.chipset.SansungChipset;
import model.strategy.memory.SansungProMemory;
import model.strategy.ram.SansungRam;
import model.strategy.screen.ProScreen;
import observer.Observer;

public class Sansung12Pro extends Phone implements Observer, GetHardwareStrategy {
    private Double price = 0.0;

    @Override
    public void screen() {
        new ProScreen().screen();
    }

    @Override
    public void chipset() {
        new SansungChipset().chipset();
    }

    @Override
    public void ram() {
        new SansungRam().ram();
    }

    @Override
    public void memory() {
        new SansungProMemory().memory();
    }

    @Override
    public void update(Double priceIPhone13Chipset, Double priceIphoneXChipset, Double priceSansungChipset,
                       Double priceIphoneMomory, Double priceSansungMemory, Double priceSansungProMemory,
                       Double priceIPhoneRam, Double priceSansungRam, Double priceProScreen, Double priceScreen) {

        if(price == 0.0)
            setPrice(priceProScreen + priceSansungChipset + priceSansungRam + priceSansungProMemory);
    }
}
