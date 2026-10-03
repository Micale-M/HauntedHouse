import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class HauntedHouseTest {

    static HauntedHouse house;

    @BeforeAll
    static void setUp() {
         house = new HauntedHouse();
    }

    @Test
    void isGhostPresentTest() {
        boolean presence = house.isGhostPresent();
        assertTrue(presence);
    }

    @Test
    void scareAwayGhostTest() {
        house = new HauntedHouse();
        assertTrue(house.isGhostPresent());
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @Test
    void scareAwayNoGhostTest() {
        house = new HauntedHouse();
        house.scareAwayGhost();
        boolean presence = house.isGhostPresent();
        assertFalse(presence);
    }

    @Test
    void refillCandyBowlTest() {
        assertEquals(10,house.getCandyCount());
        house.refillCandyBowl(5);
        assertEquals(15,house.getCandyCount());
    }

    @Test
    void refillCandyBowlNegTest() {
        house = new HauntedHouse();
        assertEquals(10,house.getCandyCount());
        house.refillCandyBowl(-10);
        assertEquals(10,house.getCandyCount());
    }

    @Test
    void trickOrTreatTest() {
        assertEquals(10, house.getCandyCount());
        house.trickOrTreat(3);
        assertEquals(7, house.getCandyCount());
    }

    @Test
    void trickOrTreatNegTest() {
        house = new HauntedHouse();
        assertEquals(10, house.getCandyCount());
        house.trickOrTreat(-3);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void trickOrTreatTooManyPplTest() {
        house = new HauntedHouse();
        assertEquals(10, house.getCandyCount());
        house.trickOrTreat(11);
        assertEquals(0, house.getCandyCount());
    }

    @Test
    void spookySoundTest(){
        assertEquals("Boo!", house.spookySound());
    }

    @Test
    void HauntingTest(){
        scareAwayGhostTest();
        house.Haunting();
        assertTrue(house.isGhostPresent());
    }

    @Test
    void RunningLow(){
        trickOrTreatTest();
        int current = house.getCandyCount();
        house.ImprovedtrickOrTreat(current);
        assertEquals(10, house.getCandyCount());
    }

}
