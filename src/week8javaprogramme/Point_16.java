package week8javaprogramme;

public class Point_16 {
    int x;
    int y;

    public Point_16() {

    }
    public Point_16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(){
        this.x=x;
    }
    public void setY(){
        this.y=y;
    }
    public double distance(){
        return distance(0, 0);
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point_16 secondPoint){
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Point_16 first = new Point_16(6,5);
        Point_16 second = new Point_16(3,1);

        System.out.println("Distance (0,0) = " +first.distance());
        System.out.println("Distance (second) = "+first.distance(second));
        System.out.println("Distance (2,2) = "+first.distance(2,2));

        Point_16 point = new Point_16();
        System.out.println("Distance() = "+point.distance());
    }
}
