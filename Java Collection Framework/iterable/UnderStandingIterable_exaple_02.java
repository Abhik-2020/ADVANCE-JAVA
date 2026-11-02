
import java.util.Iterator;

public class UnderStandingIterable_exaple_02 {
    public static void main(String[] args) {

        int[] marks = {85, 90, 75, 95, 80};

        // Creating object
        StudentContainer obj = new StudentContainer(marks);

        // Using for-each loop
        for(int mark : obj) {
            System.out.println(mark);
        }
    }
}

// Iterable allows us to use for-each loop
class StudentContainer implements Iterable<Integer> {

    int[] marks;

    // Constructor
    StudentContainer(int[] marks) {
        this.marks = marks;
    }

    // Returns Iterator object
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            int index = 0;

            // Checks if another mark exists
            public boolean hasNext() {
                return index < marks.length;
            }

            // Returns current mark and moves forward
            public Integer next() {
                return marks[index++];
            }
        };
    }
}

