package zoologico;

public class Turtle extends Reptile {

    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName()+"(Walking soooo slowly)");
    }
    
}
