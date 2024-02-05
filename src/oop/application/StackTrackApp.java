package oop.application;

import javax.management.RuntimeErrorException;

public class StackTrackApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Ali", "ikbal", "Juand"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
            // TODO: handle exception
        }
    }

}
