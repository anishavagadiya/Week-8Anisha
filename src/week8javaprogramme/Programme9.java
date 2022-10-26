package week8javaprogramme;
// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Programme9 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=15;
        System.out.println(n1+ " "+n2);
        for (i=2;i<count;++i){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }


}
