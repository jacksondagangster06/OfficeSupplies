public static void main(String [] args)
{ 
HolePunch p = new HolePunch();
   System.out.println("This will display the HolePunch class! Level: Easy.")
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
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   System.out.println("This will display the Map/State class! Level: Complex.")
   
}