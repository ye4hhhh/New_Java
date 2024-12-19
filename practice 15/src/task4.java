public class task4 {
    public static void main(String[] args) {
        task2<String> stack = new task2<>();

        stack.push("абвгд");
        stack.push("ежзи");
        stack.push("клмно");
        stack.push("ухцчшщ");

        System.out.println("Содержимое стека: " + stack);

        int index = linearSearch(stack, "ежзи");
        System.out.println("Индекс элемента 'ежзи': " + index);

        int notFound = linearSearch(stack, "алфавит");
        System.out.println("Индекс элемента 'алфавит': " + notFound);
    }

    public static <E> int linearSearch(task2<E> stack, E element) {
        for (int i = 0; i < stack.getSize(); i++) {
            if (stack.get(i).equals(element)) { // Используем метод get
                return i;
            }
        }
        return -1; // Если элемент не найден
    }
}