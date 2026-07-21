class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        super.display();
        System.out.println("This is a dog");
    }
}

public class code29 {
    public static void main(String[] args) {

        Animal a = new Animal("Animal");
        a.display();
        a.sound();

        System.out.println();

        Animal d = new Dog("Tommy");
        d.display();
        d.sound();
    }
}
