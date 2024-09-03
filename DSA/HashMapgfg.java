import java.util.*;
class Hashmapgfg {
	public static void prCharWithFreq(String s)
	{
        Map<Character, Integer> d
			= new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (d.containsKey(s.charAt(i))) {
				d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
			}
			else {
				d.put(s.charAt(i), 1);
			}
		}
        for (char ch:d.keySet()) {
            System.out.print(ch);
            System.out.print(d.get(ch)+ " ");
        }
    }
            public static void main(String[] args)
	{
		String S = "geeksforgeeks";
		prCharWithFreq(S);
	}
}
