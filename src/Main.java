import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2020;
        printTypeYear(year);
        System.out.println("Task 2");
        int systemPhone = 0;
        int currentYear = LocalDate.now().getYear();
        checkPhoneSystem(systemPhone,currentYear);
        System.out.println("Task3");
        int distance = deliveryDistance(9);
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

    public static void checkPhoneSystem(int systemPhone, int currentYear) {
        if (systemPhone < 0 || systemPhone >1 ){
            System.out.println("Такая система не поддерживается введите 0(iOS)  или 1(Android)");
            return;
        }
        if (systemPhone==0) {
            System.out.println("Система телефона iOS");
        } else {
            System.out.println("Система телефона Android");
        }
        if (currentYear > 2015) {
            System.out.println("Установите нормальную версию приложения по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения по ссылке");
        }
    }

    public static int deliveryDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Для доставки потребуется дней: 1" );
        } else if (distance >= 20 && distance <= 60) {
            System.out.println("Для доставки потребуется дней: 2");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Для доставки потребуется дней: 3");
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
        return distance;
    }
}