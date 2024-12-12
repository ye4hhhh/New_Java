public class task1 {
    public static void generateSequence(int n, int current, int count) {
        if (n == 0) {
            return;
        }
        System.out.print(current + " ");
        if (count == current) {
            generateSequence(n - 1, current + 1, 1);
        } else {
            generateSequence(n - 1, current, count + 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateSequence(n, 1, 1);
    }
}