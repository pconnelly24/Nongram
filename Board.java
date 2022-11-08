public class Board {
    
    private int size;
    private Square[][] board;
    private Line[] lines;

    private int order;

    public Board(int inSize, int[] inRows, int[] inColumns){
        this.size = inSize;
        board = new Square[size][size];

        // Fills the board with Squares
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Square(new Position(i, j));
            }
        }

        // Sets up all of the Lines
        lines = new Line[inRows.length + inColumns.length];

        // Rows
        for (int i = 0; i < inRows.length; i++) {
            lines[i] = new Line(new Group(inLines[i].length), board[i]);
        }

        // Columns
        for (int i = 0; i < inColumns.length; i++) {
            Square[] colSquare = new Square[size];
            for (int j = 0; j < colSquare.length; j++) {
                colSquare[j] = board[j][i];
            }
            lines[i + inRows.length] = new Line(new Group(inLines[i].length), colSquare);
        }
    }

    public void Solve(){
        // Solving plan!

        // Rely on memoery adresses to access the same square in different groups

        // Wave Function Collapse?
        bool changed = true;
        bool done = false;
        while(changed && !done){
            for (Line line : lines) {
                order = line.check(order);
                printBoard();
            }
        }
    }

    public String printBoard(){
        String outString;
        for (Square[] row : board) {
            for (Square square : row) {
                switch(squares.getState()){
                    case EMPTY:
                        outString += "0 ";
                    break;
    
                    // The Square is Filled
                    case FILLED:
                        outString += "1 ";
                    break;
    
                    // The Square is and X
                    case X:
                        outString += "X ";
                    break;
                }
                outString += (str)square.getState();
            }
            outString +="\n";
        }
        return outString;
    }
}
