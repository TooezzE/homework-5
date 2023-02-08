import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if(clientOS == 1){
            System.out.println("Установите версчию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
            switch (clientOS){
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                } else if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения дл IOS по ссылке");
                }
                break;

                case 1:
                    if(clientDeviceYear >= 2015) {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    } else if (clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
                    break;
            }

        }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " это високосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " это високосный год");
        }
        else{
            System.out.println(year + " это не високосный год");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 3));
        } else if(deliveryDistance > 100){
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}