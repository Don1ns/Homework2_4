package transport;

public interface Competing {
    void pitStop();

    float getBestLapTime();

    float getMaxSpeed();

    void setBestLapTime(float time);

    void setMaxSpeed(int maxSpeed);
}
