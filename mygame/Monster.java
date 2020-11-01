package mygame;

public class Monster {
    private String name;
    private int age;
    
    Monster(String name, int age){
        this.name= name;
        this.age= age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
    public void stealStick(Warrior war){
        System.out.println(this.name+" Steals "+war.getName()+"'s Stick");
        war.looseStick();
    }
       
     
}
