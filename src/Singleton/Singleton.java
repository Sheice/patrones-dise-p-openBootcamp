package Singleton;

public class Singleton {
    private static Singleton singleton;
    String saludo;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            return singleton =  new Singleton();
        }
        return singleton;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
