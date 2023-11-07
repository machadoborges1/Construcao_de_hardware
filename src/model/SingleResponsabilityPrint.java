package model;

public abstract class SingleResponsabilityPrint {

    public static void phoneInformation(Phone phone) {
        System.out.println("----------------------------------\n" +
                "Nunero de serie: " + phone);
        System.out.println("\nHardware: ");
        phone.ram();
        phone.memory();
        phone.chipset();
        phone.chipset();
    }

    public static void phonePrice(Phone phone) {
        System.out.println("\n\t- price: " + phone.getPrice() + "\n");
    }
}
