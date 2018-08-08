package concepts.array;

public class DesiredArraySteps
{
    /*
     * Count minimum steps to get the given desired array

Consider an array with n elements and value of all the elements is zero. We can perform following operations on the array.

opr-1 : Incremental operations:Choose 1 element from the array and increment its value by 1.
opr-2 : Doubling operation: Double the values of all the elements of array.

Example : Desired output of array required {2,3}

         Answer : 4

         Note : You just need to print no. of steps.

         Explanation : {0,0}
                       {1,0} opr-1 on 0th index
                       {1,1} opr-1 on 1st index
                       {2,2} opr-2
                       {2,3} opr-1 on 2nd index

	Example : Desired output of array required {2,7,1}

         Answer : 7

         Note : You just need to print no. of steps.

         Explanation : {0,0,0}
                       {0,1,0} opr-1 on 1st index
                       {0,2,0} opr-1 on 1st index
                       {0,3,0} opr-1 on 1st index
                       {1,3,0} opr-1 on 0th index
                       {2,6,0} opr-2 
                       {2,7,0} opr-1 on 1st index
                       {2,7,1} opr-1 on 2nd index
     */
 
    public static void main(String[] args)
    {

    }

}
