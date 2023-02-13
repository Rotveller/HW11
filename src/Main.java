import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2040;
        checkingTypeOfYear(year);
        System.out.println("Task 2");
        checkPhoneSystem(0, 2014);
        System.out.println("Task3");
        int distance = 01;
        int day = deliveryDistance(distance);
        if (day == 1) {
            System.out.println("Доставка в пределах 20 км занимает сутки");
        } else if (day == 2) {
            System.out.println("Доставка в пределах  от 20 км до 60 км занимает двое суток");
        } else if (day == 3) {
            System.out.println("Доставка в пределах от 60 км до 100 км занимает трое суток");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static boolean checkingTypeOfYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год —  невисокосный год");
        }
        return false;
    }

    public static void checkPhoneSystem(int systemPhone, int currentYear) {
        if (systemPhone == 0 && currentYear > 2015) {
            System.out.println("Установите нормальную версию приложения для iOS по ссылке");
        } else if (systemPhone == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemPhone == 1 && currentYear > 2015) {
            System.out.println("Установите нормальную версию приложения по ссылке");
        } else if (systemPhone == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDistance(int distance) {
        int deliveryDay = 0;
        if (distance <= 20) {
            deliveryDay = deliveryDay+1;
        } else if (distance >= 20 && distance <= 60) {
            deliveryDay = deliveryDay +2;
        } else if (distance >= 60 && distance <= 100) {
            deliveryDay = deliveryDay+3;
        }
        return deliveryDay;
    }
}
