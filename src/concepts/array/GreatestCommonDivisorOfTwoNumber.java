package concepts.array;

public class GreatestCommonDivisorOfTwoNumber
{

    public static void main(String[] args)
    {
	int num;

	num = gcd_bruteForce_mod(0, 15);

	System.out.println(num);

    }

    public static int gcd_bruteForce_mod(int num1, int num2)
    {
	for (int i = Math.min(Math.abs(num1), Math.abs(num2)); i > 1; i--)

	    if ((num1 % i == 0) && (num2 % i == 0))
	    {
		return i;
	    }

	return num1 > num2 ? num1 : num2;
    }

    public static int gcd_substraction(int a, int b)
    {
	while (a != b)
	{
	    System.out.println(a + "\t" + b);
	    if (a > b)
		a = a - b;
	    else
		b = b - a;
	}
	return a;
    }

    public static int gcd_mod(int num1, int num2)
    {
	System.out.println(num1 + "\t" + num2);

	if (num2 == 0)
	    return num1;

	return gcd_mod(num2, num1 % num2);
    }
}