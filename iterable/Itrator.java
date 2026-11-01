
import java.util.*;

public class Itrator {
    public static void main(String[] args) {
        // Collection<Integer> c = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // List<Integer> list = new LinkedList<>();
        // List<Integer> c = new Stack<>();
        Collection<Integer> c = new TreeSet<>();

        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        Iterator<Integer> it =  c.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

// Iterable

// 10 -> 20 -> 30 -> 40 -> 50