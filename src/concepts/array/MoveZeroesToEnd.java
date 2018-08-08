package concepts.array;

public class MoveZeroesToEnd
{

    /*
     * Move all zeroes to end of array Given an array of random numbers, Push all the zero’s of a given array to the end of the array. The order of all non zeros elements should be same
     * 
     * Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0}; Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
     * 
     * Input : arr[] = {1, 2, 0, 0, 0, 3, 6}; Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
     */
    public static void main(String[] args)
    {
	int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

	int[] arr2 = arr;

	for (int i = 0, j = arr.length - 1; ((i < arr.length) && (j >= 0)); i++)
	{

	    for (int num : arr)
	    {
		if (num == 0)
		{
		    arr2[i] = arr2[j--];
		    arr2[j--] = 0;
		}
	    }
	}
	for (int num : arr2)
	{
	    System.out.println(num);
	}
    }

}
