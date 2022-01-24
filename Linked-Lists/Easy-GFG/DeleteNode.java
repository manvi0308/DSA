/*
Delete xth node from a singly linked list. Your task is to complete the method deleteNode() which takes two arguments: the address of the head of the linked list and an integer x. The function returns the head of the modified linked list.

Example:
Input:
2
3
1 3 4
3
4
1 5 2 9
2

Output:
1 3
1 2 9

Explanation:
Testcase 1: After deleting the node at 3rd position 
(1-base indexing), the linked list is as 1-> 3.
Testcase 2: After deleting the node at 2nd position 
(1-based indexing), the linked list is as 1-> 2-> 9.
*/

class DeleteNode
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	// If the first node is to be deleted
	Node temp = head;
	if(x == 1)
	{
	    head = temp.next;
	   // temp.next = null;
	}
	else{
	    for(int i = 1; i < x - 1; i++)
	        temp = temp.next;
	    temp.next = temp.next.next;
	}
	return head;
    }
}
