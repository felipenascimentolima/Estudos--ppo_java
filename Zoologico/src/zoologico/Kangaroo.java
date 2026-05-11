/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Felipe Lima
 */
public class Kangaroo extends Mammal {
    public void useBag(){
        System.out.println(this.getClass().getSimpleName()+" (Using bag now...)");
    }

    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName()+" (Jumping...)");
    }
    
    
}
