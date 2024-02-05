public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Ali");
        manager.name = "Ali";
        manager.sayHello("Juand");

        var vp = new VicePresident("Joni");
        vp.name = "Joni";
        vp.sayHello("Yahya");
    }
}
