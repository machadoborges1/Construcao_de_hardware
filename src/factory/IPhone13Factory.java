package factory;

import model.Phone;
import model.IPhone13;
import model.IPhone13Pro;

public class IPhone13Factory extends PhoneFactory {

	public static final IPhone13Factory INSTANCE = new IPhone13Factory();
	private IPhone13Factory(){
	}
	public Phone createPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone13();
		} else if(level.equals("highEnd")) {
			return new IPhone13Pro();
		} else return null;
	}

}
