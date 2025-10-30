public class Main {
    public static void main(String[] args) {
        System.out.println(APCalendar.numberOfLeapYears(0, 2025));
        System.out.println(APCalendar.numberOfLeapYears(41, 67));
        System.out.println(APCalendar.numberOfLeapYears(2016, 2019));
        System.out.println(APCalendar.numberOfLeapYears(2010, 2020));
        System.out.println(APCalendar.numberOfLeapYears(2024, 2024));
        System.out.println(APCalendar.numberOfLeapYears(2024, 2025));
        System.out.println();
        System.out.println(APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println(APCalendar.dayOfWeek(1, 10, 2019));
    }
}
