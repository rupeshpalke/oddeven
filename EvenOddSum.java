class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num = 7892;
		int dup = num;
		int evenSum = 0;
		int oddSum = 0; 
		int rem = 0; 
		int temp = 0;

		rem = num % 10;
		temp = (rem%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);

		num = num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum = evenSum+rem):(oddSum = oddSum + rem);

		System.out.println("The sum of even numbers of "+dup+" is "+evenSum);
		System.out.println("The sum of odd numbers of "+dup+" is "+oddSum);
	}
}
