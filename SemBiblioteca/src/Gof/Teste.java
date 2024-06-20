package Gof;

import Gof.Facade.Facade;
import Gof.Singleton.SingletonEager;
import Gof.Singleton.SingletonLazy;
import Gof.Singleton.SingletonLazyHolder;
import Gof.Strategy.Comportamento;
import Gof.Strategy.ComportamentoAgressivo;
import Gof.Strategy.ComportamentoDefensivo;
import Gof.Strategy.ComportamentoNormal;
import Gof.Strategy.Robo;

public class Teste {
    public static void main(String[] args) throws Exception {
        

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy


        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        //Facade


        Facade facade = new Facade();
        facade.migrarCliente("Walter", "72115632");
    }
}
