import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C#");
        list.add("Rust");
        list.add("Swift");

        System.out.println("До сортировки: " + list);

        sort(list);

        System.out.println("После сортировки: " + list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<String> list) {
        list.sort(null);
    }
}