package Units;

public class Rogue extends Melee {
    public Rogue(String name){
        super(name, 15, 5, 1,5,5);
    }
    @Override
    public String toString(){
        return "Разбойник";
    }
    @Override
    public void step(){
    
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
