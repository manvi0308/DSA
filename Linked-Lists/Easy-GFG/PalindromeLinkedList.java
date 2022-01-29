/* 
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
*/

class PalindromeLinkedList
{
    Node findMedian(Node head){
       Node slow=head,fast=head;
       while (fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
   }
   Node reverseLinkedList(Node prev,Node head){
       if (head==null){
           head=prev;
           return head;
       }
       else{
           Node headNext=head.next;
           head.next=prev;
           prev=head;
           head=headNext;
           return reverseLinkedList(prev,head);
       }
   }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
         Node head1=head;
       Node mid=findMedian(head);
       Node head2=reverseLinkedList(null,mid);
       while (head2 !=null){
           if (head1.data!=head2.data)return false;
           head1=head1.next;
           head2=head2.next;
       }
       return true;
    }    
}

