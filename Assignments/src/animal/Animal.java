package animal;

public abstract class Animal
{
   protected String genus;
   protected String species;
   
   public Animal(String genus, String species)
   {
       this.genus   = genus;
       this.species = species;
   }
   
   public abstract void speak();
   
   public String toString()
   {
       return "Genus=" + genus + "; Species=" + species;
   }
}
