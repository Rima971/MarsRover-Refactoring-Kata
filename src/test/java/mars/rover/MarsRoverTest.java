package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        MarsRover marsRover = new MarsRover(1, 2, 'N');
        marsRover.move("LMLMLMLMM");
        assertEquals(1, marsRover.getX());
        assertEquals(3, marsRover.getY());
        assertEquals('N', marsRover.getDirection());
    }

    @Test
    public void
    acceptance_test_2() {
        MarsRover marsRover = new MarsRover(3,3, 'E');
        marsRover.move("MMRMMRMRRM");
        assertEquals(5, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals('E', marsRover.getDirection());
    }

}