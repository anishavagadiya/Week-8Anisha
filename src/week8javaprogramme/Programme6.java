package week8javaprogramme;

import java.util.Scanner;




public class Programme6 {
    public static void main(String[] args) {
        int i; //declare int.
        int j;
        int n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }

    }


}
