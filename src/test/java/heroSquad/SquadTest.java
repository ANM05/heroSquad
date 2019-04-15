package heroSquad;

import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{
    @Test
    public void Squad_instantiatesCorrectly_true(){
    Squad testSquad = new Squad("mortal",2,"Justice");
    assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void Squad_squadInstanciatesWithName_mortal(){
        Squad testSquad = new Squad("mortal", 2,"Justice");
        assertEquals("mortal", testSquad.getName());
    }
    @Test
    public void Squad_squadInstanciatesWithMaxSize_2(){
        Squad testSquad = new Squad("mortal",2,"Justice");
        assertEquals(2, testSquad.getSize());
    }
    @Test
    public void Squad_squadinstantiatesWithCause_justice(){
        Squad testSquad = new Squad("mortal",2,"Justice");
        assertEquals("Justice", testSquad.getCause());
    }
}