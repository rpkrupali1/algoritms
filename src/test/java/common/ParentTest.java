package common;

import trees.BinaryTreeNode;

import java.util.ArrayList;

public class ParentTest {
    private static ArrayList<Integer> result = new ArrayList<>();
    public void print(ArrayList<Integer> arr){
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    public void printStrings(ArrayList<String> arr){
        for (String integer : arr) {
            System.out.print(integer + " ");
        }
    }

    public static void printList(ArrayList<ArrayList<Integer>>arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j));
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printList2(ArrayList<ArrayList<String>>arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j));
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    public boolean isSorted(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i)>arr.get((i+1)))
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> convertToArray(BinaryTreeNode bst){
        if(bst==null)
            return result;
        result.add(bst.value);
        convertToArray(bst.left);
        convertToArray(bst.right);
        return result;
    }
}
