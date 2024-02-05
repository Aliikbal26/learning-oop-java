public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Ali", "Jakarta");
        Person person2 = new Person("Aldi");
        Person person3 = new Person();
        person3.name = "Aldo";

        person2.sayHello("Juanda");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
