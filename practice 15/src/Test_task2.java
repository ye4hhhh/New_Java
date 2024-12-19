import java.util.Scanner;

public class Test_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task2<String> stack = new task2<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}