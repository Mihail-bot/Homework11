public class Main {

    public static void opredelenieVisokosnosti(int year)

    {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не яляется високосным.");
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Задание 1");
        int year = 2024;
        opredelenieVisokosnosti(year);


    }


}