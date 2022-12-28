package hw_enum;

import hw_enum.driver.DriverB;
import hw_enum.driver.DriverC;
import hw_enum.driver.DriverD;
import hw_enum.transport.Bus;
import hw_enum.transport.Car;
import hw_enum.transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Car ps1 = new Car("Lada", "Vesta", 1.7, Car.BodyType.SEDAN);
        Car ps2 = new Car("Audi", "A8", 3.0, Car.BodyType.UNIVERSAL);
        Car ps3 = new Car("Mazda", "RX8", 2.5, Car.BodyType.HATCHBACK);
        Car ps4 = new Car("VW", "Polo Sedan", 1.6, Car.BodyType.MINIVAN);

        Trucks tr1 = new Trucks("Volvo", "FH12", 13.0, Trucks.LoadCapacity.N1);
        Trucks tr2 = new Trucks("Scania", "FH12", 14.5, Trucks.LoadCapacity.N2);
        Trucks tr3 = new Trucks("KAMAZ", "FH12", 15.0, Trucks.LoadCapacity.N3);
        Trucks tr4 = new Trucks("MercedesBenz", "Actos", 16.5, Trucks.LoadCapacity.N1);

        Bus MAZ1 = new Bus("MAZ", "203", 10.0, Bus.TypeOfCapacity.BIG);
        Bus MAZ2= new Bus("MAZ", "205", 11.5, Bus.TypeOfCapacity.AVERAGE);
        Bus MAZ3 = new Bus("MAZ", "206", 12, Bus.TypeOfCapacity.ESPECIALLY_BIG);
        Bus MAZ4 = new Bus("MAZ", "207", 12.5, Bus.TypeOfCapacity.ESPECIALLY_SMALL);

        DriverB ivan = new DriverB("Ivan");
        DriverC sergey = new DriverC("Sergey");
        DriverD semen = new DriverD("Semen");

        ps2.printType();
        tr1.printType();
        MAZ1.printType();

    }
}
