import facade.PhoneFacade;
import factory.IPhone13Factory;
import factory.IPhoneXFactory;
import factory.Sansung12Factory;
import model.Phone;
import observer.HardwarePrice;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {

		HardwarePrice hardwarePrice = new HardwarePrice(600.0,500.0,600.0,
				400.0,300.0,400.0,600.0,500.0,350.0,300.0);

		PhoneFacade phoneFacade = new PhoneFacade(Sansung12Factory.INSTANCE, IPhone13Factory.INSTANCE, IPhoneXFactory.INSTANCE, hardwarePrice);

		Phone sansung12Pro = phoneFacade.createSansung12Pro();
		Phone sansung12 = phoneFacade.createSangung12();
		Phone iPhone13Pro = phoneFacade.createIPhone13Pro();
		Phone iPhone13 = phoneFacade.createIPhone13();
		Phone iPhoneX = phoneFacade.createIPhoneX();
		Phone iPhoneXS = phoneFacade.createIPhoneXS();

		hardwarePrice.setPriceIPhone13Chipset(1600.0);
		hardwarePrice.setPriceSansungChipset(1600.0);
		hardwarePrice.setPriceIphoneXChipset(1500.0);

		phoneFacade.presentation();
	}
}
