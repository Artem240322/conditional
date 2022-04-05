package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке ");
        int clientAnd = 1;
        if (clientAnd == 1)
            System.out.println("Установите версию приложения для Android по ссылке ");


        // Задача 2
        int iOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке ");
        int Android = 1;
        if (clientAnd == 1)
            System.out.println("Установите версию приложения для Android по ссылке ");
        int clientDeviceYearOs = 2014;
        if (clientDeviceYearOs >= 2015) {
            System.out.println("Установить ПО по ссылке ");
        } else if (clientDeviceYearOs < 2015) {
            System.out.println("Установить облегченную версию ПО ");
        }


        // Задача 3

        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " не является высокосным");
        }

        // Задача 4
        int deliveryDistances = 17;
        int deliveryDays = 1;
        if (deliveryDistances <= 20) {
            System.out.println("доставка займет " + deliveryDays);
        } else if (deliveryDistances > 20 && deliveryDistances < 60) {
            System.out.println("доставка займет " + (deliveryDays + 1));
        } else if (deliveryDistances > 60 && deliveryDistances < 100) {
            System.out.println("доставка займет " + (deliveryDays + 2));
        } else {
            System.out.println("на такое расстояние не ездят");
        }


        // Задача 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Зима");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}


