package chapter07.working_with_enums;

public enum Season3 {

    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {
            return "9am-5pm";
        }
    }, SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    FALL {
        public String getHours() {
            return "9am-5pm";
        }
    };

    public abstract String getHours();
}
