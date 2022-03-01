package turtleGraphics;

public class Position {
    int row;
    int column;

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object toBeCompared){
        if(!toBeCompared.getClass().equals(this.getClass())) return false;
        Position compared = (Position) toBeCompared;
        if(this.row==compared.row && this.column == compared.column){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Position{" +
                "row = " + row +
                ", column = " + column +
                '}';
    }

    public int getColumn(){
        return column;
    }

    public void setColumn(int newColumn){
        this.column = newColumn;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int newRow){
        this.row = newRow;
    }


}
