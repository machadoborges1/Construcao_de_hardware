package model.strategy.ram;

public class IPhoneXRam implements RamStrategy{



    @Override
    public void ram() {
        System.out.println("\t- 4Gb RAM");
    }
}
