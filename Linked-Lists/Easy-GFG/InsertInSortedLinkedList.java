/* 
Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.

Example 1:

Input:
LinkedList: 25->36->47->58->69->80
data: 19
Output: 19 25 36 47 58 69 80
Example 2:

Input:
LinkedList: 50->100
data: 75
Output: 50 75 100
*/

class InsertInSortedLinkedList {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        Node temp;
        if(head1 == null || head1.data >= key)
        {
            newNode.next = head1;
            head1 = newNode;
        }
        
        else{
            temp = head1;
            while(temp.next != null && temp.next.data < key)
            {
                temp = temp.next;
            }
            
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head1;
    }
}
