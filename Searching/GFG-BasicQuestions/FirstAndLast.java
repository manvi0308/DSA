package searching.gfg.BasicQ;
import java.util.*;
public class FirstAndLast {
	
	
	public static ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
		ArrayList<Integer> res = new ArrayList<>();
        int ct1  = 0, ct2 = 0;
        int f = 0, l = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x && ct1 == 0)
            {
                ct1++;
                f = i;
                //return;
            }
            if(arr[n-i-1] == x && ct2 == 0)
            {
                ct2++;
                l = n-i-1;
            }
            if(ct1 != 0 && ct2 != 0)
            {
                res.add(f);
                res.add(l);
                return res;
            }
        }
        
        res.add(-1);
        return res;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 2, 2, 2, 3, 4, 5};
		ArrayList<Integer> res = firstAndLast(arr, arr.length, 2);
		System.out.println(res);


	}

}
