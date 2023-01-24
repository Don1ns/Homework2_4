package driver;

import java.util.Objects;

public abstract class Driver{
    private String fullName;
    private boolean driverLicense;
    private int drivingExperience;

    public Driver(String fullName,boolean driverLicense, int drivingExperience) {
        this.driverLicense = driverLicense;
        setFullName(fullName);
        setDrivingExperience(drivingExperience);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if(drivingExperience < 0){
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "Водитель " + this.fullName + ". Стаж: " + this.drivingExperience +
                ". Наличие прав: " + this.drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, drivingExperience);
    }
}
