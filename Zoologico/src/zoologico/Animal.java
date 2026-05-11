package zoologico;

public abstract class Animal {
    protected float weight;
    protected int age;
        protected int members;
        
        public abstract void walk();
        public abstract void feed();
        public abstract void emitSound();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public String toString() {
        
        return  this.getClass().getSimpleName()+"{" + "weight=" + weight +" Kg"+ ", age=" + age + ", members=" + members + '}';
        
    }
        
            
}
