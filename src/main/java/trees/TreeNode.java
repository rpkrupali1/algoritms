package trees;

import java.util.ArrayList;

public class TreeNode {
    int value;
    ArrayList<TreeNode> children;
    public TreeNode(int value){
        this.value = value;
        this.children = new ArrayList<>(3);
    }
}
