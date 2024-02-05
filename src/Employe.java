class Employe {
    String name;

    Employe(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi," + name + "My name is Employee " + this.name);
    }
}
