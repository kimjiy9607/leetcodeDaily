import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        if(s==null) return false;
        
        char[] sarr= new char[256];
        char[] tarr = new char[256];
        
        for(int i=0; i<s.length(); i++){
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if(sarr[sCh]==0 && tarr[tCh]==0){
                sarr[sCh]=tCh;
                tarr[tCh] = sCh;
            } else {
                if(sarr[sCh]!=tCh || tarr[tCh]!=sCh){
                    return false;
                }
            }
        }
        return true;
    }
}