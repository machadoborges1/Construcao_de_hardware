package factory;

import model.Phone;
import model.IPhoneX;
import model.IPhoneXSMax;

public class IPhoneXFactory extends PhoneFactory {

	public static final IPhoneXFactory INSTANCE = new IPhoneXFactory();
	private IPhoneXFactory(){
	}
	public Phone createPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
