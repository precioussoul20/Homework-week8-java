package cylinder19;

public class Circle {

    double radius;

    // constructor
    public Circle(double radius){
        if (radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
