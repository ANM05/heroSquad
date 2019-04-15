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
    @Test
    public void squadAll_returnsAllInstancesOfSquad_true(){
        Squad squadOne = new Squad("mortal",2,"Justice");
        Squad squadTwo = new Squad("dance",4,"fun");
        assertEquals(true, Squad.squadAll().contains(squadOne));
        assertEquals(true, Squad.squadAll().contains(squadTwo));
    }
    @Test
    public void clearAll_emptiesAllSquadsFromSquadObject_0(){
        Squad testSquad = new Squad("mortal",2,"Justice");
        Squad.clearAll();
        assertEquals(Squad.squadAll().size(),0);
    }
    @Test
    public void getId_squadObjectsIntantiatesWithAnId_1(){
        Squad testSquad = new Squad("mortal",2,"Justice");
        assertEquals(1, testSquad.getId());
    }
}