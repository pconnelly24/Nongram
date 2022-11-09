import java.security.acl.Group;

public class Tester {
    public static void main(String[] args) {
        int[][] rows = {{2, 1}, {2}, {1, 1}, {3}, {3}};
        int[][] colunms = {{2}, {2}, {3}, {1, 2}, {3}};
        Board testBoard = new Board(5, rows, colunms);
        testBoard.Solve();
    }
}
