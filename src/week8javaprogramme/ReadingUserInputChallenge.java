package week8javaprogramme;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while ((count<=10)){
            System.out.println("Enter number # :" + count);
            boolean validNumber = scanner.hasNextInt();
            if(validNumber) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            }else{
                System.out.println("Invalid Num,ber");

            }
            scanner.nextInt();
        }
        System.out.println(("The sum of all 10 numbers is: " + sum));
        scanner.close();
    }



}
