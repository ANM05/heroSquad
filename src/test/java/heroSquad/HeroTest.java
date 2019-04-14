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
}