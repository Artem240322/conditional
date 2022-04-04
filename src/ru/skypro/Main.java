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
        int and = 0;
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
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}


