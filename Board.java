public class Board {
    
    private int size;
    private Square[][] board;

    private Line[] rows;
    private Line[] columns;

    public Board(int inSize, int[][] inRows, int[][] inColumns){
        this.size = inSize;
        board = new Square[size][size];

        // Fills the board with Squares
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Square(new Position(i, j));
            }
        }

        // Set up array lengths
        rows = new Line[inRows.length];
        columns = new Line[inColumns.length];

        // Rows
        for (int i = 0; i < inRows.length; i++) {
            Group[] rowGroups = new Group[inRows.length];
            for(int j = 0; j < inRows[i].length; j++){
                rowGroups[j] =  new Group(inRows[i][j]);
            }
            rows[i] = new Line(rowGroups, board[i]);
        }

        // Columns
        for (int i = 0; i < inColumns.length; i++) {
            Group[] colGroups = new Group[inColumns.length];
            for(int j = 0; j < inColumns[i].length; j++){
                colGroups[j] =  new Group(inColumns[i][j]);
            }

            Square[] colSquare = new Square[size];
            for (int j = 0; j < colSquare.length; j++) {
                colSquare[j] = board[j][i];
            }
            columns[i] = new Line(colGroups, colSquare);
        }
    }

    public void Solve(){
        // Solving plan!

        // New plan - check every possible alignment and see which are either always Filled or always X
        boolean changed = true;
        boolean done = false;
        while(changed && !done){
            boolean smallChange;
            for (Line row : rows) {
                smallChange = row.check();
                System.out.println(printBoard());
                if(smallChange){
                    break;
                }
            }
            changed |= smallChange;
            smallChange = false;
            for (Line column : columns) {
                smallChange = row.check();
                System.out.println(printBoard());
                if(smallChange){
                    break;
                }
            }
            changed |= smallChange;
            done = true;
        }
    }

    // Print it!
    public String printBoard(){
        String outString = "";
        for (Square[] row : board) {
            for (Square square : row) {
                switch(square.getState()){
                    case EMPTY:
                        outString += "0 ";
                    break;
                    case FILLED:
                        outString += "1 ";
                    break;
                    case X:
                        outString += "X ";
                    break;
                    default:
                        outString += "7 ";
                    break;
                }
            }
            outString +="\n";
        }
        return outString;
    }
}
