package tasks_4_6;

public class TestGeometricObject2 {
    public static void main(String[] args) {
        // Объявить и инициализировать два геометрические фигуры
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("Одинаковая ли площадь у двух фигур? " +
                equalArea(geoObject1, geoObject2));

        // Отобразить информацию о круге
        displayGeometricObject(geoObject1);

        // Отобразить информацию о прямоугольнике
        displayGeometricObject(geoObject2);
    }

    /** Метод для сравнения площади двух геометрических фигур */
    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /** Метод для отображения информации о геометрической фигуре */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("Площадь равна " + object.getArea());
        System.out.println("Периметр равен " + object.getPerimeter());
    }

}