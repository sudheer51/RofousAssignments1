package LavPack1;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15, b= 30, c=20;
		
		int highest;
		highest = (a>b && a>c) ? a : b>c ? b : c;
		System.out.println(highest);
		
		
		if (a > b && a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > c)
		{
			System.out.println("B is greater");
		}
		else 
		{ 
			System.out.println("C is greater");
		}

	}

}
