package mygame;

public class Warrior {
    private String name;
    private int age;
    private boolean hasstick;
    Warrior(String name, int age){
        this.name= name;
        this.age= age;
        hasstick= true;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    
    public void looseStick(){
        this.hasstick=false;
    }
    
    public void checkwalk(){
        if(hasstick==true){
            System.out.println(this.name+" can walk");
        }
        else{
            System.out.println(this.name+" can't walk");
        }
        
    }
    
}
