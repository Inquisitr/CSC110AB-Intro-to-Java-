package animal;

public abstract class Mammal extends Animal implements IEater
{
   private String eats;

   public Mammal(String eats, String genis, String species)
   {
       super(genis, species);
       this.eats = eats;
   }
   public String getEats()
   {
      return eats;
   }
   
   public void setEats(String food)
   {
      eats = food;
   }
   
   public String toString()
   {
       return super.toString() + "; Eats=" + eats;
   }
}
