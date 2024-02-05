class Manager extends Employe {
    String company;

    // constructor
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi, " + name + " my name is manager " + this.name);
    }
}
