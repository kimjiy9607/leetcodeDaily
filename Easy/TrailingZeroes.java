import java.util.*;

class TrailingZeroes {
    public int tralingZeroes(int n){
        if(n<5) return 0;
        return (n/5) + trailingZeroes(n/5);
    }
}