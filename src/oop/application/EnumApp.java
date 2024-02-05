package oop.application;

import oop.data.Custemor;
import oop.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Custemor custemor = new Custemor();
        custemor.setName("Ali");
        custemor.setLevel(Level.PREMIUM);

        System.out.println(custemor.getName());
        System.out.println(custemor.getLevel());
        System.out.println(custemor.getLevel().getDescription());
    }
}
