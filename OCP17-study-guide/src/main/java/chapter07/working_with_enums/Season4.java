package chapter07.working_with_enums;

public enum Season4 {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    SPRING,
    FALL;

    public String getHours() {
        return "9am-5pm";
    }
}
