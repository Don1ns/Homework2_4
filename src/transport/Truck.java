package transport;

import driver.DriverC;

public class Truck extends Transport<DriverC> implements Competing {
    public enum TruckType {
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);

        private final Float lowerBoundType;
        private final Float upperBoundType;

        TruckType(Float lowerBoundType, Float upperBoundType) {
            this.lowerBoundType = lowerBoundType;
            this.upperBoundType = upperBoundType;
        }

        public Float getLowerBoundType() {
            return lowerBoundType;
        }

        public Float getUpperBoundType() {
            return upperBoundType;
        }

        @Override
        public String toString() {
            if (getLowerBoundType() == null && getUpperBoundType() != null) {
                return "Грузоподъемность: до " + getUpperBoundType() + " тонн";
            } else if (getLowerBoundType() != null && getUpperBoundType() == null) {
                return "Грузоподъемность: от " + getLowerBoundType() + " тонн";
            }
            return "Грузоподъемность: от " + getLowerBoundType() + " тонн до " + getUpperBoundType() + " тонн";
        }
    }

    private TruckType truckType;

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    @Override
    public void getDiagnose(DriverC driver) {
        System.out.println(this + " проходит диагностику.");
    }

    @Override
    public void printType() {
        if (getTruckType() != null){
            System.out.println(getTruckType());
        }
        else{
            System.out.println("Данных по транспортному стредству недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + this + "заехал на пит-стоп");
    }
}
