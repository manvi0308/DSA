/**
 * 
 */
package findduplicates;
import java.util.HashSet;

/**
 * @author manvi0308
 *
 */
public class FindDuplicates {

	/**
	 * @param args
	 */
	// https://leetcode.com/problems/find-the-duplicate-number
	 public static int findDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        int dup = -1;
	        for(int i = 0; i < nums.length;i++) {
	        	if(!set.contains(nums[i])) {
	        		set.add(nums[i]);
	        	}
	        	else {
	        		dup = nums[i];
	        	}
	        }
	        return dup;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 2, 3, 4, 5};
		System.out.println(findDuplicate(arr));
	}

}
