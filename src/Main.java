import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import exception.NoLicenseException;
import transport.Bus;
import transport.Car;
import transport.Truck;
import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoLicenseException {
        List<Transport<?>> transportList = new ArrayList<>();
        List<Driver> driversList = new ArrayList<>();
        List<Mechanic<?>> mechanicList = new ArrayList<>();

        Car bmw = new Car("BMW", "i8", (float) 1.5);
        Car audi = new Car("Audi", "R8", (float) 4.2);
        Car mercedes = new Car("Mercedes-AMG", "GT", (float) 4.0);
        Car kia = new Car("Kia", "Stinger", (float) 2.2);

        Bus sprinter = new Bus("Mercedes-Benz", "Sprinter 214", (float) 2.1);
        Bus nefaz = new Bus("НефАЗ", "1234", (float) 2.3);
        Bus kamaz = new Bus("КамАЗ", "9898", (float) 2.6);
        Bus maz = new Bus("МАЗ", "251", (float) 2.4);

        Truck kamazExtreme = new Truck("Камаз", "4911 Extreme", (float) 17.2);
        Truck kamazSport = new Truck("Камаз", "4326-9", (float) 18.4);
        Truck actros = new Truck("Mercedes-Benz", "Actros", (float) 11.9);
        Truck mazR = new Truck("МАЗ", "6440RR", (float) 12.5);

        DriverB marat = new DriverB("Степанов Марат Кузнецов", true, 8);
        DriverC andrey = new DriverC("Александров Андрей Михаилович", true, 10);
        DriverD ivan = new DriverD("Степанов Иван Андреевич", true, 10);

        Mechanic<?> artem = new Mechanic<>("Никитин Артем Анатаолиевич", "MechPRO");
        Mechanic<?> ilia = new Mechanic<>("Артемов Илья Анатаолиевич", "MechPRO");
        Mechanic<?> alexey = new Mechanic<>("Чуклин Алексей Михайлович", "Русский Механик");

        System.out.println(bmw);
        System.out.println(sprinter);
        System.out.println(actros);

        transportList.add(audi);
        transportList.add(nefaz);
        transportList.add(mazR);
        System.out.println(transportList.size());

        driversList.add(marat);
        driversList.add(andrey);
        driversList.add(ivan);
        System.out.println(driversList.size());

        mechanicList.add(artem);
        mechanicList.add(ilia);
        mechanicList.add(alexey);
        System.out.println(driversList.size());
    }

    public static <T extends Driver> void drive(Transport<T> transport, T driver) {
        try {
            transport.drive(driver);
        } catch (NoLicenseException e) {
            System.out.println("Произошла ошибка с водителем " + e.getDriver().getFullName());
            System.out.println(e.getMessage());
        }
    }
}