package LavPack1;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={4,3,18,10,5};
		int l = arr1.length;
		for(int j=0;j<l;j++)
		{
			for(int i = 0;i<=l-2;i++)
			{ 
				int a = arr1[i];
				int b = arr1[i+1];
				int c=0;
				System.out.println("Inside for...."+"a"+a);
				System.out.println("Inside for...."+"b"+b);
				if (a > b)
				{
					System.out.println("Inside if");
					c=b;
					b=a;
					a=c;
					arr1[i]=a;
					arr1[i+1]=b;
					System.out.println("Inside if "+"a "+ a);
					System.out.println("Inside if "+"b "+ b);
				}
			}
		}	
		for(int i=0;i<l;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}	


