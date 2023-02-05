public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2020;
        printTypeYear(year);
    }

    public static boolean checkingTypeOfYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printTypeYear(int year) {
        boolean leapYear = checkingTypeOfYear(year);
        if (leapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год —  невисокосный год");
        }
    }
}