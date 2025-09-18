package KhunalDSA.out.production.KhunalDSA.BinarySearch.BInary2D;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 6)));  // [1, 2]
        System.out.println(Arrays.toString(search(arr, 7)));  // [2, 0]
        System.out.println(Arrays.toString(search(arr, 10))); // [-1, -1]
    }

    // Standard binary search inside one row
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    // Main search in sorted 2D matrix
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return new int[]{-1, -1};  // handle empty matrix

        int cols = matrix[0].length;
        if (cols == 0) return new int[]{-1, -1};  // handle empty row

        // If only one row → do binary search directly
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // If only one column → search down that column
        if (cols == 1) {
            for (int r = 0; r < rows; r++) {
                if (matrix[r][0] == target) {
                    return new int[]{r, 0};
                }
            }
            return new int[]{-1, -1};
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Narrow down until only 2 rows remain
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have only two rows left: rStart and rStart+1

        // Check middle column directly
        if (matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        if (matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        // 4 quadrants:
        // 1st half of rStart
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 2nd half of rStart
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // 1st half of rStart+1
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // 2nd half of rStart+1
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
