package bst;

import java.util.HashMap;
import java.util.Map;

public class KSubstring {
	public static void main(String[] args)
	{
	    String s = "aabbcc";
	    int k = 2;
	    System.out.println(substrings(s, k));
	 
	    s = "aabbc";
	    k = 2;
	    System.out.println(substrings(s, k));
	}
	
	static int substrings(String s, int k) {
		int count=0;
		Map<Character,Integer> m;
		for(int i=0;i<s.length();i++) {
			m = new HashMap<Character,Integer>();
			for(int j=i;j<s.length();j++) {
				char st = s.charAt(j);
				if(m.containsKey(st)) {
					m.put(st, m.get(st)+1);
				}
				else {
					m.put(st, 1);
				}
				if(m.get(st) > k)
					break;
				else if(m.get(st) == k) {
					if(m.values().stream().filter(l->l==0||l==k).count() == m.size()) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
