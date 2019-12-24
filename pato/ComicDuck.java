package pato;

public abstract class  ComicDuck extends Patos implements Flyable{
  public abstract void doBoom();

  public  void doZap(){
      System.out.println("hace zap desde un comic duck");
  }
}
