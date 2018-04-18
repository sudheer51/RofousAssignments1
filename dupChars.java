package LavPack1;

public class dupChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String c [];

String strName = "abbaaccd";

int l=strName.length();
System.out.println("l "+l);
c = new String[l];

System.out.println("Length "+ l);
int j=1;
for (int i=0;i<=l-1;i++, j++)
	
{
	//System.out.println("i "+i+"SUBSTR "+strName.substring(i, j));
	
	c[i]=strName.substring(i,j);
//	System.out.println("C "+c[i]);
	
	}
for (int i=0;i<=l-1;i++)
	
{
	
	//System.out.println("Print "+c[i]);
	
	}
System.out.println("----------------------------");
//return;
 j=1;
 int ct=0;
 int k=0;
for (int i=0;i<=l-1;i++)
	
{
	
	//System.out.println("i "+i+"SUBSTRING 2nd for  "+c[i]);
	for (k=0;k<=l-1;k++)
	{
		//System.out.println("c  " + c[i] +" k " +c[k]);
	
		if (c[i].equals(c[k]))
		{
			ct = ct+1;
		
		}
	
	}
	System.out.println(c[i]+" occurs  "+ct+" times");
     ct=0;
     
	}



}
	}


