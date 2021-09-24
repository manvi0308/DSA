public class CandiesDam {
    static int maxCandy(int height[], int n) 
	{ 
	   int startPos = 0;
       int endPos = n - 1;
       int maxArea = 0;

       while(startPos < endPos)
       {
           int currArea = ((endPos - startPos) - 1) * Math.min(height[startPos], height[endPos]);
           maxArea = Math.max(currArea, maxArea);
           if(height[startPos] < height[endPos]){
               startPos++;
           }else{
               endPos--;
           }
       }
       return maxArea;
	}
    public static void main(String[] args) {
        int[] height = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maxCandy(height, height.length));
    }
}
