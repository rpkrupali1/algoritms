package LinkedList;

/**
 * Remove Duplicates from Node
 * Input Node: 6 1 2 2 3 4
 * Output: 1 2 3 4
 */
public class RemoveDuplicates {

    public static LinkedListNode removeDuplicates(LinkedListNode node){
        LinkedListNode newNode = node;
        while (newNode.next!=null){
            if(newNode.value==newNode.next.value)
                newNode.next = newNode.next.next;
            else
                newNode= newNode.next;
        }
        return node;
    }
}
