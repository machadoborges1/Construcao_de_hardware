package model.strategy.ram;

public class SansungRam implements RamStrategy{

    @Override
    public void ram() {
        System.out.println("\t- 8Gb RAM");
    }
}
