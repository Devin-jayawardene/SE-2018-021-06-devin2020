package mygame;

public class MyGame {

    public static void main(String[] args) {
        Warrior war1= new Warrior("Warrior_1", 20);
        Warrior war2= new Warrior("Warrior_2",25);
        Monster mon1= new Monster("Monster_1",war1.getAge());
        
        mon1.stealStick(war2);
        war2.checkwalk();
    
    
    }
    
}
