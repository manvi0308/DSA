/*
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
*/


class LevelOrderTraversal
{
    static Queue<Node> q = new ArrayDeque<Node>();
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        q.offer(node);
        
        while(q.isEmpty() == false){
            Node root = q.poll();
            arr.add(root.data);
            if(root.left != null)
                q.offer(root.left);
            if(root.right != null)
                q.offer(root.right);
        }
        
        return arr;
    }
}
