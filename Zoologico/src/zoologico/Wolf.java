package zoologico;

public class Wolf extends Mammal {

    @Override
    public void emitSound() {
        System.out.println("Auuuuuuuuu!");
    }
    
    // 
    public void react(String phrase){
        if(phrase.equals("give a food")|| phrase.equals("hello!")){
            System.out.println("Wag and bark");
        }else{
            System.out.println("Growl");
        }
    }
    public void react(int hour, int min){
        if(hour<12){
            System.out.println("Wag");
        } else if(hour>=18){
            System.out.println("Ignore");
        }else{
            System.out.println("Wag and bark");
        }
    }
    public void react(boolean owner){
        if (owner){
            System.out.println("Wag");
        } else{
            System.out.println("Growl and bark");
        }
    }
    public void react(int age, float weight){
        if (age<5){
            if(weight<10){
                System.out.println("Wag");
            }   else{
                    System.out.println("Bark");
                }
        } else if(weight<10){
            System.out.println("Growl");
        } else{
            System.out.println("Bark");
        }
    }
}


