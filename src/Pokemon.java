package pokemongenerator;

import java.util.Random;

public class Pokemon {
    private  String ID;
    private String name;
    private String type;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int special;
    private int lvl;

    public Pokemon(String ID, String name, String type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.lvl=1;
        random();
    }
    
    public void random(){
        Random rd = new Random();
        this.hp=rd.nextInt(11)+15; //15-25
        this.atk=rd.nextInt(8)+10;//10-17
        this.def=rd.nextInt(8)+10;//10-17
        this.spd=rd.nextInt(11)+5;//5-15
        this.special=rd.nextInt(6)+5;//5-10
    }
    public void lvlUp(){
        Random rd = new Random();
        //hp  2-5
        //other 1-3
        this.lvl+=1;
        this.hp+=rd.nextInt(4)+2;
        this.atk+=rd.nextInt(3)+1;
        this.def+=rd.nextInt(3)+1;
        this.spd+=rd.nextInt(3)+1;
        this.special+=rd.nextInt(3)+1;
        
    }

    
    public String display() {
        return "Pokemon ID: " + ID + "\nPokemon name: " + name + "\nElement type: " + type + "\nHit point: " + hp + "\nAttack: " + atk + "\nDefence: " + def + "\nSpeed: " + spd + "\nSpecial: " + special + "\nLevel: " + lvl ;
    }
    
    
}
