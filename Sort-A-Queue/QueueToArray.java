import java.util.*;
public class QueueToArray {
    // Convert queue to array
    public static int[] queueToArray(Queue<Integer> q)
    {
        int[] arr = new int[q.size()];

        for(int i = 0; i < q.size(); i++)
        {
            arr[i] = q.poll();
        }
        return arr;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(4);
        q.add(19);
        q.add(0);
        int[] res = QueueToArray.queueToArray(q);
        for(int i = 0; i < res.length; i++)
        {
            System.out.println(res[i] + " ");
        }
    }
}
