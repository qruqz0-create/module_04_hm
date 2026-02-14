public class BusFactory extends VehicleFactory {
    private int passengers;
    private String fuelType;

    public BusFactory(int passengers, String fuelType) {
        this.passengers = passengers;
        this.fuelType = fuelType;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(passengers, fuelType);
    }
}

