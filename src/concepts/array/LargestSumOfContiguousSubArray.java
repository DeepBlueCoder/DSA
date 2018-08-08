package concepts.array;

public class LargestSumOfContiguousSubArray
{

    /*
     * Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
     * 
     * Example : 1 3 -5 2 3 -1 8 6 -100 Answer : 18
     * 
     * Example : -12 -2 -4 -5 -3 Answer : -2
     */
    public static void main(String[] args)
    {

    }

    public static int[] largestSumOfContiguousSubArray_bruteForce(int arr[])
    {
	int sizeOfArray, startIndex, endIndex, sum, largestSum;
	sum = largestSum = 0;

	for (sizeOfArray = 1; sizeOfArray < arr.length; sizeOfArray++)
	{
	    for (startIndex = 0, endIndex = startIndex + sizeOfArray; endIndex < arr.length; startIndex++)
	    {
		for (int i = startIndex; i <= endIndex; i++)
		{
		    sum = sum + arr[i];

		    if (sum > largestSum)
			largestSum = sum;
		}
	    }
	}

	return null;
    }

}
