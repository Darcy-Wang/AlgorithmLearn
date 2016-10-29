/**
 * Created by WZZ on 10/29/2016.
 */
public class SearchMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0){
            return false;
        }
        //注意列也要再判断一次
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end =  row * col -1;
        int mid;

        while (start + 1 < end){
            mid = start + (end - start)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(matrix[midRow][midCol] == target) {
                return true;
            }else if( matrix[midRow][midCol] > target ){
                end = mid;
            }else if( matrix[midRow][midCol] < target ){
                start = mid;
            }
        }

        if (matrix[start/col][start%col] == target){
            return true;
        }
        if (matrix[end/col][end%col] == target){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(searchMatrix(matrix, 51));
    }
}
