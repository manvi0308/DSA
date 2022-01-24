/* Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(), which returns the count of all pairs from both lists whose sum is equal to the given value X.
Note: The 2 numbers of a pair should be parts of different lists.

Example 1:

Input:
L1 = 1->2->3->4->5->6
L2 = 11->12->13
X = 15
Output: 3
Explanation: There are 3 pairs that
add up to 15 : (4,11) , (3,12) and (2,13)*/


class CountPairs {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count = 0;
        Set<Integer> mySet = new HashSet<Integer>();
        for(int i = 0; i < head1.size(); i++)
        {
            mySet.add(head1.get(i));
        }
        
        for(int i = 0; i < head2.size(); i++)
        {
           if(mySet.contains(x - head2.get(i))){
               count++;
           }
        }
        
        return count;
        
    }
}
