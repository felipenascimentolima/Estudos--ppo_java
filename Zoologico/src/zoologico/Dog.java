package zoologico;

public class Dog extends Mammal {
    public void wagTail(){
        System.out.println("(Wagging Tail)");
    }
    
    public void buryBone (){
        System.out.println(this.getClass().getSimpleName()+ "(Burying bone...)");
    }

    @Override
    public void emitSound() {
        System.out.println("Au! Au! Au! Au!");
    }
    
}
