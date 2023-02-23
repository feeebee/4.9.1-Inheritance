public  class Tiger extends Feline {
    public void swim(){
        System.out.println("The tiger swims");
    }
    public void huntAlone(){
        System.out.println("The tiger hunts alone");
    }
    public Tiger(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }
}
