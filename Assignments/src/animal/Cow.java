package animal;

public class Cow extends Mammal
{
   private String name;
   private String sound = "Moo!";
   
   public Cow(String name)
   {
       super("grass", "Bos", "Primigenius");
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
