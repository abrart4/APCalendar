public class APCalendar {
    private static int[] daysOfMonths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        int numberOfLeapYears = 0;
        for (int i = year1; i <= year2; i ++) {
            if (isLeapYear(i)) {
                numberOfLeapYears ++;
            }
        }
        return numberOfLeapYears;
    }

    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) {
        int accumulator = 0;
        for (int i = 1; i <= year; i ++) {
            accumulator ++;
            if (isLeapYear(i - 1)) {
                accumulator ++;
            }
        }
        return (accumulator - 2) % 7;
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        int accumulator = 0;
        for (int i = 1; i < month; i ++) {
            accumulator += daysOfMonths[i - 1];
        }
        accumulator += day;
        if (isLeapYear(year) && month > 2) {
            accumulator ++;
        }
        return accumulator;
    }
    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year) {
        int dayOfYear = dayOfYear(month, day, year);
        int firstDayOfYear = firstDayOfYear(year);
        return (dayOfYear + firstDayOfYear) % 7;
    }

    /* Calls isLeapYear to allow for testing private method from outside */
    public static boolean isLeapYear$test(int year) {
        return isLeapYear(year);
    }

    /* Calls firstDayOfYear to allow for testing private method from outside */
    public static int firstDayOfYear$test(int year) {
        return firstDayOfYear(year);
    }

    /* Calls dayOfYear to allow for testing private method from outside */
    public static int dayOfYear$test(int month, int day, int year) {
        return dayOfYear(month, day, year);
    }
}