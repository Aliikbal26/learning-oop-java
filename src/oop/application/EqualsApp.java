package oop.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Ali";
        first = first + " " + "Ikbal";

        System.out.println(first);

        String second = "Ali Ikbal";
        System.out.println(second);
        // equals untuk membandingan 2 buah nilai
        System.out.println(first.equals(second));
    }
}
