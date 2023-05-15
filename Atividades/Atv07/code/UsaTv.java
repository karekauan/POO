package Atv07.code;

import Atv07.code.Tv;

public class UsaTv {
    
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.volume = 10;
        tv1.canal = 5;

        Tv tv2 = new Tv();
        tv2.volume = 5;
        tv2.canal = 10;

        tv1.aumentarVolume();
        tv1.trocarCanal(7);
        System.out.println("Tv 1");
        tv1.mostrar();

        System.out.println("--------------------");

        tv2.diminuirVolume();
        tv2.trocarCanal(3);
        System.out.println("Tv 2");
        tv2.mostrar();
    }

}
