package zoologico;

public class Reptile extends Animal {
    
    private String scaleColour;
    
    
        @Override
            public void walk() {
                System.out.println(this.getClass().getSimpleName()+" Crawling...");
            }

        @Override
            public void feed() {
                System.out.println(this.getClass().getSimpleName()+"(Eating insects and eggs...)");
            }

        @Override
            public void emitSound() {
                System.out.println(this.getClass().getSimpleName()+"( Reptile sound...)");
            }

    public String getCorEscama() {
        return scaleColour;
    }

    public void setCorEscama(String colourScale) {
        this.scaleColour = colourScale;
    }
    
    
}
