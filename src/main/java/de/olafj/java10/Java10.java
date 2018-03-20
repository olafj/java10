package de.olafj.java10;

public class Java10 {

    public Java10() {

    }

    public static void main(String[] args) {

        var instance = new Java10();
        instance.hello();

    }

    private void hello() {
        var greeter = "Hello World!";
        System.out.println(greeter);
    }
}
