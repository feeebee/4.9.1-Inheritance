/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    Tiger tiger = new Tiger("meat", true, 17.0);
    Gorilla gorilla = new Gorilla();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice, insects", true, 4.0);
    owl2.eat();
    Penguin penguin = new Penguin();
    penguin.fish();
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    tiger.eat();
    tiger.isNocturnal();
    tiger.getLifeSpan();
       
  }
}