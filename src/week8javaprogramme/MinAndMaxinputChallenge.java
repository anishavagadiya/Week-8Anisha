package week8javaprogramme;

import java.util.Scanner;

public class MinAndMaxinputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,max,min;
        System.out.println("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the another Number: ");
        num2 = scanner.nextInt();
        max=Math.max(num1,num2);
        min=Math.min(num1,num2);
        while (num2!=-99){
            System.out.println("Enter a Number or -99 to stop: ");
            num2 = scanner.nextInt();
            if(num2!=-99){
                max=Math.max(max,num2);
                min=Math.min(min,num2);
            }
        }
        System.out.println("largest is: "+max);
        System.out.println("smallest is: "+min);
        scanner.close();
    }


}
