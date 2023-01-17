package transport;

import driver.Driver;
import exception.NoLicenseException;

import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private float engineVolume;
    private float bestLapTime;
    private int maxSpeed;


    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }

    public void drive(T driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + this + " и будет учавствовать в заезде.");
    }

    public abstract void printType();

    public void getDiagnose(T driver) throws NoLicenseException {

    }

    @Override
    public void setBestLapTime(float bestLapTime) {
        if (bestLapTime > 0) {
            this.bestLapTime = bestLapTime;
        }
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public float getBestLapTime() {
        return this.bestLapTime;
    }

    @Override
    public float getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume + " л.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Float.compare(transport.bestLapTime, bestLapTime) == 0 && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }


}
