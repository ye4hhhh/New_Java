import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task7{

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C#");
        list.add("Rust");
        list.add("Swift");

        System.out.println("До перетасовки: " + list);

        shuffle(list);

        System.out.println("После перетасовки: " + list);
    }

    public static <E> void shuffle(ArrayList<E> list) {

        Random rand = new Random();

        for (int i = list.size() - 1; i > 0; i--) {

            int j = rand.nextInt(i + 1);

            Collections.swap(list, i, j);
        }
    }
}