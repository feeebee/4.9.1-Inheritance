public class Owl extends Bird {
    public void eat(){
        System.out.println("the owl eats");
    }
    public void hunt(){
        System.out.println("the owl hunts");
    }
    public Owl (){
        
    }
    
    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }
}
