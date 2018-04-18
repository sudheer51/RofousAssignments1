package LavPack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapSudheer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Lavanya";  
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();      
        for(int i =0 ;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
            if(hashMap.containsKey(s.charAt(i)))
            {
                System.out.println("Duplicate Character :: "+ s.charAt(i));
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
            else
            {
                hashMap.put(s.charAt(i),1);
            }
        }
        //Retrieve the elements from hash map
        Set<Character> set = hashMap.keySet();
        Iterator<Character> it = set.iterator();
        while(it.hasNext())
        {
            Character ch = it.next();
            int value = hashMap.get(ch);
            System.out.println("Character :: " + ch + ":: Occurance::: "+ value);
        }
         
         
	}

}
