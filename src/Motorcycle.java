public class Motorcycle implements IVehicle {
    private String type;
    private int engineVolume;

    public Motorcycle(String type, int engineVolume) {
        this.type = type;
        this.engineVolume = engineVolume;
    }

    @Override
    public void drive() {
        System.out.println("Мотоцикл типа " + type + " движется.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка мотоцикла бензином.");
    }
}

