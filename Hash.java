package LavPack1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Hash {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Lavanya";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			System.out.println("Character "+str.charAt(i));
	
			if (hm.containsKey(str.charAt(i)))
			{
				System.out.println("Duplicate");
				int n = hm.get(str.charAt(i))+1;
				hm.put(str.charAt(i),n);
				System.out.println("Get "+hm.get(str.charAt(i)));
			}
			else{
				hm.put(str.charAt(i),1);
			}
			System.out.println("Character in hm"+hm.get(str.charAt(i)));
		}
		Set<Character> charset = hm.keySet();
		Iterator<Character> it = charset.iterator();
		
		while(it.hasNext())
		{
			
			char ch = it.next();
			int pos = hm.get(ch);
			System.out.println("Character "+ch+" occurs "+pos+" times");
		}
	}
	
}




