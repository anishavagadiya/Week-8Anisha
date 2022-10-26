package encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting value of variables
        obj.setName("Anisha");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());

        //Direct access of rollno is not possible due to encapsulation
      //  System.out.println("Prime's rollNo : " + obj.geekName);

    }

}