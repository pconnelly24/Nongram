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

    public boolean isValid(){
        return true;
    }

    public void recursion(int[] inStartPos, Group[] ingroups, int movingPlace){
        // Cuts off the Recursion eventually
        if(movingPlace < inStartPos.length){


            int endPos = squares.length - groups[movingPlace].getSize();

            // If it is not the last group then look to the next group
            if(movingPlace != inStartPos.length - 1){
                endPos = inStartPos[movingPlace + 1] - groups[movingPlace].getSize();
            }

            // Try everything
            for (int i = 0; i < endPos; i++) {
                isValid();
                recursion(inStartPos, ingroups, movingPlace + 1);
            }
        }
    }

    public boolean check(){
        boolean changed = false;

        int[] startPos = new int[groups.length];
        for (int i = 1; i < startPos.length; i++) {
            startPos[i] = startPos[i - 1] + 1 + groups[i - 1].getSize(); // The +1 is for the X in between
        }

        // New Plan: Recursion Recursion Recursion
        recursion(startPos, groups, 0);

        return changed;
    }

    public Group[] getGroups(){
        return groups;
    }

    public Square[] getSquares(){
        return squares;
    }
}
