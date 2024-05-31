package BasicMaths;

public class AllDivisors {
    public static void main(String[] args){
        int n = 36;
        // ArrayList<Integer> ans = printDivisors(n);
        // Collections.sort(ans);
        // System.out.println(ans);
        System.out.println(sumOfDivisors(n));
    }

    // public static ArrayList<Integer> printDivisors(int n){
    //     //Bruteforce
    //     // for(int i=1; i<=n; i++){
    //     //     if(n%i == 0){
    //     //         System.out.print(i+" ");
    //     //     }
    //     // }

    //     //Better way ==> Time complexity = O(sqrt(n))
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     int sqrtN = (int) Math.sqrt(n);
    //     for(int i=1; i<=sqrtN; i++){
    //         if(n%i == 0){
    //             ans.add(i);
    //             if(n/i != i){
    //                 ans.add(n/i);
    //             }
    //         }
    //     }

    //     return ans;
    // }

    public static long sumOfDivisors(int N){
        long sum = 0;
       for(int i=1; i<=N; i++){
           for(int j=1; j*j<=i; j++){
               if(i%j == 0){
                   sum += j;
                   if(i/j != j){
                       sum += i/j;
                   }
               }
           }
       }
       return sum;
    }
}
