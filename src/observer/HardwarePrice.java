package observer;

import java.util.*;
public class HardwarePrice implements Subject {

    private List<Observer> observers;

    private Double priceIPhone13Chipset;
    private Double priceIphoneXChipset;
    private Double priceSansungChipset;
    private Double priceIphoneMomory;
    private Double priceSansungMemory;
    private Double priceSansungProMemory;
    private Double priceSansungRam;
    private Double priceIPhoneRam;
    private Double priceProScreen;
    private Double priceScreen;


    public HardwarePrice() {
        observers = new ArrayList<Observer>();
    }

    public HardwarePrice(Double priceIPhone13Chipset, Double priceIphoneXChipset,
                         Double priceSansungChipset, Double priceIphoneMomory, Double priceSansungMemory,
                         Double priceSansungProMemory, Double priceSansungRam, Double priceIPhoneRam,
                         Double priceProScreen, Double priceScreen) {

        observers = new ArrayList<Observer>();
        this.priceIPhone13Chipset = priceIPhone13Chipset;
        this.priceIphoneXChipset = priceIphoneXChipset;
        this.priceSansungChipset = priceSansungChipset;
        this.priceIphoneMomory = priceIphoneMomory;
        this.priceSansungMemory = priceSansungMemory;
        this.priceSansungProMemory = priceSansungProMemory;
        this.priceSansungRam = priceSansungRam;
        this.priceIPhoneRam = priceIPhoneRam;
        this.priceProScreen = priceProScreen;
        this.priceScreen = priceScreen;
    }

    @Override
    public void addObservers(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this.priceIPhone13Chipset, this.priceIphoneXChipset, this.priceSansungChipset, this.priceIphoneMomory,
                     this.priceSansungMemory, this.priceSansungProMemory, this.priceIPhoneRam, this.priceSansungRam,
                     this.priceProScreen, this.priceScreen);
        }
    }

    public void setPriceIPhone13Chipset(Double priceIPhone13Chipset) {
        this.priceIPhone13Chipset = priceIPhone13Chipset;
        notifyObservers();
    }

    public void setPriceIphoneXChipset(Double priceIphoneXChipset) {
        this.priceIphoneXChipset = priceIphoneXChipset;
        notifyObservers();
    }

    public void setPriceSansungChipset(Double priceSansungChipset) {
        this.priceSansungChipset = priceSansungChipset;
        notifyObservers();
    }

    public void setPriceIphoneMomory(Double priceIphoneMomory) {
        this.priceIphoneMomory = priceIphoneMomory;
        notifyObservers();
    }

    public void setPriceSansungMemory(Double priceSansungMemory) {
        this.priceSansungMemory = priceSansungMemory;
        notifyObservers();
    }

    public void setPriceSansungProMemory(Double priceSansungProMemory) {
        this.priceSansungProMemory = priceSansungProMemory;
        notifyObservers();
    }

    public void setPriceSansungRam(Double priceSansungRam) {
        this.priceSansungRam = priceSansungRam;
        notifyObservers();
    }

    public void setPriceIPhoneRam(Double priceIPhoneRam) {
        this.priceIPhoneRam = priceIPhoneRam;
        notifyObservers();
    }

    public void setPriceProScreen(Double priceProScreen) {
        this.priceProScreen = priceProScreen;
        notifyObservers();
    }

    public void setPriceScreen(Double priceScreen) {
        this.priceScreen = priceScreen;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }



}
