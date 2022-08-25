package javaPrograms;

public class PositiveAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		if(num==0)
		{
			System.out.println("Zero");
			
		}
		else
		{
			String result = num>0?"The number is positive":"The number is negative";
			
			System.out.println(result);
		}

	}

}
