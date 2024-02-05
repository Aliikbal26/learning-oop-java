package oop.application;

import oop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("ali", null);
        System.out.println("Sukses");
    }

    // methodb
    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke databases");
        }
    }

}
