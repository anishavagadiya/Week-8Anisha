package week8javaprogramme;

public class Programme5 {
    public static void main(String[] args) {
        System.out.println(IsPalindrome(-1221));
        System.out.println(IsPalindrome(707));
        System.out.println(IsPalindrome(707));

    }
    public static boolean IsPalindrome(int num){
        int rev = 0;
        int oriNumber = num;
        while (num !=0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num /= 10;
        }return oriNumber == rev;
    }


}
