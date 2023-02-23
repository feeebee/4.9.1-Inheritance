public class Elephant extends Animal {
    public void trumpet(){
        System.out.println("the elephant trumpets");
    }
    public void forage(){
        System.out.println("the elephant forages");
    }
    public Elephant(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant object has been constructed");
    }
    
}
