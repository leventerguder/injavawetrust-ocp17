package chapter07.working_with_enums;

public enum Season5 implements Weather {
    WINTER, SPRING, SUMMER, FALL;

    public int getAverageTemperature() {
        return 30;
    }
}