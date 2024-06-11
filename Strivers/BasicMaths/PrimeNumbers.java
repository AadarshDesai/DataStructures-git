package Strivers.BasicMaths;

public class PrimeNumbers {
    public static void main(String[] args){
        int n = 8;
        System.out.println(countPrimes(n));
    }

    public static boolean countPrimes(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
}
