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

    public int check(int inOrder){
        int gap;
        Group curGroup = groups[0];
        for (int i = 0; i < squares.length; i++) {
            switch(squares[i].getState()){
                // The Square is Empty
                case EMPTY:
                    gap++;
                break;

                // The Square is Filled
                case FILLED:

                break;

                // The Square is and X
                case X:
                    if(curGroup.getSize() == gap){
                        for (int j = i - curGroup.getSize(); j < i; j++) {
                            squares[j].setState(State.FILLED, inOrder);
                            curGroup.setSquare(squares[j], j);
                            inOrder ++;
                        }
                    }
                    else if(curGroup.getSize() * 2 > gap){
                        for (int j = i - (int)(curGroup.getSize() / 2f); j < i - (int)(curGroup.getSize() / 2f); j++) {
                            squares[j].setState(State.FILLED, inOrder);
                            curGroup.setSquare(squares[j], j);
                            inOrder ++;
                        }
                    }
                    gap = 0;
                break;

                // Uh oh
                default:

                break;
            }
        }
        if(gap > 0){
            if(curGroup.getSize() == gap){
                for (int j = i - curGroup.getSize(); j < i; j++) {
                    squares[j].setState(State.FILLED, inOrder);
                    curGroup.setSquare(squares[j], j);
                    inOrder ++;
                }
            }
            else if(curGroup.getSize() * 2 > gap){
                for (int j = i - (int)(curGroup.getSize() / 2f); j < i - (int)(curGroup.getSize() / 2f); j++) {
                    squares[j].setState(State.FILLED, inOrder);
                    curGroup.setSquare(squares[j], j);
                    inOrder ++;
                }
            }
        }
        return inOrder;
    }

    public Group[] getGroups(){
        return groups;
    }

    public Square[] getSquares(){
        return squares;
    }
}
