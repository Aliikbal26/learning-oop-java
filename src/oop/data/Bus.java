package oop.data;

public class Bus implements Car {

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("The bus is driving.");

    }

    @Override
    public int getTire() {
        // TODO Auto-generated method stub
        return 8;
    }

    public boolean isBig() {
        return false;
    }

}
