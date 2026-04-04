package com.pluralsight;

public class switch_statement {
    public static void main(String[] args) {
         double value1 = 25.0d;
         double value2 = 5.0d;
         double result = 0.0d;
         char choice = 'a';

         switch(choice) {
             case 'a':
                 result = value1 + value2;
                 break;
             case 's':
                 result = value1 - value2;
                 break;
             case 'm':
                 result = value1 * value2;
                 break;
             case 'd':
                 if (value2 != 0) {
                     result = value1 / value2;
                 }
                 break;
             default:
                 System.out.println("Invalid choice");
                 result = 0.0d;
                 break;
         }

        System.out.println(result);

    }
}
