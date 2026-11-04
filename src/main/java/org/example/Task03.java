package org.example;

public class Task03 {
    static void main() {

        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for(int i = 0; i < testResults.length; i++){
            if(testResults[i] == 1){
            passed++;}
            else
                failed++;
            }
            System.out.println("passed " + passed);
            System.out.println("feiled " + failed);
        }

    }


