import java.util.HashSet;
import java.util.Set;
class MaximumXOR{

    public static int findMaximum(int[] arr){

        // The first step is to find the maximum number in
        // the array. Because we will take the number
        // of bits which are there in the binary 
        // representation of the maximum number

        // Finding the maximum number of the array
        int maxNum = arr[0];
        for(int i = 0; i < arr.length; i++){
            maxNum = Math.max(maxNum, arr[i]);
        }

        // Finding the number of bits in the maximum
        // number
        int maxBits = (Integer.toBinaryString(maxNum)).length();

        int maxXOR = 0;
        int currXOR;

        Set<Integer> prefix = new HashSet<>();

        // Step 2: Iterate over the bits of the number
        for(int i = maxBits - 1; i > -1; --i){

            // Left Shift maxXOR by 1 bit so that the next bit 
            // can be reached
            maxXOR <<= 1;

            // Set 1 in the smallest bit
            currXOR = maxXOR | 1;

            prefix.clear();

            // compute all possible prefixes of length maxBits - 1
            // in binary representation
            for(int num : arr){
                prefix.add(num >> i);
            }

            // Update the maxXOR, if any two of the prefixes
            // could result in currXOR

            for(int j: prefix){
                if(prefix.contains(currXOR^j)){
                    maxXOR = currXOR;
                    break;
                }
            }
        }
        return maxXOR;
    }
    public static void main(String[]args){
        int[] nums = {3, 10, 5, 15, 2, 8};
        System.out.println("Maximum XOR value in the array, arr is");
        System.out.println(findMaximum(nums));
    }
}