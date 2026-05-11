package zoologico;

public class Mammal extends Animal {
    
    private String furColor;

    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName()+" Running");
    }

    @Override
    public void feed() {
        System.out.println(this.getClass().getSimpleName()+" Breastfeeding");
    }

    @Override
    public void emitSound() {
        System.out.println(this.getClass().getSimpleName()+" Mammal sound...");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    
    
}
