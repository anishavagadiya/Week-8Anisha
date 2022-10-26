package week8javaprogramme;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        int n, count = 0,a,b,c,sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number you want to check: ");
        n = scanner.nextInt();
        a = n;
        c = n;
        while (a>0){
            a = a/10;
            count++;

        }
        while (n > 0) {
            b=n%10;
            sum = (int)(sum+Math.pow(b,count));
            n = n/10;
        }
        if (sum == c){
            System.out.println("Given number is Armstrong");

        }else {
            System.out.println("Given number isnot Armstrong");
            scanner.close();
        }
    }


}
