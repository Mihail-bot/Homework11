public class Main {

    public static void opredelenieVisokosnosti(int year)

    {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не яляется високосным.");
        }
    }

public static void opredelenieOsYear(int clientOs,int clientDeviceYear) {
    if (clientDeviceYear < 2015 && clientOs == 0) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
    } else if (clientDeviceYear < 2015 && clientOs != 0) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке.");

    } else if (clientDeviceYear >= 2015 && clientOs == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");

    } else {
        System.out.println("Установите версию приложеия для Andrioid по ссылке.");
    }
}
public static int day(int deliveryDistance) {
    int day;
    if (deliveryDistance > 100) {
        day=0;
    } else if (deliveryDistance <= 20) {
        day=1;
    } else if (deliveryDistance > 60) {
        day=3;
    } else {
        day=2;
    }
    return day;
}
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Задание 1");
        int year = 2024;
        opredelenieVisokosnosti(year);
        System.out.println("Задание 2");
        opredelenieOsYear(1,2013);
        System.out.println("Задание 3");
        int deliveryDistance=95;
        if (day(deliveryDistance)==0) {
            System.out.println("Доставки нет, слишком далеко это.");
        }else{
            System.out.println("Потребуется дней на доствку: " + day(deliveryDistance));
        }
        }


}