package transport;

import driver.DriverD;

public class Bus <T extends DriverD> extends Transport implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public void drive(T driver){
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + this + " и будет учавствовать в заезде.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + this + "заехал на пит-стоп");
    }
}
