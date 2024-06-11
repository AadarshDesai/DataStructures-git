package Strivers.BasicMaths;

public class GCDEuclidean{
    public static void main(String[] args){
        Long a = (long) 354293, b = (long)125208;
        System.out.println(gcd(a,b));
    }

    public static Long gcd(Long a, Long b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
}