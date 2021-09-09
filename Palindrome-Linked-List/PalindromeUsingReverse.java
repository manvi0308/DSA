public class PalindromeUsingReverse
{
    
    Node head;
    Node secondHalf = head;
    
    // Insertion at Last
    public void insertAtLast(int data)
    {
        // Make a new node
        Node newNode = new Node(data);
        // if this is the first node
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        //return;
    }
    // A utility function to print the Linked List
    public void printList(Node head)
    {
        System.out.println("Printing the Linked List");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }
    
    // To check if Linked List is palindrome
    boolean isPalindrome(Node head)
    {
        // This will move by one step
        Node slow = head;
        // This will move by two steps
        Node fast = head;
        // This will keep track of the node previous to
        // the node pointed by slow
        Node prev_of_slow = head;
        
        /*  
        In case of odd sized lists, the middle element 
        need not to be a part of the second half. So making
        a separate variable to store it in case of odd-sized 
        lists. In even sized lists,this will be null
        */
        Node midNode = null;
        
        boolean result = true;
        
        // Proceeding further iff the List has atleast two elements
        // This is checked by the following condition specified in t
        // the if clause
        if(head != null && head.next != null)
        {
            // STEP 1: FINDING THE MIDDLE ELEMENT
            while(fast != null && fast.next != null)
            {
                fast = fast.next.next;
                prev_of_slow = slow;
                slow = slow.next;
            }
            /* fast would become NULL when there are even elements
               in the list and not NULL for odd elements. 
               the middle node is to be skipped for odd case 
               and store it somewhere so that the original list 
               can be restored
            */
            
            
            // Storing the middle element for odd size lists
            if(fast != null)
            {
              midNode = slow;
              slow = slow.next;
            }
            
            // Now regardless of odd or even elements
            // the slow pointer would point to the starting
            // of the second half of list
            secondHalf = slow;
            prev_of_slow.next = null;
            
            // STEP 2: Reverse the second half
            reverseList();
            
            // STEP 3: Comparing the reverse of second half
            // with the first half
            result = compareList(head, secondHalf);
            
            /* 
            STEP 4: Constructing the original linked list back
            
                1) Reverse the second half again.
                2) If the list was odd sized, then the midNode will not be Null
                The prev_of_slow.next will point to the midNode. The secondHalf will contain
                the elements next to middle node
                3) If the list was even sized, then the midNode will be null. The prev_of_slow
                will point to the secondHalf.
            */
            
            reverseList();
            
            if(midNode != null)
            {
                prev_of_slow = midNode;
                midNode.next = secondHalf;
            }
            else{
                prev_of_slow.next = secondHalf;
            }
        }
        
        return result;
    }
    
    /* Function to reverse the linked list */
    void reverseList()
    {
        Node prev = null;
        Node current = secondHalf;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;
    }
    
    /* Function to check if two input lists have same data*/
    boolean compareList(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
 
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }
 
        if (temp1 == null && temp2 == null)
            return true;
 
        /* Will reach here when one is NUll and other is not */
        return false;
    }
public static void main(String[]args)
{
    PalindromeUsingReverse ll = new PalindromeUsingReverse();
    // 1->Null
    ll.head = new Node(1);
    // 1->2->Null
    ll.insertAtLast(2);
    // 1->2->1->Null
    ll.insertAtLast(1);
    // 1->2->1->2->Null
    ll.insertAtLast(2);
    // 1->2->1->2->3->Null
    ll.insertAtLast(3);
        
    ll.printList(ll.head);
    if(ll.isPalindrome(ll.head))
        System.out.println("Palindrome Linked List");
    else
        System.out.println("Not a Palindrome Linked List");
        
  

}
}