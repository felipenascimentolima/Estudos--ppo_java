package zoologico;

public class Fish extends Animal {

    private String scaleColour;
    
    public void releaseBubbles(){
        System.out.println(this.getClass().getSimpleName()+" Releasing bubbles *.*.*.*.*.*..**..*.*.* ");
    }
    
    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName()+ " Swimming...)");
    }

    @Override
    public void feed() {
        System.out.println(this.getClass().getSimpleName()+" (Absorbing nutrients...)");
    }

    @Override
    public void emitSound() {
        System.out.println(this.getClass().getSimpleName()+" -- Nothing happened T-T --");
    }

    public String getColourScale() {
        return scaleColour;
    }

    public void setColourScale(String colourScale) {
        this.scaleColour = colourScale;
    }
    
    
    
}
