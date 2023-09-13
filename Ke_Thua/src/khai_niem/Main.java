package khai_niem;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lộc", 22, "Trắng");
        System.out.println(dog.getName()); // Lộc
        System.out.println(dog.getName2()); // Lộc 2
        dog.bark();
    }
}
