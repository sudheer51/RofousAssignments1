package LavPack1;

public class javaExamplesStrrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "mom";
int l = s.length();
System.out.println(s+" Length  "+l);
String newchar ="";
String revstr ="";
for (int i=l-1;i>=0;i--,l--)
{
	System.out.println("i "+i+" l "+l);
	
	newchar=s.substring(i, l);
	revstr=revstr+newchar;
	System.out.println("Reverse   "+ revstr);
	
}
String Ns = new StringBuilder(s).reverse().toString();
System.out.println("String Ns "+Ns);
if(Ns.equals(s))
{
	
	System.out.println("String "+s+" is a Palindrome");
	}
else
{
	System.out.println("Not a Palindrome");
}
	}

}
