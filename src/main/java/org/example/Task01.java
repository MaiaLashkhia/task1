package org.example;

public class Task01 {
    public static void main(String[] args) {

        double price = 300;
        double discount;
        double finalPrice;

        if (price >= 100) {
            discount = price * 0.10;
            finalPrice = price - discount;
        } else {
            finalPrice = price;
            System.out.println("ფასდაკლება არ გეკუთვნის");
        }

        System.out.println("საბოლოო ფასი: " + finalPrice);
    }
}