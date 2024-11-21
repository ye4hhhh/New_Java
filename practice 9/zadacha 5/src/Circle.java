
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5),
                new Circle(.99),
                new Circle(1.3),
                new Circle(2)
        };

        int index = 0;

        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > circles[index].getArea()) {
                index = i;
            }
        }

        System.out.println("Индекс круга с наибольшей площадью:" + (index + 1));
    }
}