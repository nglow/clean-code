package meaningfulname;


import java.util.ArrayList;
import java.util.List;

public class ClearIntent {

    /*
            TODO - Need value to measure & name to express unit
             */
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    /*
    TODO - Use name that reveals intent
     */
    public List<int[]> getThem(List<int[]> theList) {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    public static final int STATUS_VALUE = 0;
    public static final int FLAGGED = 4;

    public List<int[]> getFlaggedCellsV1(List<int[]> gameBoard) {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    public List<Cell> getFlaggedCellsV2(List<Cell> gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }

    static class Cell {

        private final int statusValue;

        public Cell(int statusValue) {
            this.statusValue = statusValue;
        }

        public boolean isFlagged() {
            return statusValue == 4;
        }
    }




}
