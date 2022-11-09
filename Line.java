import Square.State;

public class Line {
    private enum Direction{
        HORIZONTAL,
        VERTICAL
    }

    public final Direction direction = Direction.HORIZONTAL;

    private Group[] groups;

    private Square[] squares;

    public Line(Group[] inGroups, Square[] inSquares){
        this.groups = inGroups;
        this.squares = inSquares;
    }

    public boolean check(){
        boolean changed = false;

        

        return changed;
    }

    public Group[] getGroups(){
        return groups;
    }

    public Square[] getSquares(){
        return squares;
    }
}
