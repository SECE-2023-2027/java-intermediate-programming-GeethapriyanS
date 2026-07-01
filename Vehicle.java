import java.util.Scanner;

public class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press Enter to run vehicle demo...");
        scanner.nextLine();

        Vehicle[] vehicles = {new Car(), new Motorcycle()};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.startEngine());
        }

        scanner.close();
    }

    static class Car extends Vehicle {
        @Override
        public String startEngine() {
            return "Car engine roars";
        }
    }

    static class Motorcycle extends Vehicle {
        @Override
        public String startEngine() {
            return "Motorcycle engine revs";
        }
    }
}
