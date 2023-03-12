package one.digitalinovation.gof;

import one.digitalinovation.gof.focade.Focade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println( lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println( lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        Comportamento defensivo =new ComportamentoDefensivo();
        Comportamento normal =new ComportamentoNormal();
        Comportamento agressivo =new ComportamentoAgressivo();

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

        Focade focade = new Focade();
        focade.migrarCliente("Jeferson","88805140");
    }
}