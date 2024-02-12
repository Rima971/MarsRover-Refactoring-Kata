package mars.rover;

public class MarsRover {
    private static final char LEFT = 'L', RIGHT = 'R', FORWARD = 'M', NORTH = 'N', SOUTH = 'S', EAST = 'E', WEST = 'W';
    private Rotator rotator;
    private int x, y;
    public MarsRover(int initialX, int initialY, char initialDirection){
        this.x = initialX;
        this.y = initialY;
        this.rotator = new Rotator(initialDirection);
    }
    public void move(String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);

            switch (instruction){
                case MarsRover.LEFT:
                    this.rotateLeft();
                    break;
                case MarsRover.RIGHT:
                    this.rotateRight();
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
        return this.rotator.getDirection();
    }

    private void rotateLeft(){
        rotator.rotateAntiClockwise();
    }

    private void rotateRight(){
        rotator.rotateClockwise();
    }

    private void moveForward(){
        switch (this.rotator.getDirection()){
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
