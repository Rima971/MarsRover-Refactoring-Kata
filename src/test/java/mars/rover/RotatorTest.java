package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotatorTest {
    @Test
    public void correctlyStoresDirection(){
        Rotator rotator = new Rotator('N');
        assertEquals('N', rotator.getDirection());
    }

    @Test
    public void correctlyRotatesClockwise(){
        Rotator rotator = new Rotator('W');

        rotator.rotateClockwise();

        assertEquals('N', rotator.getDirection());

        rotator.rotateClockwise();

        assertEquals('E', rotator.getDirection());

        rotator.rotateClockwise();

        assertEquals('S', rotator.getDirection());

        rotator.rotateClockwise();

        assertEquals('W', rotator.getDirection());
    }

    @Test
    public void correctlyRotatesAntiClockwise(){
        Rotator rotator = new Rotator('W');

        rotator.rotateAntiClockwise();

        assertEquals('S', rotator.getDirection());

        rotator.rotateAntiClockwise();

        assertEquals('E', rotator.getDirection());

        rotator.rotateAntiClockwise();

        assertEquals('N', rotator.getDirection());

        rotator.rotateAntiClockwise();

        assertEquals('W', rotator.getDirection());
    }
}
