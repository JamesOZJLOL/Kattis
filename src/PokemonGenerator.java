package pokemongenerator;
public class PokemonGenerator {
    public static void main(String[] args) {
        Pokemon p = new Pokemon("WID190510","YONG ZHANG","YOUTUBER");
        System.out.println(p.display());
        System.out.println("");
        
        p.lvlUp();//lv2
        System.out.println(p.display());
        System.out.println("");
        
        p.lvlUp();//lv3
        System.out.println(p.display());
        System.out.println("");
        
        p.lvlUp();//lv4
        System.out.println(p.display());
       
        System.out.println(p);
    }
    
}
