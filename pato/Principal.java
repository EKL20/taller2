package pato;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
            Hierro metalPato = new Hierro();
            Hierro heroDuck = new Hierro();
            Hierro aktDuck = new Hierro();

            Silvestre silverHuts = new Silvestre();
            Silvestre kakaroto = new Silvestre();
            Silvestre laTorta = new Silvestre();

            Hule minieDuck = new Hule();
            Hule doly = new Hule();
            Hule amparo = new Hule();

            Madera eucalipto = new Madera();
            Madera hierbaVerde = new Madera();
            Madera menta = new Madera();

            TheWarnerDuck Donal = new TheWarnerDuck();
            ComicDuck Lucas = new TheWarnerDuck();
            Lucas.doFly();
            Lucas.doBoom();

        ArrayList<Patos> allDuck = new ArrayList<>();
        allDuck.add(metalPato);
        allDuck.add(heroDuck);
        allDuck.add(aktDuck);
        allDuck.add(silverHuts);
        allDuck.add(kakaroto);
        allDuck.add(laTorta);
        allDuck.add(minieDuck);
        allDuck.add(doly);
        allDuck.add(amparo);
        allDuck.add(eucalipto);
        allDuck.add(hierbaVerde);
        allDuck.add(menta);
        allDuck.add(Donal);
        for (Patos patos:allDuck) {
            System.out.println(patos);

        }
        ArrayList<Swinmable> swimDuck = new ArrayList<>();
        swimDuck.add(silverHuts);
        swimDuck.add(kakaroto);
        swimDuck.add(laTorta);
        swimDuck.add(minieDuck);
        swimDuck.add(doly);
        swimDuck.add(amparo);
        swimDuck.add(eucalipto);
        swimDuck.add(hierbaVerde);
        swimDuck.add(menta);

        for (Swinmable nadadores: swimDuck) {
            nadadores.doSwim();
        }
        ArrayList<Flyable> voladores = new ArrayList<>();
        voladores.add(silverHuts);
        voladores.add(kakaroto);
        voladores.add(laTorta);
        voladores.add(Donal);
        for (Flyable volar: voladores) {
            volar.doFly();
        }

        ArrayList<Cuackable> habladores = new ArrayList<>();
        habladores.add(silverHuts);
        habladores.add(kakaroto);
        habladores.add(laTorta);
        habladores.add(minieDuck);
        habladores.add(doly);
        habladores.add(amparo);
        for (Cuackable cuack: habladores) {
            cuack.doCuack();
        }

    }
}
