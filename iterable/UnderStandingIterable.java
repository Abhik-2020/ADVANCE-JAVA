
import java.util.Iterator;

public class UnderStandingIterable{
    public static void main(String[] args) {

        String[] names = {"Aditya", "Rohit", "Rohan", "Monu"};

        // Creating NameContainer object
        NameContainer obj = new NameContainer(names);

        // For-each loop
        for(String name : obj) {
            System.out.println(name);
        }
    }
}

// Iterable allows us to use for-each loop
class NameContainer implements Iterable<String> {

    String[] names;

    NameContainer(String[] names) {
        this.names = names;
    }

    // Returns an Iterator object
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            int i = 0;  // Starting index

            // Checks if another element exists
            public boolean hasNext() {
                return i < names.length;
            }

            // Returns element and moves to next index
            public String next() {
                return names[i++];
            }
        };
    }
}
