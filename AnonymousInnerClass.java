class A {

    public void printSomething() {
        System.out.println("something..");
    }
}


public class AnonymousInnerClass {

    public static void main(String ags[]) {

        // Instead of making another class and overriding the method,
        // we can directly edit/override the method here using
        // Anonymous Inner Class.

        A obj = new A() {

            public void printSomething() {
                System.out.println("edit this method with main class");
            }

        }; // Anonymous Inner Class

        obj.printSomething();
    }
}