public class Solution {
    // N meetings in one room
    // https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
    public static int maxMeetings(int[] start, int end, int n)
    {
        int cnt = 0;
        for (int i = 0; i < n; i++)
        {
            int j = i + 1;
            while (j < n && start[j] < end[i])
            {
                j++;
            }
            cnt += j - i - 1;
        }
        return cnt;
    }

}
