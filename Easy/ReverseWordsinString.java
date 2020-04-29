import java.util.*;

public class ReverseWordsinString {
    public String reverseWords(String s){
        if(s==null || s.length()==0) return "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String space="";
        for(String str:arr){
            sb.append(space);
            sb.append(reverse(str));
            space = " ";
        }
        return sb.toString();
    }

    private String reverse(String str){
        int s=0; int e = str.length()-1;
        char[] charr = str.toCharArray();
        while(s<e){
            char tmp = charr[e];
            charr[e] = charr[s];
            charr[s] = tmp;
            s++; e--;
        }
        
        return String.valueOf(charr);
    }
}