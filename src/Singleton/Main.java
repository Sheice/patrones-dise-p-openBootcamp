package Singleton;

public class Main {
    public static void main(String[] args) {
        //error al declarar el constructor singleon
        // Singleton singleton1 = new Singleton();

        Singleton singleton = Singleton.getInstance();

        singleton.setSaludo("Hola pa");

        Singleton singleton3 = Singleton.getInstance();

        System.out.println("sing 1: " + singleton.getSaludo() + " en memoria: " + singleton );
        System.out.println("sing 2: " + singleton3.getSaludo() + " en memoria: " + singleton3 );


    }
}