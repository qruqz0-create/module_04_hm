public class Truck implements IVehicle {
    private double loadCapacity;
    private int axles;

    public Truck(double loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Грузовик с грузоподъемностью " + loadCapacity + " т едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка грузовика дизелем.");
    }
}

