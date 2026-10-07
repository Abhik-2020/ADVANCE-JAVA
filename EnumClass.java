// enum = fixed set of constants
enum Laptop {

    // Each constant can have its own price
    Mackbook(2000),
    Xps(2200),
    Surface,              // uses default constructor → price = 0
    Thikpad(1800);

    private int price;

    // Parameterized constructor
    private Laptop(int price) {
        this.price = price;
    }

    // Default constructor
    private Laptop() {
    }

    // Getter → returns price
    public int getPrice() {
        return price;
    }

    // Setter → changes price
    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {

        // Store enum constant in variable
        Laptop lap = Laptop.Mackbook;

        System.out.println(lap + " : " + lap.getPrice());

        // Change price of Mackbook
        lap.setPrice(10);

        System.out.println(lap + " : " + lap.getPrice());

        // values() → returns all enum constants
        for (Laptop lap2 : Laptop.values()) {

            // lap = Mackbook, lap2 = each enum constant
            System.out.println(lap + " : " + lap2.getPrice());
        }
    }
}