public class Group {

    private int size;
    private Square[] squares;

    public Group(int inSize){
        this.size = inSize;
    }

    public Square[] getSquares(){
        return squares;
    }

    public void setSquare(Square inSquare, int pos){
        squares[pos] = inSquare;
    }

    public int getSize(){
        return size;
    }
}
