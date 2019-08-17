package CodingTest_2019_07_13;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {


    private class Matrix {

        private final int fixedColumnCount; //counting 2
        private List<Column> columns;

        public Matrix(List<Column> columns, int fixedColumnCount) {
            this.columns = columns;
            this.fixedColumnCount = fixedColumnCount;
        }

        public void markRemainedAmbiguousColumn(int idx) {
            for (Column column : columns) {
                if (!column.isFixed()) {
                    column.markCell(idx, true);
                    column.setFixed(true);
                    return;
                }
            }
        }

        public int getFixedColumnCount() {
            return fixedColumnCount;
        }

        private String toStringRow(int idx) {
            StringBuilder rowStringBuilder = new StringBuilder();
            for (Column column : columns) {
                if (column.isMarkedCell(idx)) {
                    rowStringBuilder.append("1");
                } else {
                    rowStringBuilder.append("0");
                }
            }

            return rowStringBuilder.toString();
        }

        @Override
        public String toString() {
            String upperRow = toStringRow(0);
            String lowerRow = toStringRow(1);
            return upperRow + "," + lowerRow;
        }
    }

    private class Column {

        private boolean[] cells;
        private boolean fixed;

        public Column(boolean upperCell, boolean lowerCell, boolean fixed) {
            this.cells = new boolean[]{upperCell, lowerCell};
            this.fixed = fixed;
        }

        public void setFixed(boolean fixed) {
            this.fixed = fixed;
        }

        public boolean isFixed() {
            return fixed;
        }

        public void markCell(int idx, boolean mark) {
            this.cells[idx] = mark;
        }

        public boolean isMarkedCell(int idx) {
            return this.cells[idx];
        }
    }

    private Column makeColumn(int num) {
        if (num == 2) {
            return new Column(true, true, true);
        } else if (num == 0) {
            return new Column(false, false, true);
        } else {
            return new Column(false, false, false);
        }
    }

    private Matrix makeAmbiguousMatrix(int U, int L, int C[]) {
        int fixedColumnCount = 0; //counting 2
        int ambiguousColumnCount = 0; // counting 1
        List<Column> columns = new ArrayList<>();
        for (int num : C) {
            Column column = makeColumn(num);
            if (column.isFixed()) {
                if (column.isMarkedCell(0) && column.isMarkedCell(1)) {
                    fixedColumnCount++;
                }
            } else if (!column.isFixed()) {
                ambiguousColumnCount++;
            }
            columns.add(column);
        }
        if ((U + L - (fixedColumnCount * 2)) != (ambiguousColumnCount)) {
            throw new IllegalArgumentException("Impossible Case");
        }
        return new Matrix(columns, fixedColumnCount);
    }

    public void makeCompleteMatrix(Matrix matrix, int U, int L) {
        //mark upper row
        for (int i = 0; i < U; i++) {
            matrix.markRemainedAmbiguousColumn(0);
        }
        //mark lower row
        for (int i = 0; i < L; i++) {
            matrix.markRemainedAmbiguousColumn(1);
        }
    }

    public String solution(int U, int L, int[] C) {
        Matrix matrix;
        try {
            matrix = makeAmbiguousMatrix(U, L, C);
        } catch (IllegalArgumentException e) {
            return "IMPOSSIBLE";
        }
        makeCompleteMatrix(matrix, U - matrix.getFixedColumnCount(),
            L - matrix.getFixedColumnCount());
        return matrix.toString();
    }

    public static void main(String[] args) {
        Problem1 sol = new Problem1();
        System.out.println(sol.solution(3, 2, new int[]{2, 1, 1, 0, 1}));
        System.out.println(sol.solution(2, 3, new int[]{0, 0, 1, 1, 2}));
        System.out.println(sol.solution(2, 2, new int[]{2, 0, 2, 0}));
        System.out.println(sol.solution(4,3, new int[]{2,2,1,1,0,1}));
    }
}
