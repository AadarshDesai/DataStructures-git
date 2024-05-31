package BasicMaths;

public class Armstring {
    public static void main(String[] args){
        int n = 372;
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n){
        int temp = n;
        int finalNum = 0;
        while(n>0){
            int rem = n%10;
            finalNum = finalNum + (rem*rem*rem);
            n = n/10;
        }
        if(temp == finalNum){
            return true;
        }else{
            return false;
        }
    }
}
