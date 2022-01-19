/*
 * Given two strings string1 and string2, remove those 
 * characters from first string(string1) which are present
 * in second string(string2). Both the strings are different
 * and contain only lowercase characters.
*/
package strings;

/**
 * @author manvi0308
 */
public class RemoveCharacter {

	/**
	 * Complete the function removeChars() which takes string1 and string2 as input
	 * parameter and returns the result string after removing characters from
	 * string2 from string1.
	 * 
	 * 
	 * Expected Time Complexity:O( |String1| + |String2| ) Expected Auxiliary Space:
	 * O(K),Where K = Constant
	 * 
	 * APPROACH
	 * 1) Find the frequency of each character of String 2 and store it in a frequency array
	 * 2) Iterate over str1 and check if the character occurs in str2 using the frequency array
	 * 3) Make changes accordingly
	 */
	
	static int[] findFrequency(String str)
	{
		int[] freq = new int[256];
		for(int i = 0; i < str.length(); i++)
		{
			freq[str.charAt(i)]++;
		}
		return freq;
		
	}
	static String removeChars(String string1, String string2){
        // code here
		int[] freq = findFrequency(string2);
		int ip_idx = 0, res_idx =0;
		char[] ch1 = string1.toCharArray();
		while(ip_idx != ch1.length)
		{
			char temp = ch1[ip_idx];
			if(freq[temp] == 0)
			{
				ch1[res_idx] = ch1[ip_idx];
				res_idx++;
			}
			ip_idx++;
		}
		
		return string1.substring(0, res_idx);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaabbbbbccccdddd";
		// for testing findFrequency Function
		/*int[] freq = findFrequency(str1);
		for(int i = 0; i < freq.length; i++)
		{
			System.out.print(freq[i] + " ---- ");
		}*/
		String str2 = "abcdefg";
		System.out.println(removeChars(str1, str2));
	}

}
