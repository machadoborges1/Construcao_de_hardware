package facade;

import factory.PhoneFactory;
import model.Phone;
import model.SingleResponsabilityPrint;
import observer.HardwarePrice;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneFacade {

    PhoneFactory sansung12Factory;
    PhoneFactory iPhone13Factory;
    PhoneFactory iPhoneXFactory;

    HardwarePrice hp;

    public PhoneFacade(PhoneFactory sansung12Factory, PhoneFactory iPhone13Factory, PhoneFactory iPhoneXFactory, HardwarePrice hp) {
        this.sansung12Factory = sansung12Factory;
        this.iPhone13Factory = iPhone13Factory;
        this.iPhoneXFactory = iPhoneXFactory;
        this.hp = hp;
    }

    public Phone createSangung12 () {
        Phone phone = sansung12Factory.orderIPhone("standard");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public Phone createSansung12Pro () {
        Phone phone = sansung12Factory.orderIPhone("highEnd");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public Phone createIPhoneX () {
        Phone phone = iPhoneXFactory.orderIPhone("standard");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public Phone createIPhoneXS () {
        Phone phone = iPhoneXFactory.orderIPhone("highEnd");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public Phone createIPhone13 () {
        Phone phone = iPhone13Factory.orderIPhone("standard");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public Phone createIPhone13Pro () {
        Phone phone = iPhone13Factory.orderIPhone("highEnd");
        hp.addObservers(phone);
        hp.notifyObservers();
        phoneInformation(phone);
        return phone;
    }

    public void phoneInformation(Phone phone) {
        SingleResponsabilityPrint.phoneInformation(phone);
        SingleResponsabilityPrint.phonePrice(phone);
    }

    public void presentation() {
        System.out.println("Criando Celulares ---------------------------------\n");
        this.createSansung12Pro();
        this.createSangung12();
        this.createIPhone13Pro();
        this.createIPhone13();
        this.createIPhoneX();
        this.createIPhoneXS();
        System.out.println("----------------------------------------------------\n");

        System.out.println("Lista de celulares ---------------------------------\n");
        System.out.println(hp.getObservers());
        System.out.println("----------------------------------------------------\n");
    }
}
