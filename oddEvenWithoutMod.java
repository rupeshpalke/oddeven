import java.util.Scanner;
class OddEvenWithoutMod 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number :");
		int num = new Scanner(System.in).nextInt();
		System.out.println("The number is :"+num);
		boolean oddEven = (num/2)*2==num; //another logic num/2==num/2.0 
		System.out.println("Is the number "+num+" even ? "+oddEven);
	}
}
 