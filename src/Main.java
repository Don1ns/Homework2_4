import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car<DriverB> bmw = new Car<>("BMW", "i8", (float) 1.5);
        Car<DriverB> audi = new Car<>("Audi", "R8", (float) 4.2);
        Car<DriverB> mercedes = new Car<>("Mercedes-AMG", "GT", (float) 4.0);
        Car<DriverB> kia = new Car<>("Kia", "Stinger", (float) 2.2);

        Bus<DriverD> sprinter = new Bus<>("Mercedes-Benz", "Sprinter 214", (float) 2.1);
        Bus<DriverD> nefaz = new Bus<>("НефАЗ", "1234", (float) 2.3);
        Bus<DriverD> kamaz = new Bus<>("КамАЗ", "9898", (float) 2.6);
        Bus<DriverD> maz = new Bus<>("МАЗ", "251", (float) 2.4);

        Truck<DriverC> kamazExtreme = new Truck<>("Камаз", "4911 Extreme", (float) 17.2);
        Truck<DriverC> kamazSport = new Truck<>("Камаз", "4326-9", (float) 18.4);
        Truck<DriverC> actros = new Truck<>("Mercedes-Benz", "Actros", (float) 11.9);
        Truck<DriverC> mazR = new Truck<>("МАЗ", "6440RR", (float) 12.5);

        DriverB marat = new DriverB("Степанов Марат Кузнецов", 8);
        DriverC andrey = new DriverC("Александров Андрей Михаилович", 10);
        DriverD ivan = new DriverD("Степанов Иван Андреевич", 10);
        System.out.println(bmw);
        System.out.println(sprinter);
        System.out.println(actros);

        audi.pitStop();
        sprinter.pitStop();
        kamazExtreme.pitStop();

        bmw.drive(marat);
        kamazExtreme.drive(andrey);
        sprinter.drive(ivan);


    }
}