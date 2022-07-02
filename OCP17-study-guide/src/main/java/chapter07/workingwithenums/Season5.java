package chapter07.workingwithenums;

public enum Season5 implements Weather {
    WINTER, SPRING, SUMMER, FALL;

    public int getAverageTemperature() {
        return 30;
    }
}