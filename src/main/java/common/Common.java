package common;
import java.util.ArrayList;
import java.util.LinkedList;

public class Common {
    public static void swap(ArrayList<Integer>arr,int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }

    public static void swap(LinkedList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2,temp);
    }

    public static String swap(String s, int index1, int index2){
        char[] chars = s.toCharArray();
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
        return new String(chars);
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(ArrayList<Integer>arr,int start){
        int i = start,j=arr.size()-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
