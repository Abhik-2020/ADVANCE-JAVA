// ======================= ABSTRACT KEYWORD =======================

// 1. 'abstract' is a keyword in Java.

// 2. An abstract class can contain:
//    - abstract methods
//    - non-abstract (concrete) methods
//    - variables
//    - constructors
//    - static methods
//    - etc.

// 3. We CANNOT create an object of an abstract class directly.
//    Example:
//    Car obj = new Car();  // ERROR

// 4. An abstract method is a method which has:
//    - 'abstract' keyword
//    - method declaration
//    - NO method body
//
//    Example:
//    public abstract void drive();

// 5. If a class contains even ONE abstract method,
//    then the class MUST be declared abstract.

// 6. A child class must override ALL abstract methods
//    of its parent class.
//    BUT if the child class does not override all of them,
//    then the child class must also be declared abstract.

// 7. Abstract class can have normal/concrete methods
//    with method bodies.

// 8. Abstract methods CANNOT be:
//    - private
//    - static
//    - final
//
//    Because abstract methods must be overridden by child classes.

// 9. An abstract class can have static methods.
//    Static methods belong to the class, not to the object.

// 10. Abstract class can be used as a reference type:
//
//     Car obj = new updatedWaganR();
//
//     Here:
//     - Car = reference type
//     - updatedWaganR = actual object
//
//     This is called UPCASTING.

// 11. We can create a reference of an abstract class,
//     but we cannot create its object.
//
//     Car obj1 = new Car();              // ERROR
//     Car obj1 = new WaganR();           // ERROR if WaganR is abstract
//     Car obj1 = new updatedWaganR();    // CORRECT


abstract class Car {

    // Abstract method:
    // It has no body.
    // Child class must provide its implementation.
    public abstract void drive();

    public abstract void fly();


    // Concrete/normal method:
    // Abstract class can have normal methods.
    public static void playMusic() {
        System.out.println("music is playing");
    }
}


// WaganR is abstract because it does not implement
// the 'fly()' abstract method.
//
// It implements drive(), but fly() is still abstract.
//
// Therefore WaganR must also be declared abstract.

abstract class WaganR extends Car {

    // Method overriding:
    // Providing implementation of parent's abstract method.
    public void drive() {
        System.out.println("driving wagonR");
    }
}


// updatedWaganR extends WaganR.
//
// WaganR still has one abstract method: fly()
//
// So updatedWaganR MUST implement fly().
// After implementing fly(), updatedWaganR becomes
// a concrete (non-abstract) class.

class updatedWaganR extends WaganR {

    // Method overriding
    public void fly() {
        System.out.println("flying");
    }
}


public class AbstractKeyWord {

    public static void main(String[] args) {

        // =====================================================
        // OBJECT CREATION
        // =====================================================

        // Car obj1 = new Car();
        // ERROR:
        // Cannot create an object of an abstract class.


        // Car obj1 = new WaganR();
        // ERROR:
        // WaganR is also abstract,
        // so its object cannot be created.


        // CORRECT:
        // Reference = Car
        // Object = updatedWaganR
        //
        // This is UPCASTING.
        Car obj1 = new updatedWaganR();

        obj1.drive();


        // WaganR is abstract, so we cannot write:
        //
        // WaganR obj2 = new WaganR();   // ERROR
        //
        // But we can use WaganR as a reference
        // to a child class object.

        WaganR obj2 = new updatedWaganR();

        obj2.drive();
        obj2.fly();


        // Static method can be called using the class name.
        // No object is required.

        Car.playMusic();
    }
}