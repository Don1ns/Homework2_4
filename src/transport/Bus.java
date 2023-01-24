package transport;

import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competing {
    public enum BusType {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60,80),
        ESPECIALLY_LARGE(100,120);

        private final Integer lowerBoundType;
        private final Integer upperBoundType;

        BusType(Integer lowerBoundType, Integer upperBoundType) {
            this.lowerBoundType = lowerBoundType;
            this.upperBoundType = upperBoundType;
        }

        public Integer getLowerBoundType() {
            return lowerBoundType;
        }

        public Integer getUpperBoundType() {
            return upperBoundType;
        }

        @Override
        public String toString() {
            if (getLowerBoundType() == null && getUpperBoundType() != null) {
                return "Вместимость: до " + getUpperBoundType() + " мест";
            } else if (getLowerBoundType() != null && getUpperBoundType() == null) {
                return "Вместимость: от " + getLowerBoundType() + " мест";
            }
            return "Вместимость: " + getLowerBoundType() + " - " + getUpperBoundType() + " мест";
        }
    }
    private BusType busType;
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    @Override
    public void getDiagnose(DriverD driver) {
        System.out.println("Автобусы не могут проходить диагностику.");
    }

    @Override
    public void printType() {
        if (getBusType() != null){
            System.out.println(getBusType());
        }
        else{
            System.out.println("Данных по транспортному стредству недостаточно");
        }
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус " + this + "заехал на пит-стоп");
    }
}
