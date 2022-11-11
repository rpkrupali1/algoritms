package recurssion;

import common.Common;

import java.util.ArrayList;

/**
 * Given an integer n, find all possible ways to position n queens on an n×n chessboard
 * so that no two queens attack each other. A queen in chess can move horizontally, vertically, or diagonally.
 * Do solve the problem using recursion first even if you see some non-recursive approaches.
 * Example One
 * input:  "n": 4
 * Output:
 * [["--q-","q---", "---q", "-q--"], ["-q--", "---q", "q---", "--q-"]]
 * There are two distinct ways four queens can be positioned on a 4×4 chessboard without attacking each other. The positions may appear in the output in any order. So the same two positions in different order would be another correct output.
 * Example Two
 * input "n": 2
 * Output:  [ ]
 */
public class NQueenProblem extends Common {

    private static final ArrayList<ArrayList<String>> result = new ArrayList<>();
    public static ArrayList<ArrayList<String>> recursive(int n) {
        int[] columns = new int[n];
        for (int i = 0; i < n; i++) {
            columns[i] =i;
        }
        helper(0,n,columns);
        return result;
    }

    private static void helper(int i, int n, int[] columns){
        if(is_valid(columns,i-1))
            return;
        else if (i==n) {
            result.add(construct(n,columns));
        }
        else {
            for (int j = i; j < n; j++) {
                swap(columns,i,j);
                helper(i+1,n,columns);
                swap(columns,i,j);
            }
        }
    }

    private static boolean is_valid(int[] columns, int previousQ){
        for (int i = 0; i < previousQ; i++) {
            if(columns[i]==columns[previousQ]
                    || Math.abs(i-previousQ)==Math.abs(columns[i]-columns[previousQ]))
                return true;
        }
        return false;
    }

    private static ArrayList<String> construct(int n, int[] columns){
        ArrayList<String> solution = new ArrayList<>();
        char[] chars = new char[n];
        for (int j = 0; j < n; j++) {
            chars[j]='-';
        }
        for (int j = 0; j < n; j++) {
            chars[columns[j]]='q';
            solution.add(new String(chars));
            chars[columns[j]]='-';
        }
        return solution;
    }
}
