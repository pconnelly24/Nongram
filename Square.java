public class Square {
    
    public enum State{
        EMPTY,
        FILLED,
        X
    }

    // Start EMPTY by default
    private State state = State.EMPTY;

    private boolean canFill;
    private boolean canX;

    public boolean setState(State inState){
        state = inState;
        // Just to be safe incase I need to check for stuff later
        return true;
    }

    public State getState(){
        return state;
    }

    public boolean getCanX(){
        return canX;
    }
    public boolean getCanFill(){
        return canFill;
    }
    public void setCanX(){
        canX = true;
    }
    public void setCanFill(){
        canFill |= true;
    }
    public void resetCan(){
        canX = false;
        canFill = false;
    }
}
