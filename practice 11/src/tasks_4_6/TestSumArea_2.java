package tasks_4_6;

public class TestSumArea_2 {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle(3.0),
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Rectangle(2.0, 3.5)
        };

        double totalArea = GeometricObject.sumArea(objects);

        System.out.println("Общая площадь всех объектов: " + totalArea);
    }
}