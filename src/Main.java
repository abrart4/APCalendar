public class Main {
    public static void main(String[] args) {
        System.out.println(APCalendar.numberOfLeapYears(2020, 2024));
        System.out.println(APCalendar.numberOfLeapYears(2021, 2024));
        System.out.println(APCalendar.numberOfLeapYears(2020, 2025));
        System.out.println();
        System.out.println(APCalendar.firstDayOfYear(1)); // debated
        System.out.println(APCalendar.firstDayOfYear(2019)); // 2 (tuesday)
        System.out.println(APCalendar.firstDayOfYear(2020)); // 3 (wednesday)
        System.out.println(APCalendar.firstDayOfYear(2021)); // 5 (friday)
        System.out.println(APCalendar.firstDayOfYear(2022)); // 6 (saturday)
        System.out.println(APCalendar.firstDayOfYear(2023)); // 0 (sunday)
        System.out.println(APCalendar.firstDayOfYear(2024)); // 1 (monday)
        System.out.println(APCalendar.firstDayOfYear(2025)); // 3 (wednesday)
    }
}
