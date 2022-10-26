package abstractexample23;

class TestAbstraction1 {
    //in real scenario, method is called by programmer to user
    public static void main(String[] args) {
        Shape s = new Circle1(); //In real scenario,object is provided through method, e,g., getShape() method
        s.draw();
    }
}
