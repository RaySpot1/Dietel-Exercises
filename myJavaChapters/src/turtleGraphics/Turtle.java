package turtleGraphics;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);


    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setState(PenState.DOWN);
    }


    public void penUp() {
        pen.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == Direction.EAST) face(Direction.SOUTH);
        else if(currentDirection == Direction.SOUTH) face(Direction.WEST);
        else if(currentDirection == Direction.WEST) face(Direction.NORTH);
        else if(currentDirection == Direction.NORTH) face(Direction.EAST);
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if(currentDirection == Direction.EAST) face(Direction.NORTH);
        else if(currentDirection == Direction.NORTH) face(Direction.WEST);
        else if(currentDirection == Direction.WEST) face(Direction.SOUTH);
        else if(currentDirection == Direction.SOUTH) face(Direction.EAST);
    }

    public void move(int noOfSteps) {
        if(currentDirection == Direction.EAST){
            increaseColumnBy(noOfSteps-1);
        }
    }

    private void increaseColumnBy(int increase) {
        currentPosition.setColumn((currentPosition.getColumn() + increase));
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

//    public void moveWhenPenIsDown(int noOfStep, SketchPad pad){
//        validateMove(noOfStep, pad);
//        if(pen.getState().equals(PenState.DOWN)){
//            write(noOfStep, pad);
//        }
//        move(noOfStep);
//    }
//
//    private void validateMove(int noOfStep, SketchPad pad){
//        int row = currentPosition.getRow();
//        int column = currentPosition.getColumn();
//        switch(currentDirection){
//            case EAST -> {
//                int newMove = column + noOfStep;
//                int sketchPadColumnLength = pad.getFloor()[row].length;
//                if(row + noOfStep > pad.getFloor().length);
//                if(newMove > sketchPadColumnLength) throw new InvalidMoveException("Turtle failed");
//            }
//        }
//    }
}
