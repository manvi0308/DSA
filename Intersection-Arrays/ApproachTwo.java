import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class ApproachTwo {
    //! A utility function to change an ArrayList to a normal array
    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
    public static int[] intersectHashMap(int[] nums1, int[] nums2)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //& Put the element of first array in hashamp
        for(int num: nums1)
        {
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num)+1);
            }
            else{
                hm.put(num, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        //& Iterate over elements of nums2 and if there is any element
        //& that is already present in hashmap, increase its count, remaining
        //& elements need to be added
        for(int num: nums2)
        {
            if(hm.containsKey(num) && hm.get(num) > 0)
            {
                result.add(num);
                int freq = hm.get(num);
                freq--;
                hm.put(num, freq);
            }
        }

        return listToArray(result);
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 0, 5, 3 };
        int[] arr2 = { 4, 1, 5, 2, 6 };
        int[] res = intersectHashMap(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
