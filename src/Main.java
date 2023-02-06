public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2020;
        printTypeYear(year);
        System.out.println("Task 2");
        String phone = "iOS";
        int yearDevice = 2014;
        checkPhoneSystem(phone);
        printResultOfYear(yearDevice);
        System.out.println("Task3");
        int distance = 10;
        deliveryDistance(distance);
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

    public static boolean clientDeviceYear(int year) {
        return year > 2015;
    }

    public static void printResultOfYear(int year) {
        if (clientDeviceYear(year)) {
            System.out.println("Установите нормальную версию приложения по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения  по ссылке");
        }
    }

    public static void checkPhoneSystem(String systemPhone) {
        if (systemPhone.equals("Android")) {
            System.out.println("Система телефона Android");
        } else {
            System.out.println("Система телефона iOS");
        }
    }

    public static void deliveryDistance(int deliveryDistance) {
        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            int delivery = deliveryDay + 1;
            System.out.println("Для доставки потребуется дней: " + delivery);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int delivery2 = deliveryDay + 2;
            System.out.println("Для доставки потребуется дней: " + delivery2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            int delivery3 = deliveryDay + 3;
            System.out.println("Для доставки потребуется дней: " + delivery3);
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
    }
}