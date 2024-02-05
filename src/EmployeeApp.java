public class EmployeeApp {
    public static void main(String[] args) {
        Employe employe = new Employe("Juanda");
        employe.sayHello("Budi");

        employe = new Manager("Ali");
        employe.sayHello("Budi");

        employe = new VicePresident("Aldi");
        employe.sayHello("Budi");

    }
}
