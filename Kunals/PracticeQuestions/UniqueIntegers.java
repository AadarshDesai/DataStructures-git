package Kunals.PracticeQuestions;

public class UniqueIntegers {
    public static void main(String[] args){
        int n = 5;
        for(int item: sumZero(n)){
            System.out.print(item+" ");
        }
    }

    public static int[] sumZero(int n){
        // List<Integer> temp = new ArrayList<>();
        // int[] res = new int[n];
        // if(n == 0){
        //     return new int[]{};
        // }else if(n == 1){
        //     return new int[]{0};
        // }else if(n%2 == 0){
        //     for(int i=1; i<=n/2; i++){
        //         temp.add(i);
        //         temp.add(i*-1);
        //     }
        // }else{
        //     temp.add(0);
        //     for(int i=1; i<=(n-1)/2; i++){
        //         temp.add(i);
        //         temp.add(i*-1);
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     res[i] = temp.get(i);
        // }
        // return res;

        int[] a = new int[n];
        int c = 1;
        int sum = 0;
        for(int i=0; i<n-1; i++){
            sum = sum + c;
            a[i] = c;
            c++;
        }
        a[n-1] = -1*sum;
        return a;
        
    }
}