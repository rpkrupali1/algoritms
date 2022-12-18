package common;

import LinkedList.LinkedListNode;
import trees.BinaryTreeNode;

import java.util.ArrayList;

public class ParentTest {
    private static final ArrayList<Integer> result = new ArrayList<>();
    public <E> void print(ArrayList<E> arr){
        for (E element : arr) {
            System.out.print(element + " ");
        }
    }

    public static <E> void print(E[] arr){
        for (E j : arr) {
            System.out.print(j + " ");
        }
    }

    public void print(LinkedListNode node){
        while (node!=null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static <E> void printList(ArrayList<ArrayList<E>>arr){
        for (ArrayList<E> integers : arr) {
            System.out.print("[ ");
            for (E integer : integers) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
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

    public ArrayList<Integer> getList(LinkedList.LinkedListNode node){
        ArrayList<Integer> result = new ArrayList<>();
        while (node!=null){
            result.add(node.value);
            node = node.next;
        }
        return result;
    }
}
