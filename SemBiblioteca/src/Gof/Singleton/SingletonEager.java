package Gof.Singleton;

/*
 * Singleton "Apressado"
 * @autor falvo
 */

public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
