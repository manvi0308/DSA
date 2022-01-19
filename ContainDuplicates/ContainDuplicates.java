import java.util.*

public class ContainDuplicates
{
    public static boolean isDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == arr[i + 1])
            {
                return true;
            }
        }

        return false;
    }
public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 5, 1, 6, 7, 8};
    System.out.println(isDuplicate(arr));
}
}
