package org.example;

import java.util.Scanner;

public class Task02 {
    static void main() {

        String userName = "kokuna";
        String password = "ASDasd123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("ჩაწერე მომხმარებლის სახელი: ");
        String correcrUserName = scanner.nextLine();

        System.out.println("ჩაწერე სწორი პაროლი: ");
        String correctPassword = scanner.nextLine();

        if(userName.equals(correcrUserName) && password.equals(correctPassword)){
            System.out.println("Login successful");

        }
        else System.out.println("Invalid username or password");
        scanner.close();
    }
}



