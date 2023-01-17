package exception;

import driver.Driver;

public class NoLicenseException extends Exception{
    private final Driver driver;
    public NoLicenseException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
