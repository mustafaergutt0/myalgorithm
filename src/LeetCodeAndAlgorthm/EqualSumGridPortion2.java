package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Map;

public class EqualSumGridPortion2 {

    static void main() {
    }

    public boolean canPartitionGrid(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        long verticalUp = 0;
        long horizontalLeft = 0;
        long toplam = 0;

        HashMap<Integer, Integer> AllofElement = new HashMap<>();
        HashMap<Integer, Integer> Allofelement2 = new HashMap<>();
        HashMap<Integer, Integer> mapforVertical = new HashMap<>();
        HashMap<Integer, Integer> mapforHorizontal = new HashMap<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                toplam += grid[i][j];
                int val = grid[i][j];
                AllofElement.put(val, AllofElement.getOrDefault(val, 0) + 1);
                Allofelement2.put(val, Allofelement2.getOrDefault(val, 0) + 1);
            }
        }

        // 1. Dikey Kesim (Row-wise)
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col; j++) {
                int val = grid[i][j];
                verticalUp += val;
                int count = AllofElement.get(val);
                if (count > 1) AllofElement.put(val, count - 1);
                else AllofElement.remove(val);
                mapforVertical.put(val, mapforVertical.getOrDefault(val, 0) + 1);
            }

            long fark = toplam - verticalUp;
            if (verticalUp == fark) return true;

            if (i == 0 && i == row - 2) {   // bu şu demek iki satırlı bizde marriks varsa ortaki elemanlar çıkraıalbilri
                if (fark > verticalUp) {
                    long x = fark - verticalUp;
                    if (x == grid[row - 1][0] || x == grid[row - 1][col - 1]) return true;
                } else {
                    long x = verticalUp - fark;
                    if (x == grid[0][0] || x == grid[0][col - 1]) return true;
                }
            } else if (i == 0) {
                if (fark > verticalUp) {
                    long x = fark - verticalUp;

                    int remainRows = row - (i + 1);
                    int remainCols = col;

                    if (remainRows == 1) {
                        if (x == grid[row - 1][0] || x == grid[row - 1][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[i + 1][0] || x == grid[row - 1][0]) return true;
                    } else {
                        if (safeContains(AllofElement, x)) return true;
                    }
                } else {
                    long x = verticalUp - fark;
                    if (x == grid[0][0] || x == grid[0][col - 1]) return true;
                }
            } else if (i == row - 2) {
                if (fark > verticalUp) {
                    long x = fark - verticalUp;
                    if (x == grid[row - 1][0] || x == grid[row - 1][col - 1]) return true;
                } else {
                    long x = verticalUp - fark;

                    int remainRows = i + 1;
                    int remainCols = col;

                    if (remainRows == 1) {
                        if (x == grid[0][0] || x == grid[0][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][0] || x == grid[i][0]) return true;
                    } else {
                        if (safeContains(mapforVertical, x)) return true;
                    }
                }
            } else {
                if (fark > verticalUp) {
                    long x = fark - verticalUp;

                    int remainRows = row - (i + 1);
                    int remainCols = col;

                    if (remainRows == 1) {
                        if (x == grid[i + 1][0] || x == grid[i + 1][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[i + 1][0] || x == grid[row - 1][0]) return true;
                    } else {
                        if (safeContains(AllofElement, x)) return true;
                    }
                } else {
                    long x = verticalUp - fark;

                    int remainRows = i + 1;
                    int remainCols = col;

                    if (remainRows == 1) {
                        if (x == grid[0][0] || x == grid[0][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][0] || x == grid[i][0]) return true;
                    } else {
                        if (safeContains(mapforVertical, x)) return true;
                    }
                }
            }
        }

        // 2. Yatay Kesim (Col-wise)
        for (int i = 0; i < col - 1; i++) {
            for (int j = 0; j < row; j++) {
                int val = grid[j][i];
                horizontalLeft += val;
                int count = Allofelement2.get(val);
                if (count > 1) Allofelement2.put(val, count - 1);
                else Allofelement2.remove(val);
                mapforHorizontal.put(val, mapforHorizontal.getOrDefault(val, 0) + 1);
            }

            long fark = toplam - horizontalLeft;
            if (horizontalLeft == fark) return true;

            if (i == 0 && i == col - 2) {
                if (fark > horizontalLeft) {
                    long x = fark - horizontalLeft;
                    if (x == grid[0][col - 1] || x == grid[row - 1][col - 1]) return true;
                } else {
                    long x = horizontalLeft - fark;
                    if (x == grid[0][0] || x == grid[row - 1][0]) return true;
                }
            } else if (i == 0) {
                if (fark > horizontalLeft) {
                    long x = fark - horizontalLeft;

                    int remainRows = row;
                    int remainCols = col - (i + 1);

                    if (remainRows == 1) {
                        if (x == grid[0][i + 1] || x == grid[0][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][col - 1] || x == grid[row - 1][col - 1]) return true;
                    } else {
                        if (safeContains(Allofelement2, x)) return true;
                    }
                } else {
                    long x = horizontalLeft - fark;
                    if (x == grid[0][0] || x == grid[row - 1][0]) return true;
                }
            } else if (i == col - 2) {
                if (fark > horizontalLeft) {
                    long x = fark - horizontalLeft;
                    if (x == grid[0][col - 1] || x == grid[row - 1][col - 1]) return true;
                } else {
                    long x = horizontalLeft - fark;

                    int remainRows = row;
                    int remainCols = i + 1;

                    if (remainRows == 1) {
                        if (x == grid[0][0] || x == grid[0][i]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][0] || x == grid[row - 1][0]) return true;
                    } else {
                        if (safeContains(mapforHorizontal, x)) return true;
                    }
                }
            } else {
                if (fark > horizontalLeft) {
                    long x = fark - horizontalLeft;

                    int remainRows = row;
                    int remainCols = col - (i + 1);

                    if (remainRows == 1) {
                        if (x == grid[0][i + 1] || x == grid[0][col - 1]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][i + 1] || x == grid[row - 1][i + 1]) return true;
                    } else {
                        if (safeContains(Allofelement2, x)) return true;
                    }
                } else {
                    long x = horizontalLeft - fark;

                    int remainRows = row;
                    int remainCols = i + 1;

                    if (remainRows == 1) {
                        if (x == grid[0][0] || x == grid[0][i]) return true;
                    } else if (remainCols == 1) {
                        if (x == grid[0][0] || x == grid[row - 1][0]) return true;
                    } else {
                        if (safeContains(mapforHorizontal, x)) return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean safeContains(Map<Integer, Integer> map, long x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) return false;
        return map.containsKey((int) x);
    }

}