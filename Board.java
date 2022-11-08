public class Board {
    
    private int size;
    private Square[][] board;
    private Groud[] groups;

    public Board(int inSize){
        this.size = inSize;
        board = new Square[size][size];

        // Sets up the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Square(new Position(i, j));
            }
        }
    }

    public void Solve(){
        // Solving plan!

        // Wave Function Collapse?
        bool changed = true;
        bool done = false;
        while(changed && !done){
            
        }
    }
}
