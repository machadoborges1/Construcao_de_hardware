package factory;

import model.*;

public class Sansung12Factory extends PhoneFactory{

    public static final Sansung12Factory INSTANCE = new Sansung12Factory();
    private Sansung12Factory(){
    }
    public Phone createPhone(String level) {
        if(level.equals("standard")) {
            return new Sansung12();
        } else if(level.equals("highEnd")) {
            return new Sansung12Pro();
        } else return null;
    }

}
