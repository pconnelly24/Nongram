public class Group {

    private enum Direction{
        HORIZONTAL,
        VERTICAL
    }

    private int size;
    private Square[] group;
    private Direction direction;

    public Group(int inSize, Direction inDir){
        this.size = inSize;
        this.direction = inDir;
    }

    public Direction getDir(){
        return direction;
    }

    public Square[] getGroup(){
        return group;
    }

    public int getSize(){
        return size;
    }
}
