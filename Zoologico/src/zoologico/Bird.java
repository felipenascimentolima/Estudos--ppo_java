package zoologico;

public class Bird extends Animal {

    private String featherColour;
    
    public void makeNest(){
        System.out.println(this.getClass().getSimpleName()+" Building a nest...  ....   ...   ...  ...");
    }
    
    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName()+" Flying..");
    }

    @Override
    public void feed() {
        System.out.println(this.getClass().getSimpleName()+" Eating worms...");
    }

    @Override
    public void emitSound() {
        System.out.println(this.getClass().getSimpleName()+" Singing...");
    }

    public String getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }
    
    
    
}
