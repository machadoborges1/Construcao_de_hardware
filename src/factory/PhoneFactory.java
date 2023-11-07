package factory;

import model.Phone;

public abstract class PhoneFactory {

	public Phone orderIPhone(String level) {
		Phone phone = null;
		
		phone = createPhone(level);

		phone.assemble();
		phone.certificates();
		phone.pack();
		
		return phone;
	}
	
	protected abstract Phone createPhone(String level);

}
