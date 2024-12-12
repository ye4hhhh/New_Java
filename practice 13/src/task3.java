public class task3 {
    public static void printFromAToB(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " ");
        if (a < b) {
            printFromAToB(a + 1, b);
        } else {
            printFromAToB(a - 1, b);
        }
    }

    public static void main(String[] args) {
        int a = 5, b = 1;
        printFromAToB(a, b);
    }
}