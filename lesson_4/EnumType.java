public class EnumType {
    enum Week {
        MONDAY(2),
        TUEDAY(3);

        private int value;

        Week(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Week{" +
                    "value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        Week w = Week.TUEDAY;

        System.out.println("Enum Week: " + w.value);

        switch (w) {
            case MONDAY:
                break;
            case TUEDAY:
                break;

        }
    }
}