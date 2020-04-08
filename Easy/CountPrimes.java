import java.util.*;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n+1];
        int count=0;
        for(int i=2; i<n; i++){
            if(!notPrime[i]){
                count++;
                for(int j=i; j<=n/i; j++){
                    notPrime[i*j]=true;
                }
            }
        }
        return count;
    }
}