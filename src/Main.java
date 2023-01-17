import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import exception.NoLicenseException;
import transport.Bus;
import transport.Car;
import transport.Truck;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
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

        DriverB marat = new DriverB("Степанов Марат Кузнецов",false, 8);
        DriverC andrey = new DriverC("Александров Андрей Михаилович",true, 10);
        DriverD ivan = new DriverD("Степанов Иван Андреевич",true, 10);
        System.out.println(bmw);
        System.out.println(sprinter);
        System.out.println(actros);

        audi.pitStop();
        sprinter.pitStop();
        kamazExtreme.pitStop();

        bmw.drive(marat);
        kamazExtreme.drive(andrey);
        sprinter.drive(ivan);

        bmw.setCarType(Car.CarType.COUPE);
        bmw.printType();
        try{
            bmw.getDiagnose(marat);
        }
        catch (NoLicenseException e){
            System.out.println("Произошла ошибка с водителем " + e.getDriver().getFullName());
            System.out.println(e.getMessage());
        }
    }
//    public static void getDiagnose(Transport transport, Driver driver){
//       try{
//           transport.getDiagnose(driver);
//       }
//       catch (NoLicenseException e){
//           System.out.println("Произошла ошибка с водителем " + e.getDriver().getFullName());
//           System.out.println(e.getMessage());
//       }
//    }
}