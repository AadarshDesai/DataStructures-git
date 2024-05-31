package BasicMaths;

public class LCMAndGCD {
    public static void main(String[] args){
        Long a=(long) 354293, b=(long) 125208;
        Long[] ans = lcmAndGcd(a, b);
        for(Long item: ans){
            System.out.println(item);
        }
    }

    public static Long[] lcmAndGcd(Long A, Long B){
        Long[] ans = new Long[2];
        Long gcd = gcdValue(A, B);
        System.out.println(gcd);
        Long lcm = (A*B)/gcd;
        ans[0] = lcm;
        ans[1] = gcd;
        return ans;
    }

    public static Long gcdValue(Long a, Long b){
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
