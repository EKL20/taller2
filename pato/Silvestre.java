package pato;

public class Silvestre extends Patos implements Cuackable, Swinmable, Flyable {


    @Override
    public void doCuack() {
        System.out.println("Cuaquiando  desde un pato silvestre");
    }

    @Override
    public void doFly() {
        System.out.println("volando desde un pato silvestre");
    }

    @Override
    public void doSwim() {
        System.out.println("Nadando desde un pato silvestre");
    }


}

