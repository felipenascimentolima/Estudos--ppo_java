package aula14;

public class Person {
    
    protected String name;
    protected int age;
    protected String gender;
    protected int experience;
    
    protected void gainExp(){
        this.experience=this.getExperience()+10;
        System.out.println("The experience points of "+this.name+" increased 10 points");
    }

////////////////////////////////////////////////////////////////////////////////
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
////////////////////////////////////////////////////////////////////////////////
    
    

}
