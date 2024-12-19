public class task6 {
    public static void main(String[] args) {

        Circle[][] circles = {
                {new Circle(2.2), new Circle(3.4)},
                {new Circle(9.3), new Circle(5.6)},
                {new Circle(1.1), new Circle(7.8)}
        };

        Circle largestCircle = findLargest(circles);

        System.out.println("Largest circle: " + largestCircle);
    }

    public static Circle findLargest(Circle[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        Circle largest = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].compareTo(largest) > 0) {
                    largest = array[i][j];
                }
            }
        }
        return largest;
    }
}