package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void setUp(){
       turtle =  new Turtle();
    }

    @Test
    public void turtleExistTest(){
        assertNotNull(turtle);
    }

    @Test
    public void turtleHasAPenTest(){
        Pen pen = new Pen();
        assertNotNull(pen);
    }

    @Test
    public void  penHasAStateByDefaultTest(){
        Pen pen = turtle.getPen();
        assertSame(pen.getState(), PenState.UP);

    }

    @Test
    public void turtleCanMovePenDownTest(){
        Pen pen = this.turtle.getPen();
        this.turtle.penDown();
        assertSame(pen.getState(), PenState.DOWN);

    }

    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penDown();
        assertSame(this.turtle.getPen().getState(), PenState.DOWN);
        this.turtle.penUp();
        assertSame(this.turtle.getPen().getState(), PenState.UP);
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertSame(this.turtle.getCurrentDirection(), Direction.EAST);
//        when
        this.turtle.turnRight();
//        assert
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
//        when
        this.turtle.turnRight();
//        assert
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
    }

    @Test
    public void turtleCanTurnRight_whileFacingNorthTest(){
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
        this.turtle.turnRight();
        assertSame(this.turtle.getCurrentDirection(), Direction.EAST);
    }

    //todo direction north and west

    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest(){
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
    }

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest(){
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
        turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
    }
    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest(){
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.NORTH);
        this.turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.WEST);
        turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.SOUTH);
        turtle.turnLeft();
        assertSame(this.turtle.getCurrentDirection(), Direction.EAST);
    }

    @Test
    public void turtleCanMoveWhileFacingEastTest(){
        turtle.move(6);
        turtle.move(5);
        Position expected = new Position(0, 9);
        assertEquals(expected, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingSouthTest(){
        turtle.turnRight();
        turtle.move(6);
        Position expected = new Position(5, 0);
        assertEquals(expected, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.move(6);
        turtle.move(5);
        Position expected = new Position(0, -9);
        assertEquals(expected, turtle.getCurrentDirection());
    }
}