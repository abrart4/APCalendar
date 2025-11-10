public class Main {
    public static void main(String[] args) {
        print("Testing isLeapYear");
        print(APCalendar.isLeapYear$test(1)); // expected: false
        print(APCalendar.isLeapYear$test(4)); // expected: true
        print(APCalendar.isLeapYear$test(93)); // expected: false
        print(APCalendar.isLeapYear$test(100)); // expected: false
        print(APCalendar.isLeapYear$test(400)); // expected: true
        print(APCalendar.isLeapYear$test(2024)); // expected: true
        print(APCalendar.isLeapYear$test(2025)); // expected: false
        print("Testing numberOfLeapYears");
        print(APCalendar.numberOfLeapYears(0, 2025)); // expected: somewhere near 490
        print(APCalendar.numberOfLeapYears(41, 67)); // expected: 6
        print(APCalendar.numberOfLeapYears(2016, 2019)); // expected: 1
        print(APCalendar.numberOfLeapYears(2010, 2020)); // expected: 3
        print(APCalendar.numberOfLeapYears(2024, 2024)); // expected: 1
        print(APCalendar.numberOfLeapYears(2024, 2025)); // expected: 1

        print("Testing firstDayOfYear");
        print(APCalendar.firstDayOfYear$test(1)); // expected: 1 (assume january 1st, 0001 is a monday)
        print(APCalendar.firstDayOfYear$test(2019 /* ap test case */)); // expected: 2
        print(APCalendar.firstDayOfYear$test(2020)); // expected: 3
        print(APCalendar.firstDayOfYear$test(2025)); // expected: 3
        print("Testing dayOfYear");
        print(APCalendar.dayOfYear$test(3 /* ap test case */, 1, 2017)); // expected: 60
        print(APCalendar.dayOfYear$test(3 /* ap test case */, 1, 2016)); // expected: 61
        print(APCalendar.dayOfYear$test(12, 31, 2024)); // expected: 366
        print(APCalendar.dayOfYear$test(12, 31, 2025)); // expected: 365
        print("Testing dayOfWeek");
        print(APCalendar.dayOfWeek(1, 5 /* ap test case */, 2019)); // expected: 6
        print(APCalendar.dayOfWeek(1, 10 /* ap test case */, 2019)); // expected: 4
        print(APCalendar.dayOfWeek(3, 23, 2024)); // expected: 6
        print(APCalendar.dayOfWeek(11, 3, 2025)); // expected: 1
        print(APCalendar.dayOfWeek(11, 6, 2025)); // expected: 4
    }

    private static void print(Object text) {
        System.out.println(text);
    }
}
