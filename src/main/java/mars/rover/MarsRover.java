package mars.rover;

public class MarsRover {
    private static final char NORTH = 'N', SOUTH = 'S', WEST = 'W', EAST = 'E', LEFT = 'L', RIGHT = 'R', FORWARD = 'M';
    private int x, y;
    private char direction;
    public MarsRover(int initialX, int initialY, char initialDirection){
        this.x = initialX;
        this.y = initialY;
        this.direction = initialDirection;
    }
    public void move(String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);

            switch (instruction){
                case MarsRover.LEFT:
                    this.moveLeft();
                    break;
                case MarsRover.RIGHT:
                    this.moveRight();
                    break;
                case MarsRover.FORWARD:
                    this.moveForward();
                    break;
            }

            this.move(instructions.substring(1));
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getDirection(){
        return this.direction;
    }

    private void moveLeft(){
        switch (this.direction){
            case MarsRover.NORTH:
                this.direction = MarsRover.WEST;
                break;
            case MarsRover.WEST:
                this.direction = MarsRover.SOUTH;
                break;
            case MarsRover.SOUTH:
                this.direction = MarsRover.EAST;
                break;
            case MarsRover.EAST:
                this.direction = MarsRover.NORTH;
        }
    }

    private void moveRight(){
        switch (this.direction){
            case MarsRover.NORTH:
                this.direction = MarsRover.EAST;
                break;
            case MarsRover.WEST:
                this.direction = MarsRover.NORTH;
                break;
            case MarsRover.SOUTH:
                this.direction = MarsRover.WEST;
                break;
            case MarsRover.EAST:
                this.direction = MarsRover.SOUTH;
        }
    }

    private void moveForward(){
        switch (this.direction){
            case MarsRover.NORTH:
                this.y++;
                break;
            case MarsRover.WEST:
                this.x--;
                break;
            case MarsRover.SOUTH:
                this.y--;
                break;
            case MarsRover.EAST:
                this.x++;
        }
    }
}
