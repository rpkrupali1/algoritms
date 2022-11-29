package common;

import LinkedList.LinkedListNode;
import trees.BinaryTreeNode;

import java.util.ArrayList;

public class ParentTest {
    private static final ArrayList<Integer> result = new ArrayList<>();
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
        for (ArrayList<Integer> integers : arr) {
            System.out.print("[ ");
            for (Integer integer : integers) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printList2(ArrayList<ArrayList<String>>arr){
        for (ArrayList<String> strings : arr) {
            System.out.print("[ ");
            for (String string : strings) {
                System.out.print(string);
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

    public ArrayList<Integer> convertToArray(LinkedListNode node){
        ArrayList<Integer> result = new ArrayList<>();
        while (node!=null){
            result.add(node.value);
            node = node.next;
        }
        return result;
    }

    public void print(LinkedListNode node){
        while (node!=null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }


    public ArrayList<Integer> getList(LinkedList.LinkedListNode node){
        ArrayList<Integer> result = new ArrayList<>();
        while (node!=null){
            result.add(node.value);
            node = node.next;
        }
        return result;
    }
}
