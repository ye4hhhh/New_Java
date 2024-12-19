public class task5 {

    public static Circle calcLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null;
        }
        Circle largest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].compareTo(largest) > 0) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(2.2),
                new Circle(4.7),
                new Circle(1.6),
                new Circle(2.7),
                new Circle(9.3)
        };

        Circle largestCircle = calcLargestCircle(circles);
        System.out.println("Largest circle: " + largestCircle);
    }
}