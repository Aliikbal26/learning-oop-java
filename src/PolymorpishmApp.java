public class PolymorpishmApp {
    public static void main(String[] args) {
        Employe employe = new Employe("Ali");
        employe.sayHello("Budi");

        employe = new Manager("Ali");
        employe.sayHello("Budi");

        employe = new VicePresident("Ali");
        employe.sayHello("Budi");

        sayHello(new Employe("Ali"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePresident("Joko"));
    }

    static void sayHello(Employe employe) {
        if (employe instanceof Manager) {
            Manager manager = (Manager) employe;
            System.out.println("Hello Manager " + manager.name);
        } else if (employe instanceof VicePresident) {
            VicePresident vp = (VicePresident) employe;
            System.out.println("Hello VP " + vp.name);
        } else {
            System.out.println("Hello " + employe.name);
        }
    }
}
