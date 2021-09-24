public class KQueues
{
    int k; // denoting the number of queues
    int n; // denoting the number of elements in each queue
    
    int[] arr; // will store the queue elements
    int[] frontQueue; // will store the front elements of all the k queues
    int[] rearQueue; // will store the rear elements of all the k queues
    int[] nextQueue; // will store the next elements index
    
    int free;
    // Constructor to initialize the values wherein K queues are
    // to be implemented in array, each queue is of size n
    KQueues(int k, int n)
    {
        this.k = k;
        this.n = n;
        this.arr = new int[n];
        
        // The frontQueue and rearQueue will be of size k
        this.frontQueue = new int[k];
        this.rearQueue = new int[k];
        
        // The nextQueue will be of size n
        this.nextQueue = new int[n];
        
        // Initializing the frontQueue and the rearQueue with -1
        // indicating all the queues are initially empty
        for(int i = 0; i < k; i++)
        {
            frontQueue[i] = rearQueue[i] = -1;
        }
        
        // Initializing all the spaces as free
        free = 0;
        for(int i = 0; i < n - 1; i++)
        {
            nextQueue[i] = i+1;
        }  
        
        //The last element in the nextQueue array will be -1
        nextQueue[n-1] = -1;
        
    }  // Constructor ends here
    
    // Method to check if queue number i is empty.
    // This method will return true if frontQueue[i] is -1 indicating
    // empty ith queue
    private boolean isQueueEmpty(int i)
    {
        return frontQueue[i] == -1;
    }
    
    // Methd to check of queue number i is full
    // This method will return true if free is -1
    private boolean isQueueFull(int i)
    {
        return free == -1;
    }
    
    // Method to insert an item in queue number q
    private void enqueue(int item, int q)
    {
        // Firstly check if the queue, 'q' is completely full.
        if(isQueueFull(q))
        {
            System.out.println("Queue Overflow");
            return;
        }
        
        // New element will be inserted in the next free space available
        // in the array. The nextQueue[] array is used for this purpose.
        int nextFreeSpace = nextQueue[free];
         
        // Case where the qth queue was empty then both the frontQueue[q]
        // as well as the rearQueue[q] needs to be updated
        if(isQueueEmpty(q)) {
            rearQueue[q] = frontQueue[q] = free;
            
        // Case where the qth queue is not empty, in this case only the
        // rearQueue[] and the nextQueue[] needs to be updated.
        }else {
            // Update next of rear and then rear for queue number 'j'
            nextQueue[rearQueue[q]] = free;
            rearQueue[q] = free;
        }
        
        
        nextQueue[free] = -1;
         
        // Put the item in array
        arr[free] = item;
         
        // Update index of free slot to index of next slot in free list
        free = nextFreeSpace;
    } // Method ends here
    
    // Method for removal of an item from the qth queue.
    private int dequeue(int q)
    {
        // Underflow condition check
        if(isQueueEmpty(q)){
            System.out.println("STACK UNDERFLOW");
            return Integer.MIN_VALUE;
        }
        
        // Find the index of the front item in qth queue
        int frontIndex = frontQueue[q];
        
        // Changing the value of frontQueue[q]
        frontQueue[q] = nextQueue[frontIndex];
        
        nextQueue[frontIndex] = free;
        free = frontIndex;
        int value = arr[frontIndex];
        arr[frontIndex] = 0;
        return value;
    }
    
    // The print function works as follows:
    // The frontQueue[q] stores the index of front element of qth queue of the array, arr[]
    // The rearQueue[q] stores the index of rear elements of the qth queue of the array, arr[]
    // So in order to print the qth queue, start from the frontQueue[q]th index and print the
    // elements till the rearQueue[q]th index.
    public void printQueue(int q)
    {
        int start = frontQueue[q];
        int end = rearQueue[q];
        
        while(start <= end)
        {
            System.out.print(arr[start] + " ");
            start++;
        }
    }
    public static void main(String[] args)
    {
        // Creating 3 queues each of size 3
        int k = 4, n = 20;
        KQueues obj = new KQueues(k, n);
        
        // Inserting 10 in the first queue
        obj.enqueue(10, 1);
        // Inserting 20 in the first queue
        obj.enqueue(20, 1);
        
        // queue 1 is now 10->20
        
        // Inserting 1 in the second queue
        obj.enqueue(1, 2);
        // Inserting 4 in the second queue
        obj.enqueue(4, 2);
        // Inserting 9 in the second queue
        obj.enqueue(9, 2);
        // Inserting 19 in the second queue
        obj.enqueue(19, 2);
        
        // queue 2 is now 1->4->9->19

        // Inserting 7 in the third queue
        obj.enqueue(7, 3);
        // Inserting 5 in the third queue
        obj.enqueue(5, 3);
        // Inserting 8 in the third queue
        obj.enqueue(8, 3);
        
        // queue 3 is now 7->5->8
        
        System.out.println("Printing the first queue");
        obj.printQueue(1);
        System.out.println("\nDequeued element from queue 1: " + obj.dequeue(1));
        System.out.println("Printing the first queue after dequeue operation");
        obj.printQueue(1);
        
        System.out.println("\nPrinting the second queue");
        obj.printQueue(2);
        System.out.println("\nDequeued element from queue 2: " + obj.dequeue(2));
        System.out.println("Printing the second queue after dequeue operation");
        obj.printQueue(2);
        
        System.out.println("\nPrinting the third queue");
        obj.printQueue(3);
        System.out.println("\nDequeued element from queue 3: " + obj.dequeue(3));
        System.out.println("Printing the third queue after dequeue operation");
        obj.printQueue(3);
        
    }
}