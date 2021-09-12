import java.util.Queue;
import java.util.LinkedList;

class sortQueueWithoutExtraSpace {
    // Method to return the minimum element's index in a queue
    // The method will check for the minimum element right from
    // front of the queue to the index/position specified

    // ! In this program, after the position of the index, element are sorted
    public static int findIndexOfMinimumElement(Queue<Integer> queue, int index) {
        // A general rule is that, if in a sequence minimum element is
        // to be found compare each element of the list with the maximum
        // possible value and vice versa
        int min_index = -1;
        int min_element = Integer.MAX_VALUE;

        // size() method returns the number of elements in the Queue
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            // peek() method retrieves but does not remove the head of the
            // linked list
            int curr_element = queue.peek();

            // poll() method retrieves and remove the head of the queue
            queue.poll();

            if (curr_element <= min_element && i <= index) {
                min_index = i;
                min_element = curr_element;
            }

            queue.add(curr_element);
        }
        return min_index;
    }

    // This function will insert the element
    // at index position to the rear of the queue
    public static void insertElementToRear(Queue<Integer> queue, int index) {
        // Currently we dont have access to the element at index position. This
        // parameter will store the value at index position as and when accessed in the
        // loop
        int min_value = 0;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            // Retrieve but do not remove the element from the front of the queue
            int element_at_front = queue.peek();
            queue.poll();
            if (i != index)
                queue.add(element_at_front);
            else
                min_value = element_at_front;

        }

        queue.add(min_value);
    }

    // Main function to sort a queue
    public static void sortQueue(Queue<Integer> queue) {
        for (int i = 0; i <= queue.size(); i++) {
            // Find the index of the minimum element from starting of queue to queue.size()
            // - i
            int index = findIndexOfMinimumElement(queue, queue.size() - i);
            // Insert the element at index position to the rear of the queue
            insertElementToRear(queue, index);
        }
    }

    public static void main(String[] args) {
        // Queue is an interface, we cannot directly create objects of queue
        // A class is needed which extends Queue to create an object
        Queue<Integer> q = new LinkedList<>();

        int[] arr = { 10, 5, 13, 40, 2 };

        // add() method inserts an element to the queue. This method returns true
        // upon success and IllegalStateException if no space is currently availab;e
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        // Printing the queue
        System.out.println("Printing the original queue");
        System.out.println(q);

        // Call to the sortQueue function. This will sort the queue
        sortQueue(q);

        // Printing the sorted queue
        System.out.println("Printing the sorted queue");
        System.out.println(q);
    }
}