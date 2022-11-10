import java.security.acl.Group;

public class Tester {
    public static void main(String[] args) {
        int[][] rows = {{2, 1}, {1, 1, 1}, {5}, {6}, {1, 1, 1}, {6, 1}, {2, 1, 1, 3}, {2, 5}, {1, 3}, {2, 3}};
        int[][] colunms = {{5}, {3, 1}, {1, 1}, {2, 2}, {1, 1}, {8}, {2, 1}, {8}, {2, 4}, {4, 4}};
        Board testBoard = new Board(10, rows, colunms);
        testBoard.Solve();
        System.out.println(testBoard.printBoard());
    }
} 