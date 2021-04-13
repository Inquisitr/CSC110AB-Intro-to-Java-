package animal;

public class Dog extends Mammal
{
   private String name;
   private String sound = "Woof!";
   
   public Dog(String name)
   {
       super("bone", "Canis", "Familiarus");
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
