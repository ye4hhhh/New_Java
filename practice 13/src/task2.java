public class task2 {
    public static void printFrom1ToN(int n) {
        if (n == 0) {
            return;
        }
        printFrom1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printFrom1ToN(n);
    }
}