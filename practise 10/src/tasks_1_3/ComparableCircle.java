package tasks_1_3;

public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public boolean equals(Object obj) {
        return obj instanceof ComparableCircle && getArea() == ((ComparableCircle)obj).getArea();
    }
}