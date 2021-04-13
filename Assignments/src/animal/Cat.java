package animal;

public class Cat extends Mammal
{
   private String name;
   private String sound = "Meow!";
   
   public Cat(String name)
   {
       super("mouse", "Felis", "Catus");
       this.name = name;
   }
   
   public void speak()
   {
      System.out.println(sound);
   }
   
   public String toString()
   {
       return super.toString() + "; Name:" + name;
   }
}
