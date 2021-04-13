/*     File: UseAnimals.java//	.	........
 *     Name: Austin Newton
 *     Date: 04/12/2021
 *  Purpose: Practice Polymorph & Inheritance
 */
package animal;

public class UseAnimals
{
   public static void main(String[] args)
   {
      Dog d = new Dog("Rex");
      Cow w = new Cow("Elsie");
      Cat c = new Cat("Sammy");

      ShowDataAndSpeak(d);
      ShowDataAndSpeak(w);
      ShowDataAndSpeak(c);
      
      ((IEater)d).setEats("shoes");
      ((Mammal)w).setEats("cud");
      ((IEater)c).setEats("fish");
      
      //TODO: set array to d, w, c;
      Animal[] animals = {d, w, c}; 

      //TODO: Loop through animals array
      for( Animal a : animals ) {
          //TODO: print this Animal: its classname <tab> its toString <tab> make it speak
          String animalClass = a.getClass().getName(); //format: "<package>.<classname>"
          animalClass = animalClass.substring(animalClass.indexOf(".")+1);
          System.out.print(animalClass + "\t" + a + "\t");
          a.speak();
      }
      
      Animal a = (Animal)d;
      IEater i = (IEater)a;
      Mammal m = (Mammal)a;
      //a.setEats("food");  //NO
      //i.speak();          //NO
      //m.speak();          //NO
      //i.genus;            //NO
      //a.speak();          //YES
      //d.speak();          //YES
      //i.setEats("food");  //YES
      //m.setEats("food");  //YES
      //a.genus="";         //YES
      //d.genus="";         //YES
      //m.genus="";         //YES

   }//end main()
   
   public static void ShowDataAndSpeak(Animal a)
   {
      System.out.print(a);
      System.out.print(" says ");
      a.speak();
   }
}
