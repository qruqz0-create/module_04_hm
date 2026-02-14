import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehicleFactory factory = null;

        System.out.println("Выберите транспорт:");
        System.out.println("1 - Автомобиль");
        System.out.println("2 - Мотоцикл");
        System.out.println("3 - Грузовик");
        System.out.println("4 - Автобус");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Марка: ");
                String brand = scanner.nextLine();

                System.out.print("Модель: ");
                String model = scanner.nextLine();

                System.out.print("Тип топлива: ");
                String fuel = scanner.nextLine();

                factory = new CarFactory(brand, model, fuel);
                break;

            case 2:
                System.out.print("Тип мотоцикла: ");
                String type = scanner.nextLine();

                System.out.print("Объем двигателя: ");
                int volume = scanner.nextInt();

                factory = new MotorcycleFactory(type, volume);
                break;

            case 3:
                System.out.print("Грузоподъемность: ");
                double load = scanner.nextDouble();

                System.out.print("Количество осей: ");
                int axles = scanner.nextInt();

                factory = new TruckFactory(load, axles);
                break;

            case 4:
                System.out.print("Количество пассажиров: ");
                int passengers = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Тип топлива: ");
                String busFuel = scanner.nextLine();

                factory = new BusFactory(passengers, busFuel);
                break;

            default:
                System.out.println("Неверный выбор");
                return;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}

