package tasks_1_3;

public class TestColorable {
    public static void main(String[] args) {
        // Создаем массив объектов tasks_1_to_3.GeometricObject
        GeometricObject[] objects = {
                new Circle(2.0),
                new Rectangle(3.0, 4.0),
                new Square(5.0),
                new ComparableRectangle(6.0, 7.0),
                new Square(8.0)
        };

        // Проходим по массиву и выводим площадь и раскрашиваемость объектов
        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            // Если объект реализует интерфейс tasks_1_to_3.Colorable, вызываем howToColor()
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}