public class Square {
    
    public enum State{
        EMPTY,
        FILLED,
        X
    }

    // Start EMPTY by default
    private State state = State.EMPTY;

    private Position position;

    private int order;

    // Constructor
    public Square(Position pos){
        this.position = pos;
    }

    public boolean setState(State inState, int inOrder){
        state = inState;
        order = inOrder;
        // Just to be safe incase I need to check for stuff later
        return true;
    }

    public State getState(){
        return state;
    }

    public int getOrder(){
        return order;
    }

    public Position getPos(){
        return position;
    }
}
