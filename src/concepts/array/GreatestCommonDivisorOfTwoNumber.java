package concepts.array;

public class GreatestCommonDivisorOfTwoNumber
{

    public static void main(String[] args)
    {
	int num = GCD_BruteForce_mod(-4, -2);
	System.out.println(num);

	
	System.out.println(18%12);
	
	System.out.println(12%18);
    }

    public static int GCD_BruteForce_mod(int num1, int num2)
    {
	/*
	 * if (num1 > num2) { for (int i = num2; i > 1; i--) { if ((num1 % i == 0) && (num2 % i == 0)) return i; } }
	 * 
	 * else if (num1 == num2) return num1;
	 * 
	 * else for (int i = num1; i > 1; i--) { if ((num1 % i == 0) && (num2 % i == 0)) return i; }
	 */

	for (int i = Math.min(Math.abs(num1), Math.abs(num2)); i > 1; i--)
	    if ((num1 % i == 0) && (num2 % i == 0))
		return i;

	return 1;
    }

    public static int GCD_BruteForce_substraction(int num1, int num2)
    {

	return 1;
    }
}
