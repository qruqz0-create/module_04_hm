public class Bus implements IVehicle {
    private int passengers;
    private String fuelType;

    public Bus(int passengers, String fuelType) {
        this.passengers = passengers;
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println("Автобус на " + passengers + " пассажиров едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка автобуса топливом: " + fuelType);
    }
}
