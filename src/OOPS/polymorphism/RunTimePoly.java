package OOPS.polymorphism;
class Animal {
    // Base class method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class RunTimePoly {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
        Animal b=new Cat();
        b.sound();

    }
}
