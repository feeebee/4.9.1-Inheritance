public class Feline extends Animal {
    public void roar(){
        System.out.println("ROARRR");
    }
    public void growl(){
        System.out.println("GROWLL");
    }
    public Feline(){

    }
    public Feline (String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("a feline arrives");
      }
}
