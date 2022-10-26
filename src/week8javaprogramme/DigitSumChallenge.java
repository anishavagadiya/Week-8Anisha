package week8javaprogramme;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class DigitSumChallenge {
    public static void main(String[] args) {

        int number, digit, sum = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the  number to get sum of the digits: ");
        number = read.nextInt();
        while(number>0){
            //finds the last digit of the given number
            digit = number % 10;
            // adds last digit to the variable sum
            sum = sum + digit;
            //removes the last digit from the number
            number = number/10;
        }
        //prints the result
        System.out.println("Sum of digits " + sum);

    }

    }








