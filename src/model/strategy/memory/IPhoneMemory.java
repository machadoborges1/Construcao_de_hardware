package model.strategy.memory;

public class IPhoneMemory implements MemoryStrategy{

    @Override
    public void memory() {
        System.out.println("\t- 256Gb Memory");
    }
}
