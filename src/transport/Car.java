package transport;

import driver.DriverB;

public class Car <T extends DriverB> extends Transport implements Competing {
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void drive(T driver){
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + this + " и будет учавствовать в заезде.");
    }
    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + this + "заехал на пит-стоп");
    }
}
