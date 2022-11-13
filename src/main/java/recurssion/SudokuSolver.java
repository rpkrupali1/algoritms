package recurssion;

import java.util.ArrayList;

/**
 * Given a partially filled two-dimensional array,
 * fill all the unfilled cells such that each row, each column and each 3 x 3 subgrid (as highlighted below by bolder lines)
 * has every digit from 1 to 9 exactly once.
 * Unfilled cells have a value of 0 on the given board.
 * Example:
 * "board": [[8, 4, 9, 0, 0, 3, 5, 7, 0],
 * [0, 1, 0, 0, 0, 0, 0, 0, 0],
 * [7, 0, 0, 0, 9, 0, 0, 8, 3],
 * [0, 0, 0, 9, 4, 6, 7, 0, 0],
 * [0, 8, 0, 0, 5, 0, 0, 4, 0],
 * [0, 0, 6, 8, 7, 2, 0, 0, 0],
 * [5, 7, 0, 0, 1, 0, 0, 0, 4],
 * [0, 0, 0, 0, 0, 0, 0, 1, 0],
 * [0, 2, 1, 7, 0, 0, 8, 6, 5]]
 * Output:
 * [[8, 4, 9, 1, 6, 3, 5, 7, 2],
 * [3, 1, 5, 2, 8, 7, 4, 9, 6],
 * [7, 6, 2, 4, 9, 5, 1, 8, 3],
 * [1, 5, 3, 9, 4, 6, 7, 2, 8],
 * [2, 8, 7, 3, 5, 1, 6, 4, 9],
 * [4, 9, 6, 8, 7, 2, 3, 5, 1],
 * [5, 7, 8, 6, 1, 9, 2, 3, 4],
 * [6, 3, 4, 5, 2, 8, 9, 1, 7],
 * [9, 2, 1, 7, 3, 4, 8, 6, 5]]
 */
public class SudokuSolver {
    private static final int grid_size = 9;
    public static ArrayList<ArrayList<Integer>> solve_sudoku_puzzle(ArrayList<ArrayList<Integer>> board) {
        helper(board);
        return board;
    }

    private static boolean helper(ArrayList<ArrayList<Integer>> board){
        for (int i = 0; i < grid_size; i++) {
            for (int j = 0; j < grid_size; j++) {
                if(board.get(i).get(j)==0){
                    for (int k = 1; k <= grid_size; k++) {
                        if(isValid(board,k,i,j)){
                            board.get(i).set(j,k);
                            //recursion
                            if(helper(board))
                                return true;
                            else
                                board.get(i).set(j,0);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(ArrayList<ArrayList<Integer>> board,int number, int row, int column){
        return (!isNumberInRow(board,number,row) && !isNumberInColumn(board,number,column) &&
                !isNumberInBox(board,number,row,column));
    }

    private static boolean isNumberInRow(ArrayList<ArrayList<Integer>> board,int number,int row){
        for (int i = 0; i < grid_size; i++) {
            if(board.get(row).get(i)==number)
                return true;
        }
        return false;
    }

    private static boolean isNumberInColumn(ArrayList<ArrayList<Integer>> board,int number,int column){
        for (int i = 0; i < grid_size; i++) {
            if(board.get(i).get(column)==number)
                return true;
        }
        return false;
    }

    private static boolean isNumberInBox(ArrayList<ArrayList<Integer>> board,int number,int row, int column){
        int boxRowStart = row - row%3;
        int boxColumnStart = column-column%3;
        for (int i = boxRowStart; i < boxRowStart +3; i++) {
            for (int j = boxColumnStart; j < boxColumnStart + 3; j++) {
                if(board.get(i).get(j)==number)
                    return true;
            }
        }
        return false;
    }
}
