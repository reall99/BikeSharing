package lapr.project.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author titi1
 */
public class RoadTest {

    public RoadTest() {
    }

    @Test
    public void RoadTest() {
        Road bike = new Road("1", true, 1, 2, 3, 4);
        assertEquals("1", bike.getBicycleDesc());
        assertTrue(bike.isIsAvailable());
        assertEquals(1, bike.getCostPerHour());
        assertEquals(2, bike.getWeight());
        assertEquals(3, bike.getAerodynamicCoeficient());
        assertEquals(4, bike.getFrontalArea());
    }

}
