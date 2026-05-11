package zoologico;

public class Zoo {

    public static void main(String[] args) {
        /*Mammal z0=new Mammal();
        z0.age=10;
        z0.members=4;
        z0.weight=12.5f;
        
        Reptile z1= new Reptile();
        z1.age=25;
        z1.members=0;
        z1.weight=5f;
        
        System.out.println(z1.toString());
        System.out.println(z0.toString());
        
        z0.walk();
        z1.emitSound();*/
        
        Kangaroo k = new Kangaroo();
        Dog d= new Dog();
        Snake s=new Snake();
        Turtle t=new Turtle();
        Goldfish g=new Goldfish();
        Macaw m = new Macaw();
        
        k.emitSound();
    }
    
}
