package transport;

import driver.DriverC;

public class Truck <T extends DriverC> extends Transport implements Competing{
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void drive(T driver){
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + this + " и будет учавствовать в заезде.");
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + this + "заехал на пит-стоп");
    }
}
