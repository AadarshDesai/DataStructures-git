package BasicMaths;

public class ReverseNumber {
    public static void main(String[] args){
        int n = -10400;
        System.out.println(reverse(n));
    }

    public static int reverse(int x){
        long finalNum = 0;
        while(x!=0){
            int lastDigit = x%10;
            finalNum = finalNum*10 + lastDigit;
            x = x/10;
        }
        if(finalNum < Integer.MIN_VALUE || finalNum > Integer.MAX_VALUE){
            return 0;
        }
        return (int)finalNum;
    }
}
