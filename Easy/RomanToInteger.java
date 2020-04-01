import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s){
        if(s==null|| s.length()==0) return -1;
		Map<Character, Integer> hm = new HashMap<>();
		
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int res = 0;
		int prev = hm.get(s.charAt(0));
		for(int i=1;i<s.length();i++){
			int cur = hm.get(s.charAt(i));
			if(prev<cur) res-=prev;
			else{
				res+=prev;
			}
            prev = cur;
		}
		res+=hm.get(s.charAt(s.length()-1));
		return res;
    }
}