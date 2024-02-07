public class OfficeSuppliesTester
{
public static void main(String [] args)
{ 
HolePunch p = new HolePunch();
   System.out.println("This will display the HolePunch class! Level: Easy.");
   System.out.println(p.getHoles());
   p.punch();
   p.punch();
   p.punch();
   System.out.println("After punching on three separate occasions, the total amount of holes punches is " + p.getHoles());
   p.empty();
   System.out.println("After utilizing the emptying function on the hole puncher,the total amount of holes punched are " + p.getHoles());
   p.punch();
   p.punch();
   p.punch();
   p.punch();
   p.punch();
   System.out.println("After punching on five separate occasions, the hole puncher displays the message shown above.");
   System.out.println();
   System.out.println();
   System.out.println("This will display the WaterDispenser class! Level: Intermediate.");
   System.out.println("The dispenser's max capacity is 10000mL");
   WaterDispenser x = new WaterDispenser();
   x.fillBottle();
   x.fillCup();
   System.out.println("After filling a bottle(500ml) and a cup(200mL), there is " + x.getAmount() + "mL left in the dispenser");
   System.out.println("Now refilling the dispenser");
   x.refill();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillBottle();
   x.fillCup();
  
   System.out.println("After trying to fill too many water bottles the message above is displayed");

   

   
   
   
   
   
   
   
   
   
   
   System.out.println();
   System.out.println();
   System.out.println("This will display the Map/State class! Level: Complex.");
   System.out.println("We are going to randomly spin the map!");
   Map m = new Map();
   m.spin();
   System.out.println("State: " + m.getState());
   System.out.println("Capital: " + m.getCapital());
}
}