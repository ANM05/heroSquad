 package heroSquad;

 import org.junit.*;
 import static org.junit.Assert.*;

 public class HeroTest{
   @Test
   public void Hero_instanciatesCorrectly_true(){
       Hero testHero = new Hero("Atom",25,"Atomic power","Shadow control", "Affected by darkness");
       assertEquals(true, testHero instanceof Hero);
   }
   @Test
     public void Hero_instanciatesWithHeroName_String(){
       Hero testHero = new Hero("Atom",25,"Atomic power","Shadow control","Affected by darkness");
       assertEquals("Atom", testHero.getHeroName());
   }
     @Test
     public void Hero_instanciatesWithHeroAge_int(){
         Hero testHero = new Hero("Atom", 25,"Atomic power","Shadow control","Affected by darkness");
         assertEquals(25, testHero.getHeroAge());
     }
     @Test
     public void Hero_instanciatesWithSpecialPowers_String(){
         Hero testHero = new Hero("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
         assertEquals("Atomic power", testHero.getSpecialPower());
     }
     @Test
     public void Hero_instanciatesWithStrength_String(){
         Hero testHero = new Hero("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
         assertEquals("Shadow control", testHero.getStrength());
     }
     @Test
     public void Hero_instanciatesWithWeakness_String(){
         Hero testHero = new Hero("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
         assertEquals("Affected by darkness", testHero.getWeakness());
     }
     @Test
     public void getAll_returnAllinstancesOfHeroObject_true(){
       Hero heroOne = new Hero ("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
       Hero heroTwo = new Hero ("Intelli", 25, "Intelligence", "Mind control","Sturborn");
       Hero heroThree = new Hero ("Lizard", 25, "Wall climb", "Super senses","Cold blooded");
       assertEquals(true,Hero.getAll().contains(heroOne));
       assertEquals(true,Hero.getAll().contains(heroTwo));
       assertEquals(true,Hero.getAll().contains(heroThree));
     }
     @Test
     public void clear_emptiesAllHeroesFromHeroInsatancesArray_0(){
       Hero testHero = new Hero("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
       Hero.clear();
       assertEquals(Hero.getAll().size(), 0);
     }
    @Test
     public void getId_heroInstantiatesWithAnId_1(){
       Hero.clear();
       Hero testHero = new Hero("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
       assertEquals(1,testHero.getId());
    }
     @Test
     public void find_returnsHeroWithSameId_heroTwo(){
         Hero heroOne = new Hero ("Atom", 25, "Atomic power", "Shadow control","Affected by darkness");
         Hero heroTwo = new Hero ("Intelli", 25, "Intelligence", "Mind control","Sturborn");
         assertEquals(Hero.find(heroTwo.getId()),heroTwo);
     }
}