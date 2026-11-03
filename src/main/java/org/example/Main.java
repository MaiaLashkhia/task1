package org.example;

public class Main {
    static void main() {
        double price = 500;
        double discount;
        double finalPrice;

        if (price >= 100) {
            discount = price * 0.10;
            finalPrice = price - discount;
        } else {
            finalPrice = price;
            System.out.println("ფასდაკლება არ ეკუთნის");
        }

        System.out.println("საბოლოო ფასი: " + finalPrice);
    }
}
