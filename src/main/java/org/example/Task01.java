package org.example;

public class Task01 {
    public static void main(String[] args) {

       double price = 1000;
       double discount;
       double finalPrice;

       if(price >= 100){
           discount = price * 0.10;
           finalPrice = price - discount;
           System.out.println(finalPrice);
       }
       else System.out.println(price);
    }
}