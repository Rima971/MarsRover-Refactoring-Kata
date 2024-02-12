package mars.rover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotator {
    private char direction;
    private static final List<Character> directions = new ArrayList<>(Arrays.asList('N', 'E', 'S', 'W'));
    public Rotator(char direction){
        this.direction = direction;
    }

    public void rotateClockwise(){
        int indexOfCurrentDirection = Rotator.directions.indexOf(this.direction);
        int indexOfNextDirection = (indexOfCurrentDirection + 1) % Rotator.directions.size();
        this.direction = Rotator.directions.get(indexOfNextDirection);
    }

    public void rotateAntiClockwise(){
        int indexOfCurrentDirection = Rotator.directions.indexOf(this.direction);
        int indexOfNextDirection = (indexOfCurrentDirection - 1 + Rotator.directions.size()) % Rotator.directions.size();
        this.direction = Rotator.directions.get(indexOfNextDirection);
    }

    public char getDirection(){
        return this.direction;
    }
}
