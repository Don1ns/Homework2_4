package transport;

import driver.DriverB;


public class Car extends Transport<DriverB> implements Competing {
    public enum CarType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String type;

        CarType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getType();
        }
    }

    private CarType carType;

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void printType() {
        if (getCarType() != null){
            System.out.println(getCarType());
        }
        else{
            System.out.println("Данных по транспортному стредству недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + this + "заехал на пит-стоп");
    }
}
