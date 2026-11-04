package org.example;

public class Task05 {
    static void main() {

     String text = "Albert Einstein";

                int vowelCount = 0;
                for (int i = 0; i < text.length(); i++) {
                    char ch = Character. toLowerCase(text.charAt(i));
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                }
                System.out.println("ხმოვანების რაოდენობა: " + vowelCount);


                int length = text.length();
                System.out.println("სტრინგის სიგრძე: " + length);


                if (length % 2 == 0) {
                    System.out.println("ლუწი");
                } else {
                    System.out.println("კენტი");
                }
            }
        }



